class Box<T>
{
	T item;
	
	// Setters & Getters
	void setItem(T item)
	{
		this.item = item;
	}

	T getItem()
	{
		return this.item;
	}
}

class BoxImpl
{
	public static void main(String[] args)
	{
	
		// to implement generic class in main method, you have to create an object of the box class
		Box<String> b1 = new Box<>();
		b1.setItem("Book");
		System.out.println("b1 <String> item: " + b1.getItem());

		Box<Integer> b2 = new Box<>();
		b2.setItem(22);
		System.out.println("b2 <Integer> item: " + b2.getItem());

		Box<Double> b3 = new Box<>();
		b3.setItem(22.3);
		System.out.println("b3 <Double> item: " + b3.getItem());

		Box<Float> b4 = new Box<>();
		b4.setItem(20.24f);
		System.out.println("b4 <Float> item: " + b4.getItem());

		
		
	}
}