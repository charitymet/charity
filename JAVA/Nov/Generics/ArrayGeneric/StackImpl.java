import java.util.*;

// generic array list

class MyStack<T>
{
	ArrayList<T> data; // ---> instance variable to store data
	int size;	   // ---> represents size of stack
	int tos = -1;	   // ---> represents the pointer; can be 0 as well

	MyStack(int size)
	{
		this.size = size;
		data = new ArrayList<>(size);
	}

	// PUSH element on Stack
	void push(T ele)
	{
		tos++; // increment tos
		if(tos < size)
		{
			data.add(tos,ele);
			System.out.println("Pushing '" + ele + "'");
		}
		else
		{
			System.out.println("<Overflow>");
		}

	} //-end of push()

	// POP element from the Stack
	T pop()
	{
		tos--;
		if(tos >= 0)
		{
			return data.remove(tos);
		}
		else
		{
			System.out.println("<Underflow>");
			return null;
		}
	} //-end of pop()

} //-end of MyStack class


class StackImpl
{
	public static void main (String[] args)
	{
		MyStack<Integer> s1 = new MyStack<>(3);
		System.out.println("\n(Size of Stack: " + s1.size + ")\n");
		
		/*
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		-- or use for loop as below -- */

		for(int i = 0; i <= 3; i++)
		{
			s1.push(i * 10);
		}

		System.out.println();

		for(int i = 0; i<=3; i++)
		{
			System.out.println("Popped: " + s1.pop());
		}
	}
} //-end of myStack class