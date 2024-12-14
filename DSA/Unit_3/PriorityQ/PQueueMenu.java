
import java.util.Scanner;

/* Node Template */
class PQNode
{
	int data;
	int pri;
	PQNode next;

	// Constructor
	public PQNode(int d, int p)
	{
		data = d;
		pri = p;
		next = null;
	}
} //-end of PQueue class

/* Queue Template */
class PQueue
{
	PQNode front;
	PQNode rear;

	// Constructor
	public PQueue()
	{
		front = null;
		rear = null;
	}
	
	// Enqueue
	public void enqueue(int val, int pr)
	{
		// Make a Node
		PQNode x = new PQNode(val,pr);

		// First Node in the PQ
		if(front == null)
		{
			front = x;
			rear = x;
		}
		else
		{
			PQNode prev = null;
			PQNode tmp = front;
			
			while(tmp != null)
			{
				if(x.pri < tmp.pri)
				{
					break;
				}
				prev = tmp;
				tmp = tmp.next;
			}

			if(tmp == front)	// front node insertion
			{
				x.next = front;
				front = x;
			}
			else if(prev == rear)	// rear node insertion
			{
				rear.next = x;
				rear = x;
			}
			else			// any other node
			{
				prev.next = x;
				x.next = tmp;
			}
		}

		// Insert it based on Priority
	} //-end of enqueue()

	// Dequeue
	public void dequeue()
	{
		System.out.print("Element removed: " + front.data + ", " + front.pri + "\n\n");
		
		if(front == rear)	//Single element deletion
		{
			front = null;
			rear = null;
		}
		else
		{
			front = front.next;
		}
	} //-end of dequeue()

	// Display
	public void display()
	{
		if(front == null)
		{
			System.out.println("< Queue Underflow! >\n");
		}
		else
		{
			PQNode tmp = front;
			System.out.print("Queue Contains: \n| ");
			while(tmp != null)
			{
				System.out.print(tmp.data + ", " + tmp.pri + " | ");
				tmp = tmp.next;
			}
		}
		System.out.println("\n");
	} //-end of display()

	// PeekFront
	public void peekFront()
	{
		if(front == null)
		{
			System.out.println("< Queue Underflow! >\n");
		}
		else
		{
			System.out.println("Element at the front: '" + front.data + ", " + front.pri +"'\n");
		}
	} //-end of peekFront()

	// PeekRear
	public void peekRear()
	{
		if(front == null)
		{
			System.out.println("< Queue Underflow! >\n");
		}
		else
		{
			System.out.println("Element at the rear: '" + rear.data + ", " + rear.pri +"'\n");
		}
	} //-end of peekRear()
} //-end of PQueue class


/* Menu */
class PQueueMenu
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		PQueue pq = new PQueue();
		char ch;
		
		do{
			System.out.println("\n *** Priority Queue ***");
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
					int val = scan.nextInt();

					System.out.print("Enter a priority: ");
					int pri = scan.nextInt();
					
					pq.enqueue(val, pri);

					System.out.print("\n");
					break;
				case 2: 
					System.out.print("Performing Dequeue: ");
					pq.dequeue();
					break;
				case 3: 
					System.out.println("Displaying the Queue: ");
					pq.display();
					break;
				case 4: 
					System.out.println("Peeking...");
					pq.peekFront();
					break;
				case 5: 
					System.out.println("Peeking...");
					pq.peekRear();
					break;
				default: 
					System.out.println("\nInvalid Option!");
					break;
			} //-end of switch-case

			System.out.print("Do you want to continue? (y/n): ");
			ch = scan.next().charAt(0);

		} while(ch == 'y' || ch == 'Y'); //-end of do-while

		System.out.println("\n Finish.");
	} //-end of main
} //-end of PQueueMenu class