package coreConcepts;

import org.junit.Test;

public class BasicArrays
{
	//Array : Is a collection of memory locations of similar data type / homogeneous data type
	//Fixed Array: Length of the array is fixed . Elements also will be fixed .
	//Dynamic Array : Length of the array is fixed .Elements can be loaded in to the array at run time .
	//Signature of array
	//How to declare an array , how to assign values in to the array
	//How to know the length of the array
	//How to read the elements from the array 
	//How to write elements in to the array
	//We can not increase / decrease the size of the array .
	//We can not delete any elements in the array
	//Local variables should not have any modifier
	//Arrays will allow duplicate values to enter
	//Signature of Fixed Array
	 //Modifier[opt]   DataType[]   name = { values };
	//Syntax to read the element : value =  name[index] ;
	//Syntax to write the element : name[index] = valuetoload ;
	//In arrays index value always start from 0 
	//Different Exceptions in JAVA : TypeMismatch , ArrayIndexOutOfBoundsException 
	public int rollNum = 22;
	@Test
	public void fixedIntegerArray()
	{   //                0	 1  2 3  4  5  6  7  8  9                          18  19
		int[] numbers = {22,24,26,28,29,32,34,35,38,39,43,45,47,48,54,56,58,52,22};
		int len = numbers.length;
		System.out.println("Length of the array :" + len);
		int value = numbers[0]; // read the value
		numbers[1] = 55; //write the value
		//for(int i=0;i<=len;i++)
		for(int i=0;i<len;i++) // i = 0 ....18 19
		{
			System.out.println("Elements before :" + numbers[i]); // i =0 1 2 3 4 5
		}		
	}	
	
	//Signature of Dynamic Array
		 //Modifier[opt]   DataType[]   name = new  int[size];
	//What is the default value of integer in java - 0
	@Test
	public void dynamicIntegerArray()
	{   //                0	 1  2 3  4  5  6  7  8  9                          18  19
		//int[] numbers = {22,24,26,28,29,32,34,35,38,39,43,45,47,48,54,56,58,52,22};
		int[] numbers = new int[20];
		int len = numbers.length;
		System.out.println("Length of the array :" + len);
		//int value = numbers[0]; // read the value
		//numbers[1] = 55; //write the value
		for(int i=0;i<len;i++) // i = 0 ....18 19
		{
			System.out.println("Elements before :" + numbers[i]); // i =0 1 2 3 4 5
		}	
		for(int i=0;i<len;i++)
		{
			numbers[i] = 22+i;
			System.out.println("Elements after :" + numbers[i]);
		}
	}
	
	//Assignment :
	//Write the above fixed array program with different data types like String , char 
		//Write a program to read the array as input and find each element is even or not .
		//Move all even numbers in to one array
		//Move all odd numbers in to one array
		//Write a program to read the student numbers as an array and find a particular number . Read the number to find as input
		//Write a program to demonstrate index out of bounds exception with a fixed array
	
	//Write the above dynamic array program with different data types like String , char 
	//Write a program to read the marks of the student in a fixed array and calculate percentage of marks for each student then move the percentage in to a dynamic array.
	//Write a program to show the default values of all data types in java
	//Write a program to demonstrate index out of bounds exception with a dynamic array
	
	
	
	
	
	
	
}
