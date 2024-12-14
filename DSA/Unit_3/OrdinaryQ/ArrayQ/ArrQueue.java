

import java.util.Scanner;

/* Queue Class */
class Queue
{
	int max;
	int[] qArray;
	int front;
	int rear;

	// Constructor
	public Queue(int size)
	{
		max = size;
		qArray = new int[max];
		front = -1;
		rear = -1;
	}

	// Enqueue Function
	public void enqueue(int value)
	{	// 1. Queue Overflow! - Don't insert
		if(rear == max-1)
		{
			System.out.println("<Queue Overflow!>"); 
		}
		else
		{
			// 2. First Element - Special Case
			if(front == -1)
			{
				front++;
			}

			// 3. Any Other Element - Update Rear
			rear++;
			qArray[rear] = value;
		}
	} //-end of enqueue()

	// Dequeue Function
	public void dequeue()
	{
		// 1. Queue Underflow! - Don't delete - Empty Queue
		if(front == -1)
		{
			System.out.println("<Queue Underflow!>\n");
		}
		else
		{
			System.out.print("'" + qArray[front] + "' is removed\n\n");
			
			// 2. Single Element Deletion
			if(front == rear)
			{
				front = -1;
				rear = -1;
			}
			else
			{	// 3. Any Other Element - Update Rear
				front++;
			}
		}		
	} //-end of dequeue()

	// Display
	public void display()
	{	
		if(front == -1)
		{
			System.out.println("<Queue is Empty!>\n");
		}
		else
		{
			System.out.print("| ");
			for(int i = front; i <= rear; i++)
			{
				System.out.print(qArray[i] + " | ");
			}
			System.out.println("\n");
		}
	} //-end of display()

	// PeekFront
	public void peekFront()
	{
		if(front == -1)
		{
			System.out.println("<Queue Underflow!>\n");
		}
		else
		{
			System.out.print("First Element: '" + qArray[front] + "'\n\n");
		}
	} //-end of peekFront()

	// PeekRear
	public void peekRear()
	{
		if(front == -1)
		{
			System.out.println("<Queue Underflow!>\n");
		}
		else
		{
			System.out.print("Last Element: '" + qArray[rear] + "'\n\n");
		}
	} //-end of peekRear()

} //-end of Queue class

/* Menu */
class ArrQueue
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Queue q = new Queue(4);
		char ch;
		
		do{
			System.out.println("\n *** Queue - Array Implementation ***");
			System.out.println("1. Enqueue Operation");
			System.out.println("2. Dequeue Operation");
			System.out.println("3. Display the queue");
			System.out.println("4. Peek Front Operation");
			System.out.println("5. Peek Rear Operation\n");

			System.out.print("Enter your choice: ");
			int choice = scan.nextInt();

			switch(choice)
			{
				case 1: 
					System.out.print("Enter a value: ");
					q.enqueue(scan.nextInt());
					break;
				case 2: 
					System.out.print("Performing Dequeue: ");
					q.dequeue();
					break;
				case 3: 
					System.out.println("Displaying the Queue: ");
					q.display();
					break;
				case 4: 
					System.out.println("Peeking...");
					q.peekFront();
					break;
				case 5: 
					System.out.println("Peeking...");
					q.peekRear();
					break;
				default: 
					System.out.println("\nInvalid Option!");
					break;
			} //-end of switch-case

			System.out.print("Do you want to continue? (y/n): ");
			ch = scan.next().charAt(0);

		} while(ch == 'y' || ch == 'Y'); //-end of do-while

		System.out.println("\nFinish.");
	} //-end of main
} //-end of ArrQueue class
