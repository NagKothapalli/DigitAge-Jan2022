package testBatches;

import org.junit.Test;

import testScenarios.TestCases;
//              child             parent
public class TestSuites extends TestCases
{
	//----------------- Test Suites ------------------------
	@Test
	public void smokeSuite()
	{
		System.out.println("Test Suite : SMOKE");
		composeAndSendAnEmail();
		forwardAnEmail();
	}
	@Test
	public void regressionSuite()
	{
		System.out.println("Test Suite : REGRESSION");
		composeAndSendAnEmail();
		forwardAnEmail();
		replyToAnEmail();
		deleteAnEmail();
	}

}
