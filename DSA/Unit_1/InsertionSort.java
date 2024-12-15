import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Insertion Sort ***\n");

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Display the original array
        System.out.println("\nOriginal Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // --------------------------
        // Insertion Sort Algorithm
        // --------------------------

        // Scan through the array
        for (int i = 1; i < n; i++) { // i=1 because '0th' element is considered sorted
            int tmp = arr[i]; // Element at the start of the unsorted region
            int pos = i - 1; // Comparisons happen one element before

            while (pos >= 0 && tmp < arr[pos]) {
                arr[pos + 1] = arr[pos]; // Shift element to the right
                pos--;
            }

            // Place tmp in its correct position
            arr[pos + 1] = tmp;
        }

        // Display the sorted array
        System.out.println("\nSorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}
