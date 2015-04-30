package org.mule.modules.wikipedia.automation.testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.wikipedia.automation.RegressionTests;
import org.mule.modules.wikipedia.automation.SmokeTests;
import org.mule.modules.wikipedia.automation.WikiPediaTestParent;

public class PurgeInterwikiBackLinksTestCases extends WikiPediaTestParent {

	@Before
	public void setup() throws Exception {
		// TODO: Add setup required to run test or remove method
		initializeTestRunMessage("purgeInterwikiBackLinksTestData");
	}

	@After
	public void tearDown() throws Exception {
		// TODO: Add code to reset sandbox state to the one before the test was
		// run or remove
	}

	@Category({ RegressionTests.class, SmokeTests.class })
	@Test
	public void testPurgeInterwikiBackLinks() throws Exception {
		runFlowAndGetPayload("purge-interwiki-back-links");
	}

}
