package casioCalculator;

public class CommercialCalculator implements ArithmeticOperations
{
	public void displayLogo()
	{
		System.out.println("Welcome to Casio Commercial");
	}

	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
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
	public int division(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	@Override
	public int addition(int[] numbers) {
		
		return 0;
	}

}
