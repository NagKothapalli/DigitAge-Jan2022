package inheritanceByObject;

import org.junit.Test;
//             child               parent
public class TestCases //extends ReusableComponents   // Is Like  a customer
{
	//Signature to create an object / instance of a class : 
	 //Modifier  ClassName    instanceName = new Constructor();
	//public ReusableComponents rc = new ReusableComponents();
	//public ReusableComponents rc = new ReusableComponents(22);
	public ReusableComponents rc = new ReusableComponents("IE");
	//------------------  Test Cases -------------------------
	//Junit : Test Method should not have any -  arguments,outputs,static , must be public
	
	/*
	 * void launchApplication() {
	 * System.out.println("RC : Launch Application from TestCases"); //10 lines of
	 * code to launch application }
	 */
	@Test
	public  void composeAndSendAnEmail() //Java function
	{
		System.out.println("Test Case : ComposeAndSendAnEmail ");
		//launch 10 lines , login 15 lines , compose , send , logout , close
		rc.launchApplication();
		rc.loginToApplication();
		rc.compose();
		rc.send();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	@Test
	public  void replyToAnEmail() //Java function
	{
		System.out.println("Test Case : Reply to An Email");
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.reply();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	@Test
	public  void forwardAnEmail()
	{
		System.out.println("Test Case : Forward An Email");
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.forward();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	@Test
	public  void deleteAnEmail()
	{
		System.out.println("Test Case : Delete An Email");
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.delete();
		rc.logoutFromApplication();
		rc.closeApplication();
	}

}
