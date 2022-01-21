package casioCalculator;

public class SceintificCalculator implements ArithmeticOperations,TrigonmetricOperations
{   //Multiple Inheritance
	public void displayLogo()
	{
		System.out.println("Welcome to Casio Sceintific");
	}

	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Addition from Scientific Calc");
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

	@Override
	public void sineValue() {
		// TODO Auto-generated method stub
		System.out.println("Sine Value");
	}

	@Override
	public void coSineValue() {
		// TODO Auto-generated method stub
		System.out.println("CoSine Value");
	}

	@Override
	public void coSeec() {
		// TODO Auto-generated method stub
		System.out.println("CoSeec Value");
	}

}
