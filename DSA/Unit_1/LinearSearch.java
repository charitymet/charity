import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Linear Search ***\n");

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the key to search
        System.out.print("Enter the key: ");
        int k = scanner.nextInt();

        // Display the array
        System.out.println("\nArray contains: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nKey Element: " + k);

        // --------------------------
        // Linear Search Algorithm
        // --------------------------
        boolean found = false;
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                found = true;
                index = i;
                break;
            }
        }

        // Display the result
        if (found) {
            System.out.println(k + " is found at index " + index);
        } else {
            System.out.println(k + " is NOT FOUND!");
        }

        scanner.close();
    }
}
