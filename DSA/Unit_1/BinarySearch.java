import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Binary Search ***\n");

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the key to search
        System.out.print("Enter the key: ");
        int key = scanner.nextInt();

        // Display the array
        System.out.println("\nArray elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nKey element: " + key);

        // --------------------------
        // Binary Search Algorithm
        // --------------------------

        boolean found = false;
        int first = 0;
        int last = n - 1;
        int mid = -1;

        while (first <= last) {
            mid = (first + last) / 2;

            if (key == arr[mid]) {
                found = true;
                break;
            } else if (key < arr[mid]) {
                last = mid - 1;
            } else { // key > arr[mid]
                first = mid + 1;
            }
        }

        // Display the result
        if (found) {
            System.out.println(key + " is found at index " + mid);
        } else {
            System.out.println(key + " is NOT FOUND!");
        }

        scanner.close();
    }
}
