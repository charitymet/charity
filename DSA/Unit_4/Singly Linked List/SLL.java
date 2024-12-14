

import java.util.Scanner;

/* 1. Node Template */
class Node 
{
	int data;
	Node next;

	/* Constructor */
	public Node(int d)
	{
		data = d;
		next = null;
	} //end of constructor

} //end of Node


/* List Template */
class List
{
	Node head;
	Node tail;	

	/* Constructor */
	public List()
	{
		// identifying the list as empty --> address
		head = null;
		tail = null;
	}
	
	/* Insert at the end of SLL */
	public void insertTail(int value)
	{	
		// 1. Make a Node
		Node x = new Node(value);

		// 2. Check for the first node in the SLL
		if(head == null){
			head = x;
			tail = x;
		}
		else {	// 3. Any other node
			tail.next = x;	// Link x to the tail of the SLL
			tail = x;	// Update tail to x
		}
		
	} //end of insertTail()

	/* Insert at the Head (start) of the list */
	public void insertHead(int value)
	{
		Node x = new Node(value);

		if(head == null){
			head = x;
			tail = x;
		}
		else{ // if there is another head present
			x.next = head;
			head = x;			
		}
	}


	/* Count the number of nodes */
	public void count()
	{
		Node tmp = head;
		int count = 0;
		
		while(tmp != null){
			count++;
			tmp = tmp.next;
		}
		System.out.println(count);
	} //end of count()
	
	/* Display the SLL */
	public void display()
	{
		Node tmp = head;
		
		while(tmp != null){
			System.out.print(tmp.data + " -> ");
			tmp = tmp.next; // if you miss this line, it would result in an endless loop
		}
		System.out.println("... end of SLL\n");
	}

	/* Search for a node */
	public void search(int value)
	{
		Node tmp = head;
		int flag = 0;

		while(tmp != null){
			if(tmp.data == value){
				flag = 1;
				break;
			}
			tmp = tmp.next;
		}
		
		if(flag == 1){
			System.out.println("Element '" + value + "' found.\n");
		}
		else{
			System.out.println("Element '" + value + "' NOT found.\n");
		}
	}

	/* Delete a node */
	public void delete(int value)
	{
		// [STEP : 1] Search for the element to be deleted
		// 2 pointers
		Node tmp = head;
		Node prev = null;

		// flag to check if the element is found or not
		int flag = 0;

		while(tmp != null){
			if(tmp.data == value){
				flag = 1;
				break;
			}

			prev = tmp;
			tmp = tmp.next;
		}

		// [STEP : 2] Unsuccessful Search - return control!
		if(flag == 0){
			System.out.println("Value " + value + " NOT found!");
			return;
		}

		// [STEP : 3] Successful Search --> if it is Not an Unsuccessful Search
		
		if(tmp == head && tmp == tail)		// --- [STEP : 3(A)] Single Node Deletion ---
		{
			// update the list
			head = null;
			tail = null;
		}
		else if(tmp == head){ 			// --- [STEP : 3(B)] Head Node Deletion ---
			head = head.next; //or tmp.next
		}
		else if(tmp == tail){			// --- [STEP : 3(C)] Tail Node Deletion ---
			tail = prev;
			tail.next = null; //or prev.next = null
			// to break the connection to the deleted tail node
		}
		else{					// --- [STEP : 3(D)] Any Other Node Deletion ---
			prev.next = tmp.next; // bypass the node to be deleted (tmp)
		}
		
	} //end of delete()


} //end of List


/* 3. Interface (Menu) */
class SLL {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		// Create object of List
		List list = new List();

		char ch;

		do
		{
			System.out.println("*** Singly Linked List ***\n");
			System.out.println("1. Insert at the end of the SLL");
			System.out.println("2. Count the number of nodes");
			System.out.println("3. Display the SLL");
			System.out.println("4. Search for a node");
			System.out.println("5. Delete a node");
			System.out.println("6. Insert at the end of the node\n");

			System.out.print("Enter your choice: ");
			int choice = scan.nextInt();

			// switch-case
			switch(choice)
			{
				case 1: 
					System.out.print("Enter a value: "); 
					list.insertTail(scan.nextInt());
					break;
				case 2: 
					System.out.print(">> Total number of Nodes: "); 
					list.count();
					break;
				case 3: 
					System.out.print("\nDisplaying the SLL: "); 
					list.display();
					break;
				case 4: 
					System.out.print("Enter the Element to Search: ");
					list.search(scan.nextInt());
					break;
				case 5: 
					System.out.print("Enter the value to be deleted: "); 
					list.delete(scan.nextInt());
					System.out.print("Displaying the SLL: ");
					list.display();
					break;
				case 6: 
					System.out.print("Enter the value to be added at the Head: ");
					list.insertHead(scan.nextInt());
					break;
				default: // for invalid option, if no case matches
					System.out.println("Incorrect Choice!");
					break; // not necessary as it will anyway come out of the switch-case

			} //end of switch

			System.out.print("Do you want to continue? (Type y or n): ");
			ch = scan.next().charAt(0);
			System.out.println();

		} while (ch == 'y' || ch == 'Y'); //end of do-while
		
		System.out.println("Goodbye.");
	} //end of main

} //end of SLL