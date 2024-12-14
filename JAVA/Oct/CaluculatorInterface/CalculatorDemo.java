interface ICalculator
{
	// add for methods to perform basic arithmetic operations
	int add(int num1, int num2);
	int sub(int num1, int num2);
	int mul(int num1, int num2);
	int div(int num1, int num2);
}

class CalcImpl implements ICalculator
{
	public int add(int num1, int num2)
	{
		return num1 + num2;
	}

	public int sub(int num1, int num2)
	{
		return num1 - num2;
	}
	
	public int mul(int num1, int num2)
	{
		return num1 * num2;
	}

	public int div(int num1, int num2)
	{
		return num1 / num2;
	}
}

class CalculatorDemo
{
	public static void main(String[] args)
	{
		ICalculator c1 = new CalcImpl();
		int num1 = 10;
		int num2 = 20;
		System.out.println("--- For Numbers: " + num1 + ", " + num2 + " ---");
		System.out.println("Addition: " + c1.add(num1,num2));
		System.out.println("Subtraction: " + c1.sub(num1,num2));
		System.out.println("Multiplication: " + c1.mul(num1,num2));
		System.out.println("Division: " + c1.div(num1,num2));
	}
}