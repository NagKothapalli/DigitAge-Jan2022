package coreConcepts;

import org.junit.Test;

public class GmailWithJunit
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
	//------------------  Test Cases -------------------------
	//Test Method should not have any -  arguments,outputs,static , must be public
	@Test
	public  void composeAndSendAnEmail() //Java function
	{
		System.out.println("Test Case : ComposeAndSendAnEmail ");
		//launch 10 lines , login 15 lines , compose , send , logout , close
		launchApplication();
		loginToApplication();
		compose();
		send();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public  void replyToAnEmail() //Java function
	{
		System.out.println("Test Case : Reply to An Email");
		launchApplication();
		loginToApplication();
		open();
		reply();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public  void forwardAnEmail()
	{
		System.out.println("Test Case : Forward An Email");
		launchApplication();
		loginToApplication();
		open();
		forward();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public  void deleteAnEmail()
	{
		System.out.println("Test Case : Delete An Email");
		launchApplication();
		loginToApplication();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
	}
	//----------------- Reusable Components -------------------------
	private void launchApplication()
	{
		System.out.println("RC : Launch Application");
		//10 lines of code to launch application
	}
	private void loginToApplication()
	{
		System.out.println("RC : Login To Application");
		//10 lines of code to login application
	}
	void logoutFromApplication()
	{
		System.out.println("RC : Logout From Application");
		//10 lines of code to logout application
	}
	private void closeApplication()
	{
		System.out.println("RC : Close Application");
		//10 lines of code to close application
	}
	void compose()
	{
		System.out.println("RC : Compose an Email");
	}
	public void send()
	{
		System.out.println("RC : Send an Email");
	}
	private void open()
	{
		System.out.println("RC : Open an Email");
	}
	public void reply()
	{
		System.out.println("RC : Reply to an Email");
	}
	public void forward()
	{
		System.out.println("RC : Forward an Email");
	}
	public void delete()
	{
		System.out.println("RC : Delete an Email");
	}
}
