/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under the terms of the CPAL v1.0 license,
 * a copy of which has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.wikipedia.strategy;

import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.components.HttpBasicAuth;
import org.mule.api.annotations.rest.BasicAuthPassword;
import org.mule.api.annotations.rest.BasicAuthUsername;

/**
 * ConnectorConnectionStrategy
 *
 * @author MuleSoft, Inc.
 */
@HttpBasicAuth(configElementName = "config-type", headerName = "Authorization", friendlyName = "HttpBasicAuth")
public class ConnectorConnectionStrategy {

	/** The username to use to connect to WikiPedia */
	@Configurable
	@BasicAuthUsername
	private String username;

	/** The Password to connect to WikiPedia */
	@Configurable
	@BasicAuthPassword
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}