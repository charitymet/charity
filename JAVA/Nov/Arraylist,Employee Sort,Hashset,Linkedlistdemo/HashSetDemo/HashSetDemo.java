// Create hash set and perform set operations

import java.util.*;

class HashSetDemo
{
	public static void main(String[] args)
	{
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(15);
		set.add(90);

		set2.add(11);
		set2.add(30);
		set2.add(22);
		set2.add(15);
		set2.add(90);

		System.out.println("Original Set: " + set);
		System.out.println("Set 2: " + set2);
		
		// size
		System.out.println("Size of Set: " + set.size());

		// isEmpty		
		if(set2.isEmpty())
		{
			System.out.println("Set 2 is empty!");
		}
		else
		{
			System.out.println("Set contains " + set.size() + " elements.");
		}
		
		// contains
		System.out.println("Contains element 5?: " + set.contains(5));
	
		// union
		HashSet<Integer> unionSet = new HashSet<>(set);
		unionSet.add(set2);

		// intersection
		
		
		// difference
		
		

	} //-end of main
} //-end of HashSetDemo class