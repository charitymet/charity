
// --->> Similar to insertion at the HEAD of the LL

import java.util.Scanner;

/* Node Template */
class SNode
{
	int data;
	SNode next; 

	// Constructor
	public SNode(int d)
	{
		data = d;
		next = null;
	}

} //-end of SNode


/* Stack Template */
class SList
{
	SNode tos;

	public SList()
	{
		tos = null;
	}

	// ---------------------
	// ----- Operations ----
	// ---------------------

	// [A] PUSH Operation
	public void push(int value)
	{
		// (1) Make a Node
		SNode x = new SNode(value);
		
		// (2) IF first node in the stack
		if(tos == null)
		{
			tos = x;
		}
		
		// (3) ELSE insert x at the tos
		else
		{
			x.next = tos;	// Link x to the stack
			tos = x;	// update tos
		}  
		
	} //-end of push()

	// [B] POP Operation
	public void pop()
	{
		if(tos == null)
		{
			System.out.println("Stack Underflow!");
		}
		else
		{
			System.out.println("Data '" + tos.data + "' popped!");
			tos = tos.next;	// for single node, tos updates to null
		}
	} //-end of pop()

	// [C] PEEK
	public void peek()
	{
		if(tos == null)
		{
			System.out.println("Stack Underflow!");
		}
		else
		{
			System.out.println("Data at the TOS: " + tos.data);
		}
	} //-end of peek()

	// [D] Display
	public void display()
	{
		// empty stack
		if(tos == null)
		{
			System.out.println("Stack Underflow!");
		}
		else
		{
			SNode tmp = tos;
			System.out.println("Stack contains: \n");
			while(tmp != null)
			{
				System.out.println("| " + tmp.data + " |");
				System.out.println(" ----");
				tmp = tmp.next;
			}
		}
	} //-end of display()

} //-end of Stack (List Based)


/* Interface (Menu) */
class ListStack
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		SList stack = new SList(); 	// declaration of the stack
		char ch;

		do{
			System.out.println("\n *** Stack - List Implementation *** \n");
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

		System.out.println("\nFinish.");
	}
} //-end of ListStack class