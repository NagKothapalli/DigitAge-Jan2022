package coreConcepts;

import org.junit.Test;

public class ConditionalStatements  //Decision Making Statements
{
	//if condition
	//if(expression -> boolean : true / false){ Task }
	//if else condition 
	//Else if statement 
	//Nested if condition
	//Operators in Java like Arithmetic , Relational,Assignment ,Logical 
	//Write programs to use all operators in conditional statements
	public void performAddition(int a,int b) //Dev Code
	{
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);
		//boolean result = (a==b);
		//if(result==true)
		//if(result) //true
		if(a==b)
		{
			int sum =  a+b;
			System.out.println("Sum of two numbers :"+ sum);
		}
	}
	@Test
	public void performAddition_Test() //Unit Test
	{
		performAddition(44,44);
		performAddition(44,24);
	}
	
	
		public void performAddition_ifelse(int a,int b) //Dev Code
		{
			System.out.println("A value :" + a);
			System.out.println("B value :" + b);
			//boolean result = (a==b);
			//if(result==true)
			//if(result) //true
			if(a==b)
			{
				int sum =  a+b;
				System.out.println("Sum of two numbers :"+ sum);
			}
			else
			{
				int diff = a-b;
				System.out.println("Difference of two numbers :" + diff);
			}
		}
		@Test
       public void performAddition_ifelse_Test()
       {
    	   performAddition_ifelse(22,22);
    	   performAddition_ifelse(26,29);
       }
	
	
	public void performAddition_elseif(int a,int b)
	{
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);
		if(a==b) //55==55
		{
			int sum = (a+b);
			System.out.println("Sum of two numbers :" + sum);
		}
		else if(a>b)
		{
			int diff = (a-b);
			System.out.println("Difference of two numbers :" + diff);
		}
		else if(a<b)
		{
			int prod = (a*b);
			System.out.println("Product of two numbers :" + prod);
		}
	}
	@Test	
	public void performAddition_elseif_Test()
	{
		//Code Coverage =  lines covered / Total lines of code written * 100
		performAddition_elseif(55,55); // 5/15 * 100 = 33.3333 %
		performAddition_elseif(535,55);
		performAddition_elseif(55,255);
	}
	
	public void logicalOperator(int a,int b) //Dev code
	{
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);
		if((a>10) && (b>10)) //Logical Operator 
		{
			//Task
			if(a==b) //55==55 //Relational Operators //Nested if 
			{
				int sum = (a+b); //Arithmetic
				System.out.println("Sum of two numbers :" + sum);
			}
			else if(a>b)
			{
				int diff = (a-b);//Assignment
				System.out.println("Difference of two numbers :" + diff);
			}
			else if(a<b)
			{
				int prod = (a*b);
				System.out.println("Product of two numbers :" + prod);
			}
		}
		else
		{
			System.out.println("Both A and B or any one of them might be below 10");
		}			
		
	}
	@Test
	public void logicalOperator_Test()
	{
		logicalOperator(4,7);
		logicalOperator(54,7);
		logicalOperator(4,37);
		logicalOperator(44,44);
		logicalOperator(84,47);
		logicalOperator(14,17);
	}	
	
	//switch(expression) { case 1 : task case 2 : Task ......}
	
	public void multipleDecisions(char grade) //Dev Code
	{
		switch(grade)
		{
			case 'A' :
			{
				System.out.println("Student Passed in Distintion , Grade : "+ grade);
				break;
			}
			case 'B' :
			{
				System.out.println("Student Passed in First Class , Grade : "+ grade);
				break;
			}
			case 'C' :
			{
				System.out.println("Student Passed in Second Class , Grade : "+ grade);
				break;
			}
			case 'D' :
			{
				System.out.println("Student Passed in Third class , Grade : "+ grade);
				break;
			}
			case 'E' :
			{
				System.out.println("Student Passed  , Grade : "+ grade);
				break;
			}
			case 'F' :
			{
				System.out.println("Student Failed , Grade : "+ grade);
				break;
			}
			default :
			{
				System.out.println("Grade is not valid : " + grade);
				break;
			}
		}
	}
	@Test	
	public void multipleDecisions_Test()
	{
		multipleDecisions('B');
		multipleDecisions('F');
		multipleDecisions('E');
		multipleDecisions('A');
		multipleDecisions('C');
		multipleDecisions('K');
		multipleDecisions('D');
		multipleDecisions('I');
		multipleDecisions('G');
	}
		
	
	public void findEvenNumber(int num) //Dev Code
	{
		System.out.println("Given Number :" + num);
		// N / D -> Q     N % D  -> R
		int reminder = num % 2;
		if(reminder == 0)
		{
			System.out.println("Given Number is EVEN");
		}
		else
		{
			System.out.println("Given Number is ODD");
		}
	}
	@Test
	public void findEvenNumber_Test()
	{
		findEvenNumber(34);
		findEvenNumber(9);
		findEvenNumber(66);
		findEvenNumber(549);
	}	
	@Test
	public void findOddNumber_Test()
	{
		findOddNumber(34);
		findOddNumber(9);
		findOddNumber(66);
		findOddNumber(549);
	}
	public void findOddNumber(int num) //Dev Code
	{
		//System.out.println("Given Number :" + num);
		// N / D -> Q     N % D  -> R
		
		int reminder = num % 2;
		if(!(reminder == 0))
		{
			System.out.println("Given Number is ODD ," + num);
		}
		
	}
		
	//Assignment :
	//Write a program to read two input numbers , perform addition if they are equal ,do subtraction if they are not equal
	//Write a program to read a number and decide that number is even or not
	//Write a program to read two input numbers and perform the below task if and only if both inputs are above 10	
		//Task : perform addition if they are equal ,do subtraction if a>b , do multiplication if a<b
	//Write the above program using switch case
	//Write a program to read two input numbers , perform addition if they are equal ,do subtraction if a>b , do multiplication if a<b		
		
		

}
