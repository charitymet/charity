// Functional interface
interface ICalculatorLambda
{
	int op(int a, int b);
}

class CalcLambdaImpl
{
	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 20;

		// Instantiate
		ICalculatorLambda add = (a,b) -> a + b;
		ICalculatorLambda sub = (int a, int b) -> a - b;
		ICalculatorLambda mul = (a,b) -> {return (a * b);};
		ICalculatorLambda div = (a,b) -> {											System.out.println(">> This is DIV");
						return (a / b);
						};

		System.out.println("--- For Numbers: " + num1 + ", " + num2 + " (Using lambda Functions) ---");
	
		// Call the function
		System.out.println("Addition: " + add.op(num1, num2));
		System.out.println("Subtraction: " + sub.op(num1, num2));
		System.out.println("Multiplication: " + mul.op(num1, num2));
		System.out.println("Division: " + div.op(num1, num2));
	}
}