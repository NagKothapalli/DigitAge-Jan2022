package myCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;
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
	@Test
	public void treeSet()
    {
    	 TreeSet<String> al=new TreeSet<String>();  
    	  al.add("Ravi");  
    	  al.add("Vijay");  
    	  al.add("Ram");  
    	  al.add("Ajay");  
    	  //Traversing elements  
    	  Iterator<String> itr=al.iterator();  
    	  while(itr.hasNext())
    	  {  
    	   System.out.println(itr.next());  
    	  }
    }  
	@Test
	public void hashMap()  // no duplicate keys  , put , putAll , putifAbsent , remove - key based , value based , replace
    {
		//HashMap<key,value>
       HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
	   map.put(1,"Ram");  //Put elements in Map  
	   map.put(2,"Ajay");    
	   map.put(3,"Krishna");   
	   map.put(4,"Ganesh");   
	   //Create child map
	   HashMap<Integer,String> cMap=new HashMap<Integer,String>();//Creating HashMap    
	   map.put(5,"Ramesh");  //Put elements in Map  
	   map.put(6,"Ajay");    
	   map.put(7,"RaviKrishna");   
	   map.put(4,"Ganesh"); 
	   //---------------------
	   map.putAll(cMap);
	   System.out.println("one : " + map.get(3));
	   System.out.println("Length of the map :" + map.size());
	   System.out.println("Iterating Hashmap...");  
		
	  for(Map.Entry m : map.entrySet())
	  {
		  System.out.println(m.getKey()+" "+m.getValue());
	  }
	  map.remove(6);
	  System.out.println("Length of the map after :" + map.size());
	   System.out.println("Iterating Hashmap...");  
		
	  for(Map.Entry m : map.entrySet())
	  {
		  System.out.println(m.getKey()+" "+m.getValue());
	  }
	  map.putIfAbsent(6, "Aroop");
	  map.putIfAbsent(4, "Anoop");
	  System.out.println("Length of the map after putifabsent :" + map.size());
	   System.out.println("Iterating Hashmap...");  
		
	  for(Map.Entry m : map.entrySet())
	  {
		  System.out.println(m.getKey()+" "+m.getValue());
	  }
		  
    }
	@Test
	public void listOfStudents()
	{
		ArrayList<Integer> studentNumbers = new ArrayList<Integer>();
		studentNumbers.add(22);
		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Nag");
		ArrayList<Student> students = new ArrayList<Student>();
		Student s1 = new Student(22,"Ram",550);
		Student s2 = new Student(25,"Ramu",580);
		Student s3 = new Student(28,"Ramesh",590);
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s3);
		students.add(new Student(38,"Raj",595)); //Run time object / Ananymous object		
		for(int i=0;i<students.size();i++) // i=0 means first student - s1.number ,s1.name , s1.marks
		{
			System.out.println("Student Number :" + i);
			System.out.println(students.get(i).number);  // i=0 means s1.number : i=1 means s2.number : i=2 means s3.number
			System.out.println(students.get(i).name); // i=0 means s1.name : i=1 means s2.name : i=2 means s3.name
			System.out.println(students.get(i).marks); // i=0 means s1.marks : i=1 means s2.marks : i=2 means s3.marks
		}
	}
	
	//Assignment : 
	//Write program to reproduce the arraylist with different data types like String , Character, Boolean
	//Write a program to sort the array / collection elements in ascending / descending order 
	//Write some programs where you can use nested for loop. There is building Five floors are there each floor contains 30 steps . 
		// Apply different color in each floor 
}

class Student  // Here Student itself is a type
{
	int number;
	String name;
	int marks;
	Student(int num,String myname,int mymarks)
	{
		number = num;
		name = myname;
		marks = mymarks;
	}
}
