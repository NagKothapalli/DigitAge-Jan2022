package myFinal;

public final class MyFinal
{
	//A class with final keyword can not be inherited / extended.
	//We can create the object for final class and we can access the members of the final class thru its object.
	//We can have only concrete functions in a final class.
	public final int num = 55; // First time Assigning value
	public int addition(int a,int b)
	{
		int sum = a+b+num;
		Double num = 56.89; //Local variable
		//num = 68; // We can not reassign any value to a final member
		return sum;		
	}
	
	public int subtraction(int a,int b)
	{
		int diff = a-b;
		return diff;
	}

}
