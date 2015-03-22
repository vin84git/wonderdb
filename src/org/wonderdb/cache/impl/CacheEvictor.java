package org.wonderdb.cache.impl;

/*******************************************************************************
 *    Copyright 2013 Vilas Athavale
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *******************************************************************************/

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.wonderdb.cache.Cacheable;


public class CacheEvictor<Key, Data> implements Runnable {
	boolean finish = false;
	CacheBean cacheBean = null;
	CacheState cacheState = null;
	CacheLock cacheLock = null;
	boolean eagerCleanup = true;
	CacheEntryPinner pinner = CacheEntryPinner.getInstance();
	MemoryCacheMap<Key, Data> cacheMap = null;
	CacheHandler<Key, Data> cacheHandler = null;
	
	public CacheEvictor(boolean eagerCleanup, CacheBean cacheBean, CacheState cacheState, CacheLock cacheLock, MemoryCacheMap<Key, Data> cacheMap, 
			CacheHandler<Key, Data> cacheHandler) {
		this.eagerCleanup = eagerCleanup;
		this.cacheBean = cacheBean;
		this.cacheState = cacheState;
		this.cacheLock = cacheLock;
		this.cacheMap = cacheMap;
		this.cacheHandler = cacheHandler;
	}
	
	public void finish() {
		finish = true;
		cacheLock.notifyStartCleanup();
		cacheLock.notifyEagerCleanup();
	}
	
	public void run() {
		long lastRunTime = Long.MAX_VALUE;
		int size = cacheMap.listSize;
		long objCountAfterRun = cacheBean.getCleanupLowWaterMark();
		if (eagerCleanup) {
			objCountAfterRun = cacheBean.getCleanupHighWaterMark();
		}
		
		int bucket = 0;
		
//		System.out.println("starting cleanup thread");
		while (true) {
			if (finish) {
//				System.out.println("ending cleanup thread");
				return;
			}
			
			if (eagerCleanup) {
				cacheLock.waitOnEagerCleanup();
			} else {
				cacheLock.waitOnStartCleanup();
			}
			if (finish) {
				System.out.println("ending cleanup thread");
				return;
			}
//			System.out.println("wait over");
			if (cacheState.getTotalCount() <= objCountAfterRun) {
				continue;
			}
			
//			System.out.println("Starting eviction");
			while (true) {
				List<Cacheable<Key, Data>> list = cacheMap.getBucket(bucket, true);
				Set<Object> pinnedBlocks = new HashSet<>();
				try {
					for (int j = 0; j < list.size(); j++) {
						Cacheable<Key, Data> e = list.get(j);
						CacheEntryPinner.getInstance().pin(e.getPtr(), pinnedBlocks);
						if (!pinner.isPinned(e.getPtr()) && !cacheMap.isChanged(e.getPtr())) {
							if (eagerCleanup) {
								Cacheable<Key, Data> ref = cacheHandler.removeForEvict(e.getPtr());
								if (pinner.isPinned(e.getPtr()) || cacheMap.isChanged(e.getPtr())) {
									cacheMap.addIfAbsent(ref);
								}
							} else {
								if (e.getLastAccessTime() < lastRunTime) {
									Cacheable<Key, Data> ref = cacheHandler.removeForEvict(e.getPtr());
									if (pinner.isPinned(e.getPtr()) || cacheMap.isChanged(e.getPtr())) {
										cacheMap.addIfAbsent(ref);
									}
								}
							}
						}
					}
				} finally {
					cacheMap.returnBucket(bucket, true);
					bucket = ++bucket % size;
					CacheEntryPinner.getInstance().unpin(pinnedBlocks, pinnedBlocks);
				}

				if (cacheState.getTotalCount() <= objCountAfterRun) {
					break;
				}
				lastRunTime = System.currentTimeMillis();
			}			
		}
	}
}