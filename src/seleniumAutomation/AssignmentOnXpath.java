package seleniumAutomation;

public class AssignmentOnXpath
{
	//Take any application and try to write all below xpaths to identify objects uniquely
	
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

}
