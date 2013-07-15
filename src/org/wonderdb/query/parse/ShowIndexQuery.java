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
package org.wonderdb.query.parse;

import java.util.List;

import org.wonderdb.expression.AndExpression;
import org.wonderdb.parser.UQLParser.ShowIndexStmt;
import org.wonderdb.schema.CollectionColumn;
import org.wonderdb.schema.IndexMetadata;
import org.wonderdb.schema.SchemaMetadata;


public class ShowIndexQuery extends BaseDBQuery {
	String indexName;
	
	public ShowIndexQuery(ShowIndexStmt stmt){
		super(null, -1, null);
		indexName = stmt.indexName;
	}
	
	
	public String execute() {
		IndexMetadata idxMeta = SchemaMetadata.getInstance().getIndex(indexName);
		if (idxMeta == null) {
			return "\n";
		}
		StringBuilder builder = new StringBuilder();
		builder.append("Index Name: ").append(idxMeta.getIndex().getIndexName()).append("\n");
		builder.append("Collection Name: ").append(idxMeta.getIndex().getCollectionName()).append("\n");
		builder.append("Is unique: ").append(idxMeta.getIndex().isUnique()).append("\n");
		List<CollectionColumn> cols = idxMeta.getIndex().getColumnList();
		for (CollectionColumn col : cols) {
			builder.append(col.getColumnName())
			.append("\t")
			.append(getType(col.getCollectionColumnSerializerName()))
			.append("\n");
		}
		
		return builder.toString();
	}
	
	public static String getType(String s) {
		if (s.equals("is")) {
			return "int";
		}
		if (s.equals("ls")) {
			return "long";
		}
		if (s.equals("fs")) {
			return "float";
		}
		if (s.equals("ds")) {
			return "double";
		}
		if (s.equals("ss")) {
			return "string";
		}
		return s;
//		throw new RuntimeException("Invalid type");
	}


	@Override
	public AndExpression getExpression() {
		return null;
	}
}