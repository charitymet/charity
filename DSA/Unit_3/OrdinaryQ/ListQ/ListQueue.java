

import java.util.Scanner;

/* Node Template */
class QNode
{
	int data;
	QNode next;

	// Constructor
	public QNode(int d)
	{
		data = d;
		next = null;
	}
} //-end of QNode class

/* Queue Template */
class QList
{
	QNode front;
	QNode rear;

	// Constructor
	public QList()
	{
		front = null;
		rear = null;
	}

	// Enqueue
	public void enqueue(int value)
	{
		// 1. Make a new node
		QNode x = new QNode(value);
		
		// 2. Check if it is the first Node
		if(front == null)
		{
			front = x;
			rear = x;
		}
		// 3. Insert at rear
		else
		{
			rear.next = x;
			rear = x;
		}
	} //-end of enqueue()

	// Dequeue
	public void dequeue()
	{
		if(front == null)
		{
			System.out.println("<Queue Underflow!>\n");
		}
		else
		{
			System.out.print("'" + front.data + "' is removed\n\n");
			
			// Single Element Deletion
			if(front == rear)
			{
				front = null;
				rear = null;
			}
			else
			{
				front = front.next;
			}
		}
	} //-end of dequeue()

	// Display
	public void display()
	{
		if(front == null)
		{
			System.out.println("<Queue is Empty!>\n");
		}
		else
		{
			QNode tmp = front;
			System.out.print(":| ");
			while(tmp != null)
			{
				System.out.print(tmp.data + " | ");
				tmp = tmp.next;
			}
			System.out.println("\n");

		}
	} //-end of display()

	// PeekFront
	public void peekFront()
	{
		if(front == null)
		{
			System.out.println("<Queue is Empty!>\n");
		}
		else
		{
			System.out.println("First Element: '" + front.data +"'\n");
		}
	} //-end of peekRear()

	// PeekRear
	public void peekRear()
	{
		if(front == null)
		{
			System.out.println("<Queue is Empty!>\n");
		}
		else
		{
			System.out.println("Last Element: '" + rear.data +"'\n");
		}
	} //-end of peekRear()

} //-end of QList class

/* Menu */
class ListQueue
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		QList q = new QList();
		char ch;
		
		do{
			System.out.println("\n *** Queue - List Implementation ***");
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
} //-end of ListQueue class

