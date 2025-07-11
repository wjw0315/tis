/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.qlangtech.tis.config.hive;

import com.qlangtech.tis.config.authtoken.UserToken;
import com.qlangtech.tis.config.hive.meta.IHiveMetaStore;
import com.qlangtech.tis.plugin.IdentityName;

/**
 * @author: 百岁（baisui@qlangtech.com）
 * @create: 2021-05-28 10:49
 **/
public interface IHiveConnGetter extends IdentityName {
    String PLUGIN_NAME = "HiveConn";
    String NAME_HIVESERVER2 = "Hiveserver2";

    String HIVE2_JDBC_SCHEMA = "jdbc:hive2://";

    public String getDbName();

    public UserToken getUserToken();

    public String getJdbcUrl();

    public String getMetaStoreUrls();

    public IHiveMetaStore createMetaStoreClient();


}
