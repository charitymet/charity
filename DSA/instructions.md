# Instructions for Running Java Files

## File Structure
The repository is organized as follows:

```
┣ 📂DSA
 ┃ ┣ 📂Unit_1
 ┃ ┃ ┣ 📜BinarySearch.java
 ┃ ┃ ┣ 📜BubbleSort.java
 ┃ ┃ ┣ 📜InsertionSort.java
 ┃ ┃ ┣ 📜LinearSearch.java
 ┃ ┃ ┣ 📜SelectionSort.java
 ┃ ┃ ┗ 📜ShellSort.java
 ┃ ┣ 📂Unit_2
 ┃ ┃ ┣ 📜HashTable.java
 ┃ ┃ ┗ 📜HashTable1.java
 ┃ ┣ 📂Unit_3
 ┃ ┃ ┣ 📂CircularQ
 ┃ ┃ ┃ ┗ 📜CircularQMenu.java
 ┃ ┃ ┣ 📂DoubleEndedQ
 ┃ ┃ ┃ ┣ 📂DQ
 ┃ ┃ ┃ ┃ ┗ 📜DQueueMain.java
 ┃ ┃ ┃ ┗ 📜DQueueMain.java
 ┃ ┃ ┣ 📂InfixToPostfix
 ┃ ┃ ┃ ┗ 📜InToPost.java
 ┃ ┃ ┣ 📂OrdinaryQ
 ┃ ┃ ┃ ┣ 📂ArrayQ
 ┃ ┃ ┃ ┃ ┗ 📜ArrQueue.java
 ┃ ┃ ┃ ┗ 📂ListQ
 ┃ ┃ ┃ ┃ ┗ 📜ListQueue.java
 ┃ ┃ ┣ 📂ParenthesisBalancingStack
 ┃ ┃ ┃ ┗ 📜ParBal.java
 ┃ ┃ ┣ 📂PostfixEvaluation
 ┃ ┃ ┃ ┗ 📜PostEval.java
 ┃ ┃ ┣ 📂PriorityQ
 ┃ ┃ ┃ ┗ 📜PQueueMenu.java
 ┃ ┃ ┗ 📂Stack
 ┃ ┃ ┃ ┗ 📜ListStack.java
 ┃ ┣ 📂Unit_4
 ┃ ┃ ┣ 📂CircularLinkedList
 ┃ ┃ ┃ ┗ 📜CLL.java
 ┃ ┃ ┣ 📂Doubly Linked list
 ┃ ┃ ┃ ┗ 📜DLL.java
 ┃ ┃ ┗ 📂Singly Linked List
 ┃ ┃ ┃ ┗ 📜SLL.java
 ┃ ┣ 📂Unit_5
 ┃ ┃ ┣ 📂MaxHeap
 ┃ ┃ ┃ ┗ 📜MaxHeap.java
 ┃ ┃ ┗ 📂StackArrayImplementation
 ┃ ┃ ┃ ┗ 📜ArrStack.java
 ┃ ┣ 📂Unit_6
 ┃ ┃ ┣ 📂Adjacency Matrix
 ┃ ┃ ┃ ┗ 📜AdjMat.java
 ┃ ┃ ┣ 📂BFT on a Graph
 ┃ ┃ ┃ ┗ 📜BFT.java
 ┃ ┃ ┗ 📂DFT on a Graph
 ┃ ┃ ┃ ┗ 📜DFT.java
 ┃ ┗ 📜instructions.md
```

## Prerequisites
1. **Java Development Kit (JDK)**: Ensure that JDK is installed on your system. You can download it from [Oracle's official website](https://www.oracle.com/java/technologies/javase-downloads.html) or use OpenJDK.
2. **Java Compiler**: Verify that the `javac` and `java` commands are available in your system's PATH.


## Commands to Compile and Run Java Files

### Compiling
To compile any Java file, use the `javac` command. For example, to compile `BubbleSort.java`:
```bash
javac BubbleSort.java
```

### Running
After successful compilation, run the Java file using the `java` command. For example, to run `BubbleSort`:
```bash
java BubbleSort
```

### Example Workflow
1. Navigate to the `DSA` directory:
   ```bash
   cd charity/main/DSA
   ```
2. Compile the desired file (e.g., `SelectionSort.java`):
   ```bash
   javac SelectionSort.java
   ```
3. Run the compiled program:
   ```bash
   java SelectionSort
   ```

## Notes
- Make sure that the Java file being run is located in the current working directory when executing the `java` command.
- If you encounter any issues, ensure that the file name matches the public class name inside the file (case-sensitive).
- The program assumes valid user inputs (e.g., numeric values for array size and elements).

