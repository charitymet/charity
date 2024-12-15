
import java.util.Scanner;

/* Stack Class */
class Stack
{
	int max;
	int[] sArray;
	int tos;

	public Stack(int size)
	{
		max = size;
		sArray = new int[max];
		tos = -1;
	}

	// --- Operations ---
	// ---> [A] PUSH
	public void push(int value)
	{
		// if stack is not full, push(value)
		if(tos == max-1)
		{
			System.out.println("Stack Overflow!");
		}
		else
		{
			tos++;
			sArray[tos] = value;

			// OR sArray[++tos] = value --> increment then use tos
		}
		// if stack is full, stack overflow
	} //-end of push()
	
	// ---> [B] POP
	public void pop()
	{
		if(tos == -1)
		{
			System.out.println("Stack Underflow!");
		}
		else
		{
			System.out.println("'" + sArray[tos] + "' is popped.");
			tos--;
		}
	} //-end of pop()

	// ---> [C] PEEK
	public void peek()
	{
		if(tos == -1)
		{
			System.out.println("Stack Underflow!");
		}
		else
		{
			System.out.println("Element at the TOS: " + sArray[tos]);
		}
	} //-end of peek()

	// ---> [D] Display
	public void display()
	{
		if(tos == -1)
		{
			System.out.println("Stack Underflow!");
		}
		else
		{
			System.out.println("");
			for(int i = tos; i >= 0; i--)
			{
				System.out.println("| " + sArray[i] + " |");
				System.out.println(" ----");
			} 
		}
	} //-end of display()

} //-end of Stack Class


/* Menu */
class ArrStack
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Stack stack = new Stack(4); // size = 4
		char ch;

		do{
			System.out.println("\n *** Stack - Array Implementation *** \n");
			System.out.println("1. Push an element on the stack");
			System.out.println("2. Pop an element on the stack");
			System.out.println("3. Peek operation");
			System.out.println("4. Display the stack");

			System.out.print("Enter your choice: ");
			int choice = scan.nextInt();
			
			switch(choice)
			{
				case 1: 
					System.out.print("\nEnter element to be pushed: ");
					stack.push(scan.nextInt());
					break;
				case 2: 
					stack.pop();
					break;
				case 3: 
					stack.peek();
					break;
				case 4: 
					stack.display();
					break;
				default: 
					System.out.println("\nInvalid Option!");
					break;
			} //-end of switch-case

			System.out.print("\nDo you want to continue? (y/n): ");
			ch = scan.next().charAt(0);

		}while(ch == 'y' || ch == 'Y'); //-end of do-while

		System.out.println("\nGoodbye.");
	}
} //-end of ArrStack class
