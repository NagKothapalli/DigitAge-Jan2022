package coreConcepts;

import org.junit.Test;

public class LoopingStatements
{
	//Introduction to looping statements . Need of for loop
	//Syntax of for loop . what is Iterator , Step Size ...
	//For loop with step size as 1
	//For loop with step size as 2
	//Program to generate even numbers and odd numbers using step size
	//Break Statement in for loop
	//Conditional statement in for loop 
	// Do While loop
	@Test
	public void applyColor()
	{
		System.out.println("Apply Color to Step 1");
		System.out.println("Apply Color to Step 2");
		System.out.println("Apply Color to Step 3");
		System.out.println("Apply Color to Step 4");
		System.out.println("Apply Color to Step 5");
		System.out.println("Apply Color to Step 6"); //............50
	}
	//for(iterator;expression;step size){Task}
	//for(int iterator =1;iterator < count;iterator = iterator+1){ Task-Apply color }
	@Test
	public void applyColorToSteps()
	{
		//for(int i=1;i<50;i=i+1) // i =1   1<50 2<50 3<50 4<50 5<50 ......49<50 50<50
		for(int i=1;i<=50;i=i+1) // i=1 ..... 49 50<=50
		{
			//Task
			System.out.println("Apply Color to Step:" + i);
		}
	}
	@Test
	public void applyRedColorToOddSteps()
	{
		//for(int i=1;i<50;i=i+1) // i =1   1<50 2<50 3<50 4<50 5<50 ......49<50 50<50
		for(int i=1;i<=50;i=i+2) // i=1 ..... 49 50<=50
		{
			//Task
			System.out.println("Apply Red Color to Odd Steps:" + i);
		}
	}
	
	@Test
	public void applyGreenColorToEventsSteps()
	{
		//for(int i=1;i<50;i=i+1) // i =1   1<50 2<50 3<50 4<50 5<50 ......49<50 50<50
		for(int i=2;i<=50;i=i+2) // i=1 ..... 49 50<=50
		{
			//Task
			System.out.println("Apply Green Color to Even Steps:" + i);
		}
	}
	
	public static void main(String[] args)
	{
		//printEvenNumbers(40);
		//printOddNumbers(60);
	}
	public static void printEvenNumbers(int range)
	{
		for(int i=1;i<=range;i++)
		{
			int rem	= i % 2;
			if(rem == 0)
			{
				System.out.println("The Number :" + i + "  is Even ");
			}		
		}
	}
	@Test
	public void printEvenNumbers_Test()
	{
		printEvenNumbers(50);
	}
	public static void printOddNumbers(int range)
	{
		for(int i=1;i<=range;i++)
		{
			int rem	= i % 2;
			if(!(rem == 0))
			{
				System.out.println("The Number :" + i + "  is Odd ");
			}		
		}
	}
	@Test
	public void printOddNumbers_Test()
	{
		printOddNumbers(80);
	}
	public boolean findStudent(int count,int rollNum) //Dev code // 50 ,22
	{
		boolean result = false;
		for(int r=1;r<=count;r++) // r++ : r=r+1
		{
			//System.out.println("Searching the roll number :" + r);
			if(r==rollNum) //1 2 3 4 22==22 -> false
			{
				//System.out.println("Found the Student");
				result = true;
				break;
			}			
		}
		return result;
	}
	@Test
	public void findStudent_Test()
	{
		boolean output = findStudent(50,32);
		if(output)
		{
			System.out.println("Student Found");
		}
		else
		{
			System.out.println("Student Not Found");
		}
	}
	
	// do { task } while(condition);
	public void printEvenNumbersOfUserChoice(int howMany)
	{
		int start = 1;
		int count = 0;
		do
		{
			if((start % 2) == 0)
			{
				System.out.println("Even Number :" + start);
				count++;
			}
			start++;
		} while(count<howMany);
		System.out.println("Ending number :" + start);
	}
	@Test
	public void printEvenNumbersOfUserChoice_Test()
	{
		printEvenNumbersOfUserChoice(50);
	}
	
	//Assignment :
	//Write a program to find a number in the given range
	//Write a program to find a number in the given collection of numbers
	//Write a program to find a student in the given list of students
	//Demonstrate how to use break statement in the for loop
	//Write a program to read the range and rollNumber as inputs to find in the given range/list.
	//Write a program to read the count as input and print count many even numbers
	//Write a program to read the count as input and print count many odd numbers
	//Demonstrate do while loop	
	//Write a program to print all even numbers in the given range
	//Write a program to print all even numbers in the given collection
	//Write a program to find the given numbers is even or odd
	//Demonstrate how to use conditional statement in the for loop
	//Write a program to Demonstrate for loop without break or condition inside for loop.

}
