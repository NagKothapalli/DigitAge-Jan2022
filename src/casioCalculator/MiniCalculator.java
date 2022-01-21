package casioCalculator;

public class MiniCalculator implements ArithmeticOperations
{
	public void displayLogo()
	{
		System.out.println("Welcome to Casio Mini ");
	}
	
	public int addition(int a,int b)
	{
		System.out.println("Addition from Mini Calc");
		int sum = a+b;
		return sum;
	}
	public int division(int a,int b)
	{
		int div = a/b;
		return div;
	}

	@Override
	public int subtraction(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int addition(int[] numbers) {
		
		return 0;
	}

}
