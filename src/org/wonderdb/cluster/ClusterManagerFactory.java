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
package org.wonderdb.cluster;

import org.wonderdb.cluster.zk.ZkClusterManager;
import org.wonderdb.server.WonderDBPropertyManager;

public class ClusterManagerFactory {
	private static ClusterManagerFactory instance = new ClusterManagerFactory();
	ClusterManager clusterManager = null;
	
	private ClusterManagerFactory() {
		String zkConnectProperty = WonderDBPropertyManager.getInstance().getZkConnString();
		if (zkConnectProperty == null || zkConnectProperty.length() == 0) {
			clusterManager = new DefaultClusterManager();
		} else {
			clusterManager = new ZkClusterManager();
//			((ZkClusterManager) clusterManager).init();
		}
	}
	
	public static ClusterManagerFactory getInstance() {
		return instance;
	}
	
	public ClusterManager getClusterManager() {
		return clusterManager;
	}
}