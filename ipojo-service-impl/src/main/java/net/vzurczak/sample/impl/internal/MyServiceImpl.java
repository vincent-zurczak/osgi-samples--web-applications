/**
 * Copyright 2014, Vincent Zurczak
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.vzurczak.sample.impl.internal;

import net.vzurczak.sample.api.MyService;

/**
 * @author Vincent Zurczak
 */
public class MyServiceImpl implements MyService {

	/* (non-Javadoc)
	 * @see net.vzurczak.sample.api.MyService#getDataToDisplay()
	 */
	@Override
	public String getDataToDisplay() {
		return "Hello World!";
	}
}
