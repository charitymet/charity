/*	Name: Anjana Kizhiyapat
	Roll No: 1528
	Unit 6: Graphs
	Program: DFT on a Graph
*/

public class DFT 
{
    private int[][] adj;       // AdjMat for the graph
    private boolean[] visited; // Vector to track visited nodes
    private int[] stack;
    private int tos;
 
    // Constructor
    public DFT(int v)
    {
        adj = new int[v][v];
        visited = new boolean[v];
        stack = new int[v];
        tos = -1;
    } //-end of DFT constructor

    // Add Edge
    public void addEdge(int src, int dest)
    {
        adj[src][dest] = 1;
        adj[dest][src] = 1;
    } //-end of addEdge()

    // Perform DFT
    public void performDFT(int x)
    {
        push(x);    // Push the starting node on the stack
        System.out.print("Depth First Traversal: ");

        while(tos != -1)    // While the stack is not empty
        {
            int curr = pop();

            if(!visited[curr])
            {
                visited[curr] = true;   // Mark as visited
                System.out.print(curr + " ");

                // Push all the unvisited adjacent nodes in the stack
                for(int i=adj.length-1; i>=0; i--)
                {
                    if (adj[curr][i]==1 && !visited[i])
                    {
                        push(i);
                    }
                } //-end of for
            } //-end of if
        } //-end of while
    } //-end of performDFT()

    private void push(int node)
    {
        tos++;
        stack[tos] = node;
    } //-end of push() 

    private int pop()
    {
        int tmp = stack[tos];
        tos--;
        return tmp;
    } //-end of push() 

    // Main
    public static void main(String[] args) {
        DFT g = new DFT(5);

        // Add Edges
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);

        g.performDFT(0);    // Start DFT from Node 0
        System.out.println();
    }
} //-end of DFT class
