/*	Name: Anjana Kizhiyapat
	Roll No: 1528
	Unit 1: Sorting & Searching
	Program: Linear Search
*/

# include<iostream>

using namespace std;

int main()
{
	int arr[10], n, i, k;
	
	cout << "*** Linear Search ***" << endl << endl;
	
	cout << "Enter the size of the array: ";
	cin >> n;
	
	cout << "Enter the elements: " << endl;
	for(i=0; i<n; i++){
		cin >> arr[i];
	}
	
	cout << "Enter the key: ";
	cin >> k;
	
	cout << endl << "Array contains: ";
	for(i=0; i<n; i++){
		cout << arr[i] << " ";
	}
	
	cout << endl << "Key Element: " << k << endl;
	
	
	// Linear Search Algo.
	int flag = 0; 	// key not found
	for(i=0; i<n; i++){
		if(arr[i] == k){
			flag = 1; // --> flag is set as the data is found
			break; 	// --> break from the encompassing loop
		}
	}
	
	if(flag == 1){
		cout << k << " is found at index " << i;
	}
	else {
		cout << k << " is NOT FOUND!";
	}
}








