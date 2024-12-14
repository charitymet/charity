
class HashTable
{
    private Integer[] table;
    private int size;
    private int capacity;

    public HashTable(int capacity)
    {
        this.capacity = capacity;
        this.size = 0;
        this.table = new Integer[capacity];
    } //-end of Constructor

    // Hash Function - Modulo Division
    private int hash(int key)
    {
        return key % capacity;
    }

    // Insert key into hash table
    public void insert(int key)
    {
        if(size >= capacity)
        {
            System.out.println("Hash table is full! Cannot insert " + key);
            return;
        }

        int index = hash(key);

        while(table[index] != null)     // Collision
        {
            // Linear Probe
            index = (index + 1) % capacity;
        }

        table[index] = key;
        size++;
    } //-end of insert()

    // Display
    public void display()
    {
        for(int i=0; i<capacity; i++)
        {
            if(table[i] != null)
            {
                System.out.println("Index " + i + ": " + table[i]);
            }
            else
            {
                System.out.println("Index " + i + ": null");
            }
        }
    } //-end of display()

    // --- Main ---
    public static void main(String[] args)
    {
        HashTable h = new HashTable(10);

        // Sample keys to insert
        // int[] keys = {21,15,66,74,22,0,89};
        int[] keys = {94,31,23,19,25};

        for (int i:keys)
        {
            h.insert(i);
        }

        h.display();
    } //-end of main()

} //-end of HashTable
