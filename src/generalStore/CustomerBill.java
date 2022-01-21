package generalStore;

import org.junit.Test;

import casioCalculator.ArithmeticOperations;
import casioCalculator.CommercialCalculator;
import casioCalculator.MiniCalculator;
import casioCalculator.SceintificCalculator;
import casioCalculator.TrigonmetricOperations;

public class CustomerBill
{
	@Test
	public void printCustomerBill()
	{
		int prod1 = 1234545;
		int prod2 = 1543267;
		MiniCalculator mCalc = new MiniCalculator();
		CommercialCalculator cCalc = new CommercialCalculator();
		SceintificCalculator sCalc = new SceintificCalculator();
		//ArithmeticOperations calc = new ArithmeticOperations();
		ArithmeticOperations calc = new SceintificCalculator();
		//WebDriver    driver  = new ChromeDriver();
		TrigonmetricOperations tCalc = new SceintificCalculator();
		//mCalc.displayLogo();
		//cCalc.displayLogo();
		//sCalc.displayLogo();
		//calc.addition(prod1, prod2);
		int bill = calc.addition(prod1,prod2);
		System.out.println("Customer Bill :" + bill);
		//sCalc.coSineValue();
		tCalc.coSineValue();
		
		
	}

}
