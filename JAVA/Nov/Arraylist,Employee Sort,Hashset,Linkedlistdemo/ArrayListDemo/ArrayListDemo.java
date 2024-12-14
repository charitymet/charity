// Create an array list. perform various operations on it

import java.util.*;
class ArrayListDemo
{
	public static void main(String[] args)
	{
		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(30);
		l1.add(20);
		l1.add(15);
		l1.add(5);
		System.out.println("Original List\n:" + l1 + "\n");

		// -- Sort -- 
		Collections.sort(l1);
		System.out.println("List after Sort\n:" + l1 + "\n");		
		
		// -- Insert at specific index -- 
		l1.add(2,100);
		System.out.println("Adding '100' at index 2\n:" + l1 + "\n");

		// -- Change a value -- 
		l1.set(1,99);
		System.out.println("Set index 1 to '99'\n:" + l1 + "\n");

		// -- Traversing -- 
		System.out.println("\nTraversal using for-each:");
		for(int ele : l1)
		{
			System.out.println(ele);
		}
	

		// -- Get the size of the ArrayList -- 
		System.out.println("\nSize of the ArrayList: " + l1.size() + "\n");

		// -- Get the index of specific element -- 
		System.out.println("Traversal using Iterator:");
		Iterator it = l1.iterator();
		while(it.hasNext())
		{
			Object element = it.next();
			System.out.println("Index[" + l1.indexOf(element) + "]: " + element);
		}
		
	} //-end of main
} //-end of DemoMain class