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

package net.vzurczak.sample.servlet.internal;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

/**
 * @author Vincent Zurczak
 */
public class RestApplication extends Application {

	private final RestResource myRestResource;


	/**
	 * Constructor.
	 * @param myRestResource
	 */
	public RestApplication( RestResource myRestResource ) {
		this.myRestResource = myRestResource;
	}


	@Override
	public Set<Object> getSingletons() {

		HashSet<Object> set = new HashSet<Object> ();
		set.add( this.myRestResource );

		return set;
	}
}
