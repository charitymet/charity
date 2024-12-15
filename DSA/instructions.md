# Instructions for Running Java Files

## File Structure
The repository is organized as follows:

```
charity/
├── main/
│   ├── DSA/
│   │   ├── BubbleSort.java
│   │   ├── SelectionSort.java
│   │   └── [Other files]
│   └── [Other directories]
└── [Other files and directories]
```

## Prerequisites
1. **Java Development Kit (JDK)**: Ensure that JDK is installed on your system. You can download it from [Oracle's official website](https://www.oracle.com/java/technologies/javase-downloads.html) or use OpenJDK.
2. **Java Compiler**: Verify that the `javac` and `java` commands are available in your system's PATH.
3. **Clone the Repository**:
   ```bash
   git clone https://github.com/charitymet/charity.git
   cd charity/main/DSA
   ```

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

