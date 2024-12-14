// Create a Linked List and perform various operations on it.

import java.util.*;

class LinkedListDemo
{
	public static void main(String[] args)
	{
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		
		l1.add(10);
		l1.add(30);
		l1.add(20);
		l1.add(15);
		l1.add(90);
		
		System.out.println("Original Linked list:" + l1);

		// Size
		System.out.println(l1.size());

		// Add Last
		l1.addFirst(8);
		l1.addLast(99);
		System.out.println(l1);

		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());

		l1.remove(2);
		System.out.println("List: " + l1);

		
	} //-end of main
} //-end of Linked List class