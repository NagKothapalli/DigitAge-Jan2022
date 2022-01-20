package inheritanceByObject;

import org.junit.Test;

public class ReusableComponents  // Is like service provider
{	
	int version ; //default - 0
	public ReusableComponents()
	{
		version = 20;
		System.out.println("Clear all cache");
		System.out.println("Open default browser as Google Chrome");
	}
	public ReusableComponents(String browser)
	{
		version = 20;
		System.out.println("Clear all cache");
		System.out.println("Open User Specific Browser :" + browser); // Chrome / FF / IE ...
		//if(browser == FF) then open FF else if .............
	}
	public ReusableComponents(int versionNumber)
	{
		version = versionNumber;
		System.out.println("Clear all cache");
		System.out.println("Open default browser as Google Chrome");
	}
	//----------------- Reusable Components -------------------------
	void launchApplication()
	{
		System.out.println("Update the version Number :" + version);
		System.out.println("RC : Launch Application from RC");
		//10 lines of code to launch application
	}
	protected void loginToApplication()
	{
		System.out.println("Update the version Number :" + version);
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
