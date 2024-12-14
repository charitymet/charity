
public class BFT 
{
    // Step 1: Initialization
    private int[][] adj;       // AdjMat for the graph
    private boolean[] visited; // Track visited nodes
    private int[] queue;
    private int front, rear;

    // Constructor
    public BFT(int v)
    {
        adj = new int[v][v];
        visited = new boolean[v];
        queue = new int[v];
        front = -1;
        rear = -1;
    }

    // add Edge
    public void addEdge(int src, int dest)
    {
        // Undirected
        adj[src][dest] = 1;
        adj[dest][src] = 1;
    }

    // BFT Traversal
    public void performBFT(int x)
    {
        enqueue(x); // Enque starting node
        visited[x] = true;

        System.out.print("BFT Traversal: ");
        while(front != -1)  // while queue is not empty
        {
            int curr = dequeue();
            System.out.print(curr + " ");

            // Enqueue all visited neighbours and set their visited to true
            for(int i=0; i<adj.length; i++){
                if(adj[curr][i] == 1 && !visited[i])
                {
                    enqueue(i);
                    visited[i] = true;
                }
            }
        } //-end of while
    } //-end of performBFT()

    // Enqueue
    private void enqueue(int node){
        if(front == -1){
            front++;
        }
        rear++;
        queue[rear] = node;
    } //-end of enqueue()
    
    // Dequeue
    private int dequeue(){
        int tmp = queue[front];

        if(front == rear){  // sinle element
            front = -1;
            rear = -1;
        }
        else {
            front ++;
        }
        return tmp;
    } //-end of dequeue()

    // Main
    public static void main(String[] args) {
        BFT g = new BFT(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);

        g.performBFT(0);
        System.out.println();
    } //-end of main()
} //-end of BFT class