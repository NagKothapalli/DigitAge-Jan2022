package myAbstraction;

public abstract class MiniCalculator 
{
	//Class : In a class we can have only concrete methods , we can not write abstract methods in a class.
		//Class will have constructor , we can extend a class (or) we can create object of the class by calling its constructor
	//Interface : An Interface is like a class where we can write only abstract functions.
		//Interface will not have any constructor so we can not create object of interface . 
	    //An interface can not be extended . it can be implemented by another class.
	// Abstract Class :Is a class where we can write both abstract and concrete functions.
	  //Abstract class will not have constructor and we can not create object to abstract class .
	   //We can inherit abstract class from another class by extending it . 
	   // If a class extended abstract class then that class has to implement the abstract functions available in the abstract class. 
	// class-A  extends class-B  - inheritance  , A is Child  , B is parent
	// class-A implements interface-I : inheritance , A is child , I is parent . A has to implement all functions of I
	// class implements multiple interfaces :  
	// class extends abstract class :
	// interface extends interface : 
	// interface extends multiple interfaces :
	// interface implements interface   XXX No not possible
	// interface extends class  XXX Not possible
	public int addition(int a,int b)
	{
		int sum = a+b;
		return sum;
	}
	
	public abstract int subtraction(int a,int b);

}
