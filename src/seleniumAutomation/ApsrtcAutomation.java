package seleniumAutomation;

import java.util.ArrayList;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class ApsrtcAutomation extends GeneralUtility
{
	//Switch to window
	//Switch to alert
	//javascriptexecutor class to perfrom some click operations
	//select class in selenium to work with dropdown with select tag 
	//create anonymous object for select class
	//write  a custom method to return webelement 
	//write all actions class and js functions as utility functions
	//mouse hovering
	public WebDriver driver;//null
	String name = "Ram"; //null
	Actions actions;
	JavascriptExecutor js;
	ReadProperties testData;
	ApplicationUtilities appUtils;
	public ApsrtcAutomation()
	{
	  System.out.println("My name :" + name);
	  System.setProperty("webdriver.chrome.driver",
	  "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe"); 
	  driver = new ChromeDriver(); // a new empty chrome browser will be opened
	  actions = new Actions(driver);
	  js = (JavascriptExecutor)driver ; 
	  testData = new ReadProperties("TestData/Apsrtc.properties");
	  appUtils = new ApplicationUtilities(driver);
	}	
	String expected = "APSRTC Official Website for Online Bus Ticket Booking - APSRTConline.in";
	@Before
	public void launchApplication()
	{
		System.out.println("Test Case : Launch Application");
		//driver.get("https://www.apsrtconline.in/"); //prod  dev , qa , stage 
		String url = testData.readData("URL");
		driver.get(url);
		Assert.assertEquals(expected, driver.getTitle());
	}
	
	//DataDriven Test: Executing the same test case with multiple sets of Data .
	@Test
	public void bookTicketDataDriven()
	{
		String[] allFromCities = testData.readData("FromCities").split(",");
		String[] allToCities = testData.readData("ToCities").split(",");
		String[] allJDates = testData.readData("JDates").split(",");
		for(int i=0;i<allFromCities.length;i++)
		{
			System.out.println("--------------------------------Iteration :" + (i+1));
			appUtils.getElement("//input[@name='source']").sendKeys(allFromCities[i]);
			fixedWait(1);
			appUtils.clickEnter();
			appUtils.getElement("//input[@name='destination']").sendKeys(allToCities[i]);
			fixedWait(1);
			appUtils.clickEnter();
			appUtils.getElement("//input[@name='txtJourneyDate']").click();
			selectDate(allJDates[i]);
			appUtils.getElement("//input[@name='searchBtn']").click();
			fixedWait(1);
			appUtils.getElement("//a[@title='Home']").click();
		}
		
		
	}
	@Test
	public void bookTicket()
	{
		//driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
		WebElement mySource = driver.findElement(By.xpath("//input[@name='source']"));
		actions.moveToElement(mySource).click().sendKeys(testData.readData("FromCity")).pause(1000).build().perform();
		//Thread.sleep(1000);
		fixedWait(1);
		actions.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys(testData.readData("ToCity"));
		//Thread.sleep(1000);
		fixedWait(1);
		actions.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
		//driver.findElement(By.xpath("//a[text()='29']")).click();
		selectDate(testData.readData("JDate"));
		WebElement searchBtn = driver.findElement(By.xpath("//input[@name='searchBtn']"));
		//searchBtn.click();
		//searchBtn.sendKeys(Keys.ENTER);
		//actions.moveToElement(searchBtn).click().build().perform();
		//actions.click(searchBtn).perform();
		//actions.moveToElement(searchBtn).sendKeys(Keys.ENTER).build().perform();
	    	
	    js.executeScript("arguments[0].click();", searchBtn);
	    actions.pause(2000).perform();
	    js.executeScript("window.scrollBy(0,600)");	
	}
	@Test
	public void moveToElement()
	{
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Tirupati - Bangalore')]"));
		actions.moveToElement(element).perform();
	}
	
	
	
	
	//We can perform click operation in different ways 
	// 1. WebElement - Click()
	// 2. Keys - ENTER
	// 3. Actions - MoveToElement -  Click()
	// 4. Actions - MoveToElement - Keys.ENTER
	// 5. JavaScriptExecutor - Click()
	
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
		//driver.close(); // It will close the current active window
		driver.quit(); // It will kill the chromedriver.exe process , all current windows will be closed
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
