package seleniumAutomation;

import java.util.ArrayList;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class ApsrtcAutomation
{
	public WebDriver driver;//null
	String name = "Ram"; //null
	Actions actions;
	public ApsrtcAutomation()
	{
	  System.out.println("My name :" + name);
	  System.setProperty("webdriver.chrome.driver",
	  "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe"); 
	  driver = new ChromeDriver(); // a new empty chrome browser will be opened
	  actions = new Actions(driver);
	}	
	String expected = "APSRTC Official Website for Online Bus Ticket Booking - APSRTConline.in";
	@Before
	public void launchApplication()
	{
		System.out.println("Test Case : Launch Application");
		driver.get("https://www.apsrtconline.in/");
		Assert.assertEquals(expected, driver.getTitle());
	}
	@Test
	public void bookTicket() throws InterruptedException
	{
		//driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		WebElement mySource = driver.findElement(By.xpath("//input[@name='source']"));
		actions.moveToElement(mySource).click().sendKeys("HYDERABAD").pause(1000).build().perform();
		//Thread.sleep(1000);		
		actions.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
		Thread.sleep(1000);
		actions.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		//driver.findElement(By.xpath("//a[text()='29']")).click();
		selectDate("4");
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	}
	
	@Test
	public void allKeyBoardActions() throws InterruptedException
	{
		WebElement fromCity = driver.findElement(By.xpath("//input[@name='source']"));//.sendKeys("HYDERABAD");
		Thread.sleep(1000);
		//Move - Mouse hover
		actions.moveToElement(fromCity).click().sendKeys("HYDERABAD").doubleClick().contextClick().build().perform();
		//actions.sendKeys(Keys.ENTER).perform();
	}
	@Test
	public void multipleWindows()
	{
		driver.findElement(By.xpath("//a[@title='TimeTable / Track']")).click();
		driver.findElement(By.xpath("//a[text()='All services Time Table & Tracking']")).click();
		Set<String> windows = driver.getWindowHandles();
		ArrayList<String> mywindows = new ArrayList<String>(windows);
		for(int i=0;i<mywindows.size();i++)
		{
			System.out.println(mywindows.get(i));
		}
		driver.switchTo().window(mywindows.get(1));
		System.out.println("Title of second window :" + driver.getTitle());
		driver.close(); // It will close the current active window
		//driver.quit(); // It will kill the chromedriver.exe process , all current windows will be closed
		driver.switchTo().window(mywindows.get(0));
		driver.findElement(By.xpath("//a[@title='Home']")).click();
		driver.quit();
		//driver.close();
	}
	
	public void selectDate(String jDate)
	{
		driver.findElement(By.xpath("//a[text()='"+jDate+"']")).click();
	}
	@Test
	public void navigateOnEachTab() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@title='Ticket Status']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Home']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Cancel Ticket']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Gallery']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Track Service']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Wallet']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Ticket Status']")).click();
	}
	public void navigateOnEachTabDynamic(String tabName) throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@title='"+tabName+"']")).click();
	}
	@Test
	public void dynamicXpath() throws InterruptedException
	{
		navigateOnEachTabDynamic("Wallet");
	}

}
