package coreConcepts;

import org.junit.Test;

public class TypeCasting 
{
	//Implicit
	//Explicit
	@Test
	public void implicitTypeCasting()
	{
		int number = 25;
		double bigNumber = number ; //automatic conversion / implicit conversion / widening /upcasting
		System.out.println("my int :" + number);
		System.out.println("my double :" + bigNumber);
		
		//String name = "Ram";		
		//int num = name; //Typemismatch error
	}
	@Test
	public void explicitTypeCasting()
	{
		double bigNumber = 22.25;
		int number = (int) bigNumber; // explicit conversion / narrowing /down casting
		System.out.println("my int :" + number);
		System.out.println("my double :" + bigNumber);
	}
	@Test
	public void stirngtoIntConversion()
	{
		String num = "1234";
		System.out.println(num+num);
		int newnum = Integer.parseInt(num); //String to int
		System.out.println(newnum+newnum);
		String s2 = Integer.toString(newnum); // int to string
		System.out.println(s2+s2);
		String s3 = String.valueOf(newnum); //int to string
	}

}
