package HeirrachialInheritance.copy;

import org.junit.Test;

public class ReusableComponents
{

	//----------------- Reusable Components -------------------------
	void launchApplication()
	{
		System.out.println("RC : Launch Application");
		//10 lines of code to launch application
	}
	protected void loginToApplication()
	{
		System.out.println("RC : Login To Application");
		//10 lines of code to login application
	}
	void logoutFromApplication()
	{
		System.out.println("RC : Logout From Application");
		//10 lines of code to logout application
	}
	protected void closeApplication()
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
	void open()
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
