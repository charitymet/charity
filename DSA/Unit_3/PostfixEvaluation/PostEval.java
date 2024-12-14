

import java.util.*;

class PostEval
{
	public static void main(String[] args)
	{
		// Sample postfix expression (2 3 * 5 + 6 2 / -)
		String expr = "23*5+62/-";

		int result = evaluate(expr);
		System.out.println("Result of postfix evaluation: " + result); 
	} //-end of main

	public static int evaluate(String ex)
	{
		// Create a stack
		int[] stack = new int[ex.length()];
		int tos = -1;

		// loop through the postfix ex
		for(int i=0; i<ex.length(); i++)
		{
			char ch = ex.charAt(i);

			if(Character.isDigit(ch)) // if ch is a digit - push
			{
				tos ++;
				stack[tos] = ch-'0'; // convert char into int
			}
			else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') // if ch is operator
			{
				int op2 = stack[tos--];	// pop the 2nd operand
				int op1 = stack[tos--];	// pop the 1st operand

				int res = 0;
				switch(ch)
				{
					case '+': 
						res = op1 + op2;
						break;

					case '-': 
						res = op1 - op2;
						break;

					case '*': 
						res = op1 * op2;
						break;

					case '/': 
						res = op1 / op2;
						break;
				} //-end of switch-case
				
				// Push the result back on the stack
				tos++;
				stack[tos] = res;
			}
		} //-end of for loop
		
		// Final result at tos
		return stack[tos];
		
	} //-end of evaluate()
} //-end of PostEval class
