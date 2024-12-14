class Node<T>
{
	T data;		// --> data storage
	Node<T> next;	// --> Next Node: Address part of the node

	Node(T data)	// --> Constructor to init the Node
	{
		this.data = data;
		this.next = null;
	}
} //-end of Node class

class MyLinkedList<T> 
{
	// Data Members
	Node<T> head;
	int size = 0;

	MyLinkedList()
	{
		// init the list
		this.head = null;
	}

	// Add a node at the end of the list
	void addNode(T data)
	{
		// create the node we want to add
		Node<T> temp = new Node<>(data);
		
		// check if it is the first node
		if(head == null)
		{
			head = temp;
			System.out.println("\nDebugger >> First node added to the list.");
		}
		else // this is not the first node - reach at the end and add a node
		{
			Node<T> x = head;
			while(x.next != null)
			{
				x = x.next;
			}
			x.next = temp;
			System.out.println("Debugger >> Node is added to the list.");
		}
		size++;

	} //-end of addNode()

	// Print the list - overriding the toString()
	public String toString()
	{
		String res = "[";
		Node<T> x = head;

		if(x == null) // empty list
		{
			res = res + "]";
		}

		while(x.next != null)
		{
			res = res + String.valueOf(x.data) + " -> "; 
			x = x.next;
		}
		res = res + x.data + " -> null]";
		return res;
	} //-end of toString()

	int getSize()
	{
		return size;
	} //-end of getSize()

} //-end of MyLinkedList class

class GenericLinkedList
{
	public static void main(String[] args)
	{
		// Create a LL
		MyLinkedList<Integer> l1 = new MyLinkedList<>();
		l1.addNode(10);
		l1.addNode(20);
		l1.addNode(30);
		l1.addNode(40);
		l1.addNode(50);
		System.out.println("List: " + l1);
		System.out.println("Size: " + l1.getSize());
		
	}
} //-end of GenericLinkedList class
