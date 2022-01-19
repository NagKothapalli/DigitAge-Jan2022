package HeirrachialInheritance.copy;

import org.junit.Test;
//             child                       parent
public class TestCases_Module2 extends ReusableComponents
{
	//Access Modifiers : private , default , protected , public
	 //Private will work with in the class only .
	//We can not access private members of a class from a different class/package/project
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

}
