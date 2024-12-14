
public class ShellSort
{
    // Method for ShellSort
    public static void SSort(int[] arr)
    {
        int n = arr.length;

        // Start with increment n/2, reduce by 2 and stop at 1
        for(int gap = n/2; gap > 0; gap = gap/2)
        {
            for(int i = gap; i < n; i++)
            {
                // Save the current element
                int temp = arr[i];
                // Shift gap sorted elements until temp position is found
                int j;
                for(j = i; j>=gap && arr[j-gap] > temp; j = j-gap)
                {
                    arr[j] = arr[j-gap];
                } //-end of for j

                // put temp in its correct position
                arr[j] = temp;

            } //-end of for gap
        }//-end of for i
    } //-end of SSort

    // Display array
    public static void display(int[] arr)
    {
        for(int i:arr)
        {
            System.out.print(i + "  ");
        }
        System.out.println();
    } //-end of display()


    // Main
    public static void main(String[] args)
    {
        int[] arr = {100,67,12,34,21,54,2};

        System.out.print("Original Array: ");
        display(arr);

        SSort(arr);

        System.out.print("Sorted Array: \t");
        display(arr);
    } //-end of main()

} //-end of ShellSort class