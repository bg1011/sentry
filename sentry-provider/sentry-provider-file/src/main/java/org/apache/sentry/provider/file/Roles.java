/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sentry.provider.file;

import javax.annotation.Nullable;

import com.google.common.collect.ImmutableSet;

/**
 * Interface for getting roles for a specific database/group.
 * Perhaps this should be abstracted out further; right now it is currently
 * very database-model specific.
 */
public interface Roles {
  public ImmutableSet<String> getRoles(@Nullable String database, String group, Boolean isURI);
}
