
import java.util.Scanner;

/* Node Template */
class CNode
{
	int data;
	CNode next;

	// Constructor
	public CNode(int d)
	{
		this.data = d;
		next = null;
	}

} //-end of CNode class

/* List Template */
class CList
{
	CNode head;
	CNode tail;
	
	// Constructor
	public CList()
	{
		head = null;
		tail = null;
	}

	/* Insert at the end of the list */
	public void insertTail(int value)
	{
		// [1] Make a new node
		CNode x = new CNode(value);
	
		// [2] Check: first node in the CLL
		if(head == null){
			head = x;
			tail = x;
			tail.next = head; // Circularity
		}
		else{
			tail.next = x;		// 1) Link x to the tail
			tail = x;		// 2) Update tail
			tail.next = head;	// 3) Circularity
		}
	} //-end of insertTail()


	/* Display the CLL */
	public void display()
	{
		CNode tmp = head;
		if(head == null)
		{
			System.out.println("...end of CLL");
			return; // or use else block for the entire do-while loop
		}
		
		do{
			System.out.print(tmp.data + " -> ");
			tmp = tmp.next;
		}while(tmp != head);
		System.out.print("...Back to head");

	} //-end of display()

	/* Count the number of nodes */
	public void count()
	{
		CNode tmp = head;
		int count = 0;
		
		if(head != null)
		{
			do{
				count++;
				tmp = tmp.next;
			}while(tmp != head);
		}
		
		System.out.print(count + "\n");
	} //-end of count()
	
	/* Search for a node */
	public void search(int value)
	{
		CNode tmp = head;
		int flag = 0;

		do
		{
			if(tmp.data == value)
			{
				flag = 1;
				break;
			}
			tmp = tmp.next;
		}while(tmp != head);
		
		if(flag == 1){
			System.out.println("Value '" + value + "' found!");
		}
		else{
			System.out.println("Value '" + value + "' NOT found");
		}
	}//-end of search()

	/* Delete a node */
	public void delete(int value)
	{
		// 1. Search for the value
		CNode tmp = head;
		CNode prev = null;
		int flag = 0;

		do{
			if(tmp.data == value)
			{
				flag = 1;
				break;
			}
			prev = tmp;
			tmp = tmp.next;

		} while(tmp != head);
		
		// 2. Node not found. Return control
		if(flag == 0)
		{
			System.out.println("Data '" + value + "' NOT found");
			return;
		}

		// 3. Node found
		if(tmp == head && tmp == tail)  // A. Single Node Deletion
		{
			head = null;
			tail = null;
		}

		else if(tmp == head){		// B. Head Node Deletion
			head = head.next;
			tail.next = head;
		} 

		else if(tmp == tail){		// C. Tail Node Deletion
			tail = prev;
			tail.next = head;
		}
		
		else{  				// D. Any other Node Deletion
			prev.next = tmp.next;
		}

	}//-end of delete()
	

	/* Insert at the Head - TBD */

} //-end of CList class

/* Interface */
class CLL
{
	public static void main(String[] args)
	{
		char ch;
		int choice;
		Scanner sc = new Scanner(System.in);
		CList cList = new CList();

		do{
			System.out.println("\n*** Circular Linked List ***");
			System.out.println("1. Insert a node at the tail");
			System.out.println("2. Display the CLL");
			System.out.println("3. Count the number of nodes");
			System.out.println("4. Search for a node");
			System.out.println("5. Delete a node");
			System.out.println("6. Insert a node at the head\n");

			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch(choice){
				case 1:
					System.out.print("Enter the value to be added: ");
					cList.insertTail(sc.nextInt());	
					break;
				case 2:
					System.out.print("\nDisplaying CLL: ");
					cList.display();
					break;
				case 3:
					cList.display();
					System.out.print("\nTotal number of Nodes in the CLL: ");
					cList.count();
					break;
				case 4:
					System.out.print("Enter value to be searched: ");
					cList.search(sc.nextInt());
					break;
				case 5:
					System.out.print("Enter a value to be deleted: ");
					cList.delete(sc.nextInt());
					cList.display();
					break;
				case 6:
					System.out.println("In Option 6");
					break;

				default:
					System.out.println("Invalid option!");
					break;

			} //-end of switch-case
			
			System.out.print("\n\nDo you want to continue? (y/n): ");
			ch = sc.next().charAt(0);

		} while(ch == 'y' || ch == 'Y');	//-end of do-while
		
		System.out.println("\nGoodbye.");

	} //-end of main
} //-end of CLL class
