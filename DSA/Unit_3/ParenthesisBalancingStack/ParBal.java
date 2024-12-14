
/*	Name: Anjana Kizhiyapat
  	Roll No: 1528
	Unit 3: Stacks & Queues
	Program: Parenthesis Balancing - Stack Application
*/

public class ParBal
{
	public static void main(String [] args)
	{
		//Sample Input
		//String expr = "(a+b)+(c+d)";
		String expr = "a+b)+(c+d)";
		
		if(isBalanced(expr))
		{
			System.out.println("Parenthesis are Balanced");
		}
		else
		{
			System.out.println("Parenthesis are not Balanced");
		}

	} //end of main

	public static boolean isBalanced(String ex)
	{
		//Create a stack
		char[] stack = new char[ex.length()];

		int tos = -1;
		for(int i=0 ; i<ex.length() ; i++)
		{
			char ch = ex.charAt(i);
			
			//if we encounter opening parenthesis,push
			if(ch == '(' )
			{
				tos++;
				stack[tos] = ch;
			}
			
			//if we encounter closing parenthesis,pop
			else if(ch == ')' )
			{
				if(tos == -1)   //No matching opening parenthesis
				{
					return false;
				}
				tos--;
			}
		} //end of for


		//if the stack is empty
		if(tos == -1)
		{
			return true;
		}
		else
		{
			return false;    //extra open parenthesis
		}

	} //end of isBalanced

} //end of ParBal
