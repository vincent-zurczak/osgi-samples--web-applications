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

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import net.vzurczak.sample.api.MyService;

/**
 * @author Vincent Zurczak
 */
@Path( "/get-data" )
public class RestResource {

	private MyService myService;


	/**
	 * Constructor.
	 */
	public RestResource() {
		// nothing
	}


	/**
	 * Constructor.
	 * @param myService
	 */
	public RestResource( MyService myService ) {
		this.myService = myService;
	}


	@GET
	public Response getDataToDisplay() {

		String data = "No data.";
		if( this.myService != null )
			data = this.myService.getDataToDisplay();

		return Response.ok().entity( data ).build();
	}


	/**
	 * @return the myService
	 */
	public MyService getMyService() {
		return this.myService;
	}


	/**
	 * @param myService the myService to set
	 */
	public void setMyService( MyService myService ) {
		this.myService = myService;
	}
}
