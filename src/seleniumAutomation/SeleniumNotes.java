package seleniumAutomation;

public class SeleniumNotes
{
	//In Selenium software we have a Interface called WebDrier .
		//WebDriver interface has implemented by different classes like Chrome,Firefox,IE ....
		//WebDriver contains different functions to do different operations on a web application.
		//WebDriver : get() - to call any url on a open browser
		//The Constructor of each class who implemented WebDriver will open the respective browser automatically.
		
		//IllegalStateException: The path to the driver executable must be set by the webdriver.chrome.driver system property
		//SessionNotCreatedException : org.openqa.selenium.SessionNotCreatedException: Could not start a new session. Response code 500. Message: session not created: This version of ChromeDriver only supports Chrome version 97
		     //Current browser version is 90.0.4430.212 with binary path C:\Program Files (x86)\Google\Chrome\Application\chrome.exe
		
		//Selenium WebDriver will use the HTML document [DOM] of the web page for its object identification.
		//How to open the HTML Doc : Open Developer tool in your browser [ F12 , or RightClick->Inspect -> Elements tab will have the Html page]
		 //HTML Doc[DOM] will contain the attributes of each element present in the current web page we opened.
		//Test Case : Gmail Application Title validation
		//NoSuchElementException : if we search for an element in any empty browser window or if there is no object with given properties.
		//NullPointerException : if we create a variable and not assigned any value in to that then if we try to use that variable then we will get nullpointer exception
		
	//WebDriver : get(),getTitle(),getUrl(),getWindowHandle,getWindowHandles,refresh,close,quit
		//findElement , findElements , switch  .......
	//By : ID , Name , Class , Css , linkText , partialLinkText , tagName , xpath
	//WebElement : click , clear , sendKeys , isDisplayed , isEnabled , getText , getAttribute , findElement , findElements
			

}
