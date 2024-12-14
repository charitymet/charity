/*  Name: Anjana Jayan Kizhiyapat
	Roll No: 1528
	Unit 1: Sorting & Searching
	Program: Insertion Sort
*/

# include<iostream>

using namespace std;

int main()
{
	int arr[10], n, i;
	int tmp, pos;
	
	cout << "*** Insertion Sort ***" << endl << endl;
	
	cout << "Enter the size of the array: ";
	cin >> n;
	
	cout << "Enter the elements: " << endl;
	for(i=0; i<n; i++)
	{
		cin >> arr[i];	
	} //end of for
	
	cout << endl << "Original Array: ";
	for(i=0; i<n; i++)
	{
		cout << arr[i] << " ";
	} //end of for
	
	
	// --------------------------
	// Insertion Sort Algorithm
	// --------------------------
	
	// scan through the array
	for(i=1; i<n; i++) // i=1 bc '0th' ele. is considered sorted
	{
		tmp = arr[i]; // Element at the start of the unsorted region
		pos = i-1; 	  // Comparisons happen one element before
		
		
		while(tmp<arr[pos] && pos>=0)
		{
			arr[pos+1] = arr[pos]; // Copy Down
			pos--;
		}
		
		// Write tmp to its correct position
		arr[pos+1] = tmp;
		
	} //end of for i
	
	cout << endl << "Soted Array: ";
	for(i=0; i<n; i++)
	{
		cout << arr[i] << " ";
	}
	
	
} //end of main
