/*	Name: Anjana Kizhiyapat
	Roll No: 1528
	Unit 1: Sorting & Searching
	Program: Binary Search
*/

# include<iostream>

using namespace std;

int main()
{
	
	int arr[10], n, i, key;
	int first, last, mid;
	
	cout << "*** Binary Search ***" << endl << endl;
	
	cout << "Enter the size of the array: ";
	cin >> n;
	
	cout << "Enter the elements of the array: " << endl;
	for(i=0; i<n; i++){
		cin >> arr[i];
	}
	
	cout << "Enter the key: ";
	cin >> key;
	
	cout << endl << "Array elements are: ";
	for(i=0; i<n; i++){
		cout << arr[i] << " ";
	}
	
	cout << endl << "Key element: " << key << endl;
	

	// Binary Search Algo.
	// Assuming we have a sorted data
	int flag = 0;
	first = 0;
	last = n - 1;
	
	while(first <= last)
	{
		mid = (first + last) / 2;
		
		if(key == arr[mid])
		{
			flag = 1;
			break;
		}
		else if(key < arr[mid])
		{
			last = mid - 1;
		}
		else	// key > arr[mid]
		{
			first = mid + 1;	
		}
	}
	
	if(flag == 1){
		cout << key << " is found at index " << mid;
	}
	else{
		cout << key << " is NOT FOUND!";
	}
	
	
	
} //end of main








