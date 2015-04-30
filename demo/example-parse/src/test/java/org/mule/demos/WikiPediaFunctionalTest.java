/**
 * Copyright (c) MuleSoft, Inc. All rights reserved. http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.md file.
 */
package org.mule.demos;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;


public class WikiPediaFunctionalTest extends FunctionalTestCase {
	@Override
	protected String getConfigResources() {
		return "example-parse.xml";
	}

	@Test
	/** Parses content and returns parser output.. */
	public void testWikiParse() throws Exception {
		lookupFlowConstruct("example-parseFlow").process(getTestEvent(""));
	}
}
