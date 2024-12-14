class Pair<T,U>
{
	T key;
	U value;

	Pair(T key, U value)
	{
		this.key = key;
		this.value = value;
	}

	void setKey(T key)
	{
		this.key = key;
	}
	T getKey()
	{
		return this.key;
	}

	void setValue(U value)
	{
		this.value = value;
	}
	U getValue()
	{
		return this.value;
	}

	// overriding toString()
	public String toString()
	{
		return "Key: " + key + " | Value: " + value;
	}

} //-end of Pair class

class PairImpl
{
	public static void main(String[] args)
	{
		Pair<Integer,String> p1 = new Pair<>(1, "Anjana");
		Pair<Integer,String> p2 = new Pair<>(2, "Crystal");

		System.out.println(p1); // automatically calls toString(); it is overridden
		System.out.println(p2.toString());
	}
} //-end of PairImpl class