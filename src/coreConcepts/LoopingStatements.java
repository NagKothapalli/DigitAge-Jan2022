package coreConcepts;

import org.junit.Test;

public class LoopingStatements
{
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

}
