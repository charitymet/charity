import java.util.*;
class ArrayUtilities
{
	int[] data;

	// initialising size of this array
	ArrayUtilities(int size)
	{
		// instantiate the array
		data = new int[size];
	}

	// Setters
	void setData(int[] data1)
	{
		this.data = data1;
	}

	// Function to find Max element from the array
	int maxEle() // Why not: int maxEle(int[] data1) ???
	{
		// initialize maxVal
		int maxVal = data[0];

		for(int i = 1; i < data.length; i++) // for(int d : data1) ???
		{
			if(maxVal < data[i])
			{
				maxVal = data[i];
			}
		}

		return maxVal;	
	}

	// Function to find Min element from the array
	int minEle()
	{
		int minVal = data[0];
		
		for(int i = 1; i < data.length; i++)
		{
			if(minVal > data[i])
			{
				minVal = data[i];
			}
		}
		return minVal;
	}		
	
	// Function to find Mean
	double mean()
	{
		double meanVal = 0;
		int sum = 0;
		//-------int meanArray = data[0];
		for(int i : data) //for each ele 'i' in data array
		{	
			sum = sum + i;
		}
		meanVal = sum / data.length;
		return meanVal;
	}

	// Function to find Standard Deviation
	double stdDeviation()
	{	
		double sd = 0;
		double meanVal = mean();

		
		for(int d : data)
		{
			sd = sd + Math.pow((d - meanVal) , 2);
		}

		sd = sd / data.length;
		
		return Math.sqrt(sd);
	}
	
}


class ArrayImpl
{
	public static void main(String[] args)
	{
		int data[] = {10,20,30,40,50};
		ArrayUtilities a1 = new ArrayUtilities(5);
		a1.setData(data);
		
		System.out.println("Maximum Value: " + a1.maxEle());
		System.out.println("Minimum Value: " + a1.minEle());
		System.out.println("Mean Value: " + a1.mean());
		System.out.println("Standard Deviation: " + a1.stdDeviation());
	}
}