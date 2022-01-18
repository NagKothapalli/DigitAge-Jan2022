package coreConcepts;

import org.junit.Test;

public class StringOperations
{
	//String is a non primitive type . 
	//String is a inbuilt class in JRE system library and it contains many functions .
	//Find Length of the string 
	//Remove Leading and Trailing white spaces if any 
	//Convert the string in to lowercase or uppercase
	//When will you type mismatch Error 
	//Perform string contains operation 
	//Perform string contains with case sensitivity by converting both string in to lowercase or uppercase
	//Substring operation with two overloaded functions 
	//String Comparison using equals and equalsIgnoreCase
	//CharacterAt function in the string class
	//String concatenation
	//String replace functionality
	String a = "        Selenium With Java           ";
	String b = "JAVA";
	String c = "   Selenium With JAVA                   ";
	@Test
	public void basicStringFunctions()
	{
		int len = a.length();
		System.out.println("Length of the string :"+ len);
		System.out.println("String before triming :" + a);
		String aT = a.trim();
		System.out.println("String after triming :" + aT);
		System.out.println("Length of the string after trimming :" + aT.length());
		String aL = a.trim().toLowerCase();
		System.out.println("String after lower case conversion:" + aL);
		String aU = a.trim().toUpperCase();
		System.out.println("String after upper case conversion :" + aU);
	}
	@Test
	public void stringContains()
	{
		//contains is a function whose return type is boolean , if substring string is there in the main string then it will return true value
		if(a.trim().toLowerCase().contains(b.trim().toLowerCase()))
		{
			System.out.println("Sub String is there in main string");
		}
		else
		{
			System.out.println("Sub string is not there in the main string");
		}
	}
	@Test
	public void subString()
	{
		//SubString is a function in the string class where we can take only a part of main string
		String a8 = a.trim().substring(8);
		System.out.println("Substring from 8th place :" + a8);
		String a08 = a.trim().substring(0, 8);
		System.out.println("Substring from 0-8th place :" + a08);
	}
	@Test
	public void stringComparision()
	{
		//In the string class we have a method called equals and equals by ignoring the case sensitivity . 
		//both functions will return a boolean value
		//Both should strings , they should be equal in length , same in char sequence , same in case
		//if(a.equals(c))
		//if(a.trim().toLowerCase().equals(c.trim().toLowerCase()))
		//if(a.trim().toUpperCase().equals(c.trim().toUpperCase()))
		if(a.trim().equalsIgnoreCase(c.trim()))
		{
			System.out.println("Boht the strings are equal");
		}
		else
		{
			System.out.println("Both the strings are not equal");
		}
		
	}
	@Test
	public void characterAt()
	{
		//CharAt function will return the character at the specified index value
		char myChar0 = a.trim().charAt(0);
		System.out.println("Character at 0 index :" + myChar0);
	}
	
	@Test
	public void characterCount()
	{
		int count = 0;
		int len = a.trim().length();
		for(int i=0;i<len;i++)
		{
			if(a.trim().charAt(i) == 'v')
			{
				count++;
			}
		}
		System.out.println("Character Count :" + count);
	}
	@Test
	public void stringConcatenation()
	{
		String d = a.concat(b);
		System.out.println("String d :" + d);
		String e = a.concat(b).concat(c); // a+b+c
		System.out.println("String e :" + e);
	}
	@Test
	public void stringReplace()
	{
		System.out.println("Original String :" + a);
		String aa = a.trim().replace("Java", "C#");
		System.out.println("Originl after replace :" + aa);
	}
	
	//Assignment :
	
	//Write a program to find the count of a particular character in the given string
	//Write a program to find a particular character is there in the given string
	//Write a program to replace the character sequence with new sequence in the given string
	//Write a program to replace a character with new character in the given string
	//Write a program to read two strings as inputs and find they are equal are not[Don't use equalIgnorecae ] .
	
	
	
	
	

}
