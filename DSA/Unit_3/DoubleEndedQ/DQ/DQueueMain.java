
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
	public void enqueueRear(int value)
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

	//DequeueFront
	public void dequeueFront()
	{
		if(front == null)
		{
			System.out.println(" Queue Underflow");
		}
		else
		{
			System.out.println(" Element removed: "+front.data);

			if(front == rear) //Single element deletion
			{
				front = null;
				rear = null;
			}
			else
			{
				front = front.right;		
				front.left = null;
			}
		}

	} //end of dequeueFront()


	//DequeueRear
	public void dequeueRear()
	{
		if(front == null)
		{
			System.out.println(" Queue Underflow");
		}
		else
		{
			System.out.println(" Element removed: "+rear.data);

			if(front == rear) //Single element deletion
			{
				front = null;
				rear = null;
			}
			else
			{
				rear = rear.left;		
				rear.right = null;
			}
		}
	} //end of dequeueRear()


	//PeekFront
	public void peekFront()
	{
		if(front == null)
		{
			System.out.println(" Queue Underflow");
		}
		else
		{
			System.out.println(" Element at the Front: "+front.data);
		}

 	}//end of peekFront()

	//PeekRear
	public void peekRear()
	{
		if(front == null)
		{
			System.out.println(" Queue Underflow");
		}
		else
		{
			System.out.println(" Element at the Rear: "+rear.data);
		}

 	}//end of peekRear()


	//Display
	public void display()
	{
		if(front == null)
		{
			System.out.println(" Queue Underflow");
		}
		else
		{
			DQNode tmp = front;
			System.out.print("\n Queue Elements: ");
			
			while(tmp != null)
			{
				System.out.print(tmp.data + " | ");
				tmp = tmp.right;
			}

		}

	} //end of display()

} //end of DQ class


/* 3. Menu */
class DQueueMain
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		DQ d = new DQ();
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
					d.enqueueFront(scan.nextInt());
					break;

				case 2: System.out.print("Enter a value to be added at the rear: ");
					d.enqueueRear(scan.nextInt());
					break;

				case 3: //System.out.print("");
					d.dequeueFront();
					d.display();
					break;


				case 4: d.dequeueRear();
					d.display();
					break;


				case 5: d.peekFront();
					break;


				case 6: d.peekRear();
					break;


				case 7: d.display();
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
