package seleniumAutomation;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import casioCalculator.ArithmeticOperations;
import casioCalculator.SceintificCalculator;
import junit.framework.Assert;

public class GmailAutomation
{
	String expectedTitle = "Gmail"; //TestData 
	public WebDriver driver;//null
	String name = "Ram"; //null
	
	public GmailAutomation()
	{
	  System.out.println("My name :" + name);
	  System.setProperty("webdriver.chrome.driver",
	  "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe"); 
	  driver = new ChromeDriver(); // a new empty chrome browser will be opened
	}	
	
	@Before
	public void launchApplication()
	{
		System.out.println("Test Case : Launch Application");
		ArithmeticOperations calc = new SceintificCalculator();
		calc.addition(35, 64);		
		driver.get("https://gmail.com"); //We have to call URL of AUT 
		String actualTitle = driver.getTitle();
		System.out.println("My title :" + actualTitle);
		System.out.println("My url :" + driver.getCurrentUrl());
		System.out.println("My session ID :" + driver.getWindowHandle());
		if(expectedTitle.equals(actualTitle)) //Custom validation
		{
			System.out.println("Title Validation Passed"); //We will report it in a html file
		}
		else
		{
			System.out.println("Title Validation Failed");
		}
		Assert.assertEquals(expectedTitle, actualTitle);		
	}
	@Test
	public void loginToApplication()
	{
		//launchApplication();
		System.out.println("Test Case : Login To Application");
		//driver.findElement(By.name("identifier")).sendKeys("nag022@gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("nag022@gmail.com");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
	}
	@Test
	public void forgotEmail()
	{
		//launchApplication();
		//driver.findElement(By.tagName("button")).click();
		//button[@jsname='Cuz2Ue']
		//button[text()='Forgot email?']
		//*[text()='Forgot email?']
		//button[contains(text(),'Forgot ')]
		driver.findElement(By.xpath("//button[text()='Forgot email?']")).click();
	}
	@Test
	public void learnMore()
	{
		//launchApplication();
		//driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.linkText("Learn more")).click();
		//driver.findElement(By.partialLinkText("Learn")).click();
		driver.findElement(By.xpath("//a[@jsname='JFyozc']")).click();
		/*
		 * List<WebElement> elements = driver.findElements(By.tagName("a"));
		 * System.out.println("Length of collection :" + elements.size()); for(int
		 * i=0;i<elements.size();i++) { WebElement element = elements.get(i); String
		 * text = element.getText(); if(text.equals("Learn more")) { element.click();
		 * break; } }
		 */
	}
	//FindElement function will throw NoSuchElement Exception if object is not there in the screen
	//FindElements function will not throw exception if object is not there ,just it will return the size as zero.
	//Xpath : Fixed / Static / Absolute
	//Xpath : Relative xpath
		//tagName[@attribute = 'value']
		//tagName[text() = 'value']
			//tagName[contains(@attribute , 'value')]
			//tagName[contains(text() , 'value')]
	//*[@attribute = 'value']
	//*[text() = 'value']
	//*[contains(@attribute , 'value')]
	//*[contains(text() , 'value')]
	
	//tagName[@attribute1 = 'value' and @attribute2 = 'value']
			//tagName[text() = 'value' and @attribute2 = 'value']
				//tagName[contains(@attribute , 'value') and @attribute2 = 'value']
				//tagName[contains(text() , 'value') and @attribute2 = 'value']
		//*[@attribute = 'value' and @attribute2 = 'value']
		//*[text() = 'value' and @attribute2 = 'value']
		//*[contains(@attribute , 'value') and @attribute2 = 'value']
		//*[contains(text() , 'value') and @attribute2 = 'value']
	@Test
	public void createAccount()
	{
		//launchApplication();
		//
		//driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span")).click();
		//driver.findElement(By.xpath("//span[text()='Create account']")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Create')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Create')  and @jsname='V67aGc']")).click();
		/*
		 * List<WebElement> elements =
		 * driver.findElements(By.className("VfPpkd-vQzf8d"));
		 * System.out.println("Length of collection :" + elements.size()); for(int
		 * i=0;i<elements.size();i++) { WebElement element = elements.get(i); String
		 * text = element.getText(); if(text.equals("Create account")) {
		 * System.out.println("My tagname :" + element.getTagName());
		 * System.out.println("My jsname :" + element.getAttribute("jsname"));
		 * element.click(); break; } }
		 */
	}
	@Test
	public void help()
	{
		//launchApplication();
		driver.findElement(By.linkText("Help")).click();
	}
	@Test
	public void privacy()
	{
		//launchApplication();
		driver.findElement(By.linkText("Privacy")).click();
	}
	@Test
	public void terms()
	{
		//launchApplication();
		driver.findElement(By.linkText("Terms")).click();
	}
	
	//Execution : All Instance variables will be loaded -> Default Constructor -> Before Method ->Test Method
	@Test
	public void loginApplication() throws InterruptedException
	{		
		launchApplication();
		System.out.println("Test Case : Login To Application");
		WebElement emailObj = driver.findElement(By.name("identifier"));
		if(emailObj.isDisplayed() && emailObj.isEnabled())
		{
			emailObj.click();
			emailObj.sendKeys("gfggfdgfg");
			Thread.sleep(2000);
			emailObj.clear();
			Thread.sleep(2000);
			emailObj.sendKeys("nag022@gmail.com");
		}
		else
		{
			System.out.println("Email or phone number object is not displayed / not enabled");
		}
		
		driver.findElement(By.name("identifier")).sendKeys("nag022");
	}
	
	//Demonstrate : IllegalStateException 
	//Write a program to get SessionNotCreatedException
	//Write a program to get NullPointer exception.
	//Write program to validate titles of Yahoo,Amazon,Flipkart using both Junit Assertions and custom assertions. 
	
	
	
	
	
	
	
	
	
	

}
