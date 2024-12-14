
import java.util.Scanner;


/* Queue Template*/
class CirQueue
{
	int max;
	int[] qArray;
	int front;
	int rear;
	int cnt;

	// Constructor
	public CirQueue(int size)
	{
		max = size;
		qArray = new int[max];
		front = -1;
		rear = -1;
		cnt = 0;
	}

	// Enqueue
	public void enqueue(int value)
	{
		// Queue full
		if(cnt == max)
		{
			System.out.println("< Queue Overflow! >");
		}
		else
		{
			if(cnt == 0)	// First Element
			{
				front = 0;
			}

			rear = (rear + 1) % max;	
			qArray[rear] = value;
			cnt++;
		}
	} //-end of enqueue()

	// Dequeue
	public void dequeue()
	{
		// if No Elements in Queue
		if(cnt == 0)
		{
			System.out.println("Queue is Empty - Underflow!\n");
		}
		else
		{
			System.out.print("'" + qArray[front] + "' is removed\n\n");

			// Single Element Deletion
			if(front == rear)
			{
				front = -1;
				rear = -1;
			}
			else
			{
				front = (front + 1) % max;
			}
			cnt--;
		}
	} //-end of dequeue()

	// Display
	public void display()
	{
		if(cnt == 0)	// OR front == -1
		{
			System.out.println("< Queue Underflow! >");
		}
		else
		{
			System.out.print("Queue Contains: \n| ");
			int j = front;
			for(int i = 1; i <= cnt; i++)
			{
				System.out.print(qArray[j] + " | ");
				j = (j + 1) % max;
			}
			System.out.println("\n");
		}
	} //-end of display()

	// PeekFront
	public void peekFront()
	{
		if(cnt == 0)
		{
			System.out.println("Queue is Empty!\n");
		}
		else
		{
			System.out.println("Element at the front: " + qArray[front] + "\n");
		}
	} //-end of peekFront()

	// PeekRear
	public void peekRear()
	{
		if(cnt == 0)
		{
			System.out.println("Queue is Empty!\n");
		}
		else
		{
			System.out.println("Element at the rear: " + qArray[rear] + "\n");
		}
	} //-end of peekRear()
} //-end of CirQueue class

/* Menu */
class CircularQMenu
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		CirQueue c = new CirQueue(4);
		char ch;
		
		do{
			System.out.println("\n *** Circular Queue - Array Implementation ***");
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
					c.enqueue(scan.nextInt());
					break;
				case 2: 
					System.out.print("Performing Dequeue: ");
					c.dequeue();
					break;
				case 3: 
					System.out.println("Displaying the Queue: ");
					c.display();
					break;
				case 4: 
					System.out.println("Peeking...");
					c.peekFront();
					break;
				case 5: 
					System.out.println("Peeking...");
					c.peekRear();
					break;
				default: 
					System.out.println("\nInvalid Option!");
					break;
			} //-end of switch-case

			System.out.print("Do you want to continue? (y/n): ");
			ch = scan.next().charAt(0);

		} while(ch == 'y' || ch == 'Y'); //-end of do-while

		System.out.println("\nGoodbye.");
	} //-end of main
} //-end of CircularQMenu class

