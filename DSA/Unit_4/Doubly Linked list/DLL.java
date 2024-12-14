

import java.util.Scanner;

/* 1. Class Node */
class DNode
{
	int data;
	DNode right;
	DNode left;

	/* Constructor */
	public DNode(int d)
	{
		data = d;
		right = null;
		left = null;
	}
} //-end of DNode

/* 2. Class list */
class DList
{
	DNode head;
	DNode tail;

	/* Constructor */
	public DList()
	{
		head = null;
		tail = null;
	}

	/* Insert at the end of the list */
	public void insert(int value)
	{
		// 1. Make a node
		DNode x = new DNode(value);
		
		
		// 2. Check for the first node in the DLL
		if(head == null)
		{
			head = x;
			tail = x;
		}
		else {	// 3. In not the first node
			tail.right = x;
			x.left = tail;
			tail = x;
		}
	}
	

	/* Display the list */
	public void display()
	{
		DNode tmp = head;
		
		System.out.print("Forward Direction: ");
		while(tmp != null)
		{
			System.out.print(tmp.data + " <-> ");
			tmp = tmp.right;
		}
		System.out.print("End of the list\n");

		tmp = tail;
		System.out.print("Reverse Direction: ");
		while(tmp != null)
		{
			System.out.print(tmp.data + " <-> ");
			tmp = tmp.left;
		}
		System.out.print("Start of the list\n");

	} //-end of display()


	/* Count the number of nodes */
	public void count()
	{
		DNode tmp = head;
		int count = 0;

		while(tmp != null)
		{
			count++;
			tmp = tmp.right;
		}

		System.out.print(count + "\n");
	} //-end of count()

	/* Search for a node */
	public void search(int value)
	{
		DNode tmp = head;
		int flag = 0;

		while(tmp != null)
		{
			if(tmp.data == value)
			{
				flag = 1;
				break;
			}
			tmp = tmp.right;
		}
		
		if (flag == 1)
		{
			System.out.println("Value '" + value + "' is found!");
		}
		else
		{
			System.out.println("Value '" + value + "' is NOT found!");

		}
	} //-end of search()
	
	/* Insert at the Head */
	public void insertAtHead(int value)
	{
		// 1. Make a Node
		DNode x = new DNode(value);
		
		// 2. Single node insertion (means that node is head)
		if(head == null)
		{
			System.out.println("Head is NULL");
			head = x;
			tail = x;
		}
		
		// 3. If any other node insertion
		else
		{
			x.right = head;
			head.left = x;
			head = x;
			//System.out.println("Head.data = " + head.data);
			//System.out.println("Head.left = " + head.left);
			//System.out.println("Head.right = " + head.right);
		}
		
	} //-end of insertAtHead()
	
	/* Delete a Node */
	public void delete(int value)
	{
		DNode tmp = head;
		DNode prev = null;
		int flag = 0;
		
		while (tmp != null)
		{
			if(tmp.data == value) 
			{
				flag = 1;
				break;
			}
			prev = tmp;
			tmp = tmp.right;
		}

		// 1. Node not found
		if (flag == 0)
		{
			System.out.println("Node '" + value + "' NOT found!");
		}
		
		// 2. Node found
		// --- 2A. Single node deletion
		if (tmp == head && tmp == tail)
		{
			head = null;
			tail = null;
		}
		
		// --- 2B. Head node deletion
		else if(tmp == head)
		{
			//tmp = tmp.right; --> does not chnage anything, cuz we need to update head
			head = head.right;
			head.left = null;
		}
		
		// --- 2C. Tail node deletion
		else if(tmp == tail)
		{
			tail = tail.left;
			tail.right = null;
		}

		// --- 2D. Any node deletion
		else 
		{
			prev.right = tmp.right;
			tmp = tmp.right;
			tmp.left = prev;

			// OR (tmp.right).left = prev;
			// OR DNode y = tmp.right;
			//    y.left = prev; 
		}

	} //-end of delete()
	
} //-end of DList

/* Interface (Menu) */
class DLL
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		// Create object of the list
		DList dList = new DList();

		char ch;
		
		do
		{
			System.out.println("*** Doubly Linked List ***");
			System.out.println("1. Insert the node in the DLL");
			System.out.println("2. Display the DLL");
			System.out.println("3. Count the number of nodes in the DLL");
			System.out.println("4. Search for a node in the DLL");
			System.out.println("5. Delete a node in the DLL");
			System.out.println("6. Insert a node at the Head of the DLL\n");

			System.out.print("Enter your choice: ");
			int choice = scan.nextInt();
			
			switch(choice)
			{
				case 1: 
					System.out.print("Enter the value to be inserted: ");
					dList.insert(scan.nextInt());
					break;
				case 2: 
					System.out.print("Displaying DLL: \n");
					dList.display();
					break;
				case 3: 
					System.out.print("Total no. of nodes = ");
					dList.count();
					break;
				case 4: 
					System.out.print("Enter the element to Search: ");
					dList.search(scan.nextInt());
					break;
				case 5: 
					System.out.print("Enter the element to Delete: ");
					dList.delete(scan.nextInt());
					dList.display();
					break;
				case 6: 
					System.out.print("Enter the value to be inserted at the Head: ");
					dList.insertAtHead(scan.nextInt());
					break;
				default: 
					System.out.println("Invalid Option!");
					break;
			} //-end of Switch
			
			System.out.print("\nDo you want to continue (y/n): ");
			ch = scan.next().charAt(0);
			System.out.println();
					
		} while(ch == 'y' || ch == 'Y'); //-end of do-while
		
		System.out.println("Goodbye.");

	} //-end of main
} //-end of DLL