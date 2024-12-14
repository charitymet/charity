class MyStack
{
	// basic element to store data
	int data[];
	int tos = -1; // (top of stack) ptr that points to the current element of the stack
	int size;

	// Constructor
	MyStack(int size)
	{
		this.size = size;
		data = new int[size];
	}

	void push(int ele)
	{
		++tos;
		if (tos < size)
		{
			// increment then push
			data[tos] = ele;
			System.out.println("Pushed: " + ele);
		}
		else{
			System.out.println("tos: " + tos + " | Overflow");
		}
	}
}

class MyStackImpl
{
	public static void main(String[] args)
	{
		MyStack s1 = new MyStack(3);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
	}
}