package org.mule.modules.wikipedia.automation.testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.wikipedia.automation.RegressionTests;
import org.mule.modules.wikipedia.automation.SmokeTests;
import org.mule.modules.wikipedia.automation.WikiPediaTestParent;

public class QueryListCheckUserLogTestCases extends WikiPediaTestParent {

	@Before
	public void setup() throws Exception {
		// TODO: Add setup required to run test or remove method
		initializeTestRunMessage("queryListCheckUserLogTestData");
	}

	@After
	public void tearDown() throws Exception {
		// TODO: Add code to reset sandbox state to the one before the test was
		// run or remove
	}

	@Category({ RegressionTests.class, SmokeTests.class })
	@Test
	public void testQueryListCheckUserLog() throws Exception {
		 runFlowAndGetPayload("query-list-check-user-log");
	}

}
