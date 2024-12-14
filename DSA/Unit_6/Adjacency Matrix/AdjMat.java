

import java.util.Scanner;

public class AdjMat
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        // Input Vertices
        System.out.print("Enter the number of vertices: ");
        int v = scan.nextInt();

        // Create Matrix
        int[][] mat = new int[v][v];

        // Input number of Edges
        System.out.print("Enter the number of edges: ");
        int e = scan.nextInt();

        // Read Edges
        System.out.println("Enter the edge (source/destination): ");
        for(int i=1; i<=e; i++)
        {
            int source = scan.nextInt();
            int dest = scan.nextInt();

            // Undirected graph
            mat[source][dest] = 1;
            mat[dest][source] = 1; //-comment this line for di graph
        }

        // Display
        System.out.println("\nAdjacency Matrix: ");
        for(int i=0; i<v; i++)
        {
            for(int j=0; j<v; j++)
            {
                System.out.print(mat[i][j] + "  ");
            } //-end of for j

            System.out.println();
        } //-end of for i

    } //-end of main()
} //-end of AdjMat class