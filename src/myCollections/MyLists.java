package myCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import org.junit.Test;

public class MyLists
{
	//primitive data types and their wrapper classes :
	// int - Integer , char - Character 
	//We will go to array list if we do some add and read operations .
	//If we need more data manipulations to do like insert ,remove,add operations then LinkedList is the best collection.
	@Test
	public void arrayList_Integer()
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int len = numbers.size(); // intial length will be 0
		System.out.println("Length of the array :" + len );
		numbers.add(1); //0
		numbers.add(12); //1
		numbers.add(262); //2
		numbers.add(17); //0
		numbers.add(162); //1
		numbers.add(22); //2
		numbers.add(111); //0
		numbers.add(912); //1
		numbers.add(122); //2
		System.out.println("Length of the array after :" + numbers.size() );
		for(int i=0;i<numbers.size();i++)
		{
			System.out.println(numbers.get(i));
		}
		numbers.add(2, 16);
		System.out.println("after insertion , size :" + numbers.size());
		for(int i=0;i<numbers.size();i++)
		{
			System.out.print( numbers.get(i) + " , ");
		}
		System.out.println();
		numbers.remove(1);
		System.out.println("after removing , size :" + numbers.size());
		for(int i=0;i<numbers.size();i++)
		{
			System.out.print( numbers.get(i) + " , ");
		}
		Collections.sort(numbers);
		System.out.println();
		System.out.println("after sorting , size :" + numbers.size());
		for(int i=0;i<numbers.size();i++)
		{
			System.out.print( numbers.get(i) + " , ");
		}
		Collections.reverse(numbers);
		System.out.println();
		System.out.println("after sorting in reverse , size :" + numbers.size());
		for(int i=0;i<numbers.size();i++)
		{
			System.out.print( numbers.get(i) + " , ");
		}
	}

	
	@Test
	public void myLinkedList_Integer()
	{
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		int len = numbers.size(); // intial length will be 0
		System.out.println("Length of the array :" + len );
		numbers.add(1); //0
		numbers.add(12); //1
		numbers.add(262); //2
		numbers.add(17); //0
		numbers.add(162); //1
		numbers.add(22); //2
		numbers.add(111); //0
		numbers.add(912); //1
		numbers.add(122); //2
		System.out.println("Length of the array after :" + numbers.size() );
		for(int i=0;i<numbers.size();i++)
		{
			System.out.println(numbers.get(i));
		}
		numbers.add(2, 16);
		System.out.println("after insertion , size :" + numbers.size());
		for(int i=0;i<numbers.size();i++)
		{
			System.out.print( numbers.get(i) + " , ");
		}
		System.out.println();
		numbers.remove(1);
		System.out.println("after removing , size :" + numbers.size());
		for(int i=0;i<numbers.size();i++)
		{
			System.out.print( numbers.get(i) + " , ");
		}
		Collections.sort(numbers);
		System.out.println();
		System.out.println("after sorting , size :" + numbers.size());
		for(int i=0;i<numbers.size();i++)
		{
			System.out.print( numbers.get(i) + " , ");
		}
		Collections.reverse(numbers);
		System.out.println();
		System.out.println("after sorting in reverse , size :" + numbers.size());
		for(int i=0;i<numbers.size();i++)
		{
			System.out.print( numbers.get(i) + " , ");
		}
	}
	//Assignment : 
	//Write program to reproduce the arraylist with different data types like String , Character, Boolean
	//Write a program to sort the array / collection elements in ascending / descending order 
	//Write some programs where you can use nested for loop. There is building Five floors are there each floor contains 30 steps . 
		// Apply different color in each floor 
}
