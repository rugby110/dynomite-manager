/**
 * Copyright 2016 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.netflix.dynomitemanager.sidecore;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Configure Dynomite Manager via in-memory configuration options.
 */
public final class MemoryConfigSource extends AbstractConfigSource {

		private final Map<String, String> data = Maps.newConcurrentMap();

		@Override
		public int size() {
				return data.size();
		}

		@Override
		public String get(final String key) {
				return data.get(key);
		}

		@Override
		public void set(final String key, final String value) {
				data.put(key, value);
		}

}
