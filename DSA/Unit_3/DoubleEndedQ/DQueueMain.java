
import java.util.Scanner;

/* 1. Node Template */
class DQNode
{
	int data;
	DQNode right;
	DQNode left;

	// Constructor
	public DQNode(int d)
	{
		data = d;
		right = null;
		left = null;
	}
} //-end of DQNode class

/* 2. Queue Template */
class DQ
{
	DQNode front;
	DQNode rear;

	// Constructor
	public DQ()
	{
		front = null;
		rear = null;
		// list: null, array: -1
	}

	// EnqueueFront
	public void enqueueFront(int value)
	{
		// Make a new Node
		DQNode x = new DQNode(value);

		// First Node in the Queue
		if(front == null)
		{
			front = x;
			rear = x;
		}
		else
		{
			x.right = front;
			front.left = x;
			front = x;
		}
	} //-end of enqueueFront()

	// EnqueueRear
	public void enqueueRear(value)
	{
		// Make a new Node 'x'
		DQNode x = new DQNode(value);
		
		// First node in the Queue
		if(front == null)
		{
			front = x;
			rear = x;
		}
		else	// Link x to rear
		{
			rear.right = x;
			x.left = rear;
			rear = x;
		}
	} //-end of enqueueRear()

	// DequeueRear
	// DequeueFront
	// PeekFront
	// PeekRear
	// Display
} //-end of DQ class


/* 3. Menu */
class DQueueMain
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		DQ dq = new DQ();
		char ch;

		do
		{
			System.out.println("\n*** Double Ended Queue ***");
			System.out.println("1. Enqueue Front");
			System.out.println("2. Enqueue Rear");
			System.out.println("3. Dequeue Front");
			System.out.println("4. Dequeue Rear");
			System.out.println("5. Peek Front");
			System.out.println("6. Peek Rear");
			System.out.println("7. Display");

			System.out.print("Enter your choice: ");
			int choice = scan.nextInt();

			switch(choice)
			{
				case 1: System.out.print("Enter a value to be added at the front: ");
					dq.enqueueFront(scan.nextInt());
					break;

				case 2: System.out.print("Enter a value to be added at the rear: ");
					dq.enqueueRear(scan.nextInt());
					break;

				case 3: System.out.print("In Option 3");
					break;

				case 4: System.out.print("In Option 4");
					break;

				case 5: System.out.print("In Option 5");
					break;

				case 6: System.out.print("In Option 6");
					break;

				case 7: System.out.print("In Option 7");
					break;

				default:System.out.print("\nIncorrect Choice!\n");
					break;
			} //-end of switch-case
			
			System.out.println("Do you want to continue? (y/n): ");
			ch = scan.next().charAt(0);
		} while(ch == 'y' || ch == 'Y'); //-end of do-while
		
		System.out.println("\nGoodbye.");

	} //-end of main
} //-end of DQueueMain class