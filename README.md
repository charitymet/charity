# To-Do List

- [ ] Learn Markdown syntax
- [ ] Write a blog post
- [x] Complete project setup
- [ ] Review pull requests





# Project Management: Keyboard Shortcuts and File Structure Guide

## Overview

This guide will show you how to effectively manage virtual desktops using keyboard shortcuts and also provide the file structure for the project.

## File Structure

```bash
├───📁 ADBMS/
│   ├───📁 Implementation of Analytical Queries/
│   │   ├───📄 02-Queries2.txt
│   │   ├───📄 02-Queries_OP.txt
│   │   └───📄 RollupCube.txt
│   ├───📁 PartitionQueries/
│   │   └───📄 PartitionQueries.txt
│   ├───📁 Query/
│   │   └───📄 Queries.txt
│   ├───📁 RStudio_Programs/
│   │   ├───📁 AddRowsCol,Dataframe,Combined Dataframe,Factors,ReadWritefile,remove rows cols/
│   │   │   ├───📄 addRowsCols.R
│   │   │   ├───📄 combineDF.R
│   │   │   ├───📄 customers-100.csv
│   │   │   ├───📄 data.csv
│   │   │   ├───📄 dataframes.R
│   │   │   ├───📄 factors.R
│   │   │   ├───📄 mydata.csv
│   │   │   ├───📄 read2.R
│   │   │   ├───📄 readWriteFile.R
│   │   │   └───📄 removeRowsCols.R
│   │   ├───📁 K_nearest,full_k_Means,Apriori,Agglomerative clustering/
│   │   │   ├───📄 Agglomerative Clustering.txt
│   │   │   ├───📄 Full K-Means Implementation.txt
│   │   │   ├───📄 K-Nearest Neighbor (1).txt
│   │   │   └───📄 apriori_Updated.txt
│   │   └───📁 Vector,List,Matrix/
│   │       ├───📄 Script1.R
│   │       ├───📄 Script2_Vectors.R
│   │       ├───📄 Script3_Lists.R
│   │       └───📄 Script4_Matrix.R
│   └───📄 Settings.txt
├───📁 DSA/
│   ├───📁 Unit_1/
│   │   ├───📄 BinarySearch.java
│   │   ├───📄 BubbleSort.java
│   │   ├───📄 InsertionSort.java
│   │   ├───📄 LinearSearch.java
│   │   ├───📄 SelectionSort.java
│   │   └───📄 ShellSort.java
│   ├───📁 Unit_2/
│   │   ├───📄 HashTable.java
│   │   └───📄 HashTable1.java
│   ├───📁 Unit_3/
│   │   ├───📁 CircularQ/
│   │   │   └───📄 CircularQMenu.java
│   │   ├───📁 DoubleEndedQ/
│   │   │   └───📁 DQ/
│   │   │       └───📄 DQueueMain.java
│   │   ├───📁 InfixToPostfix/
│   │   │   └───📄 InToPost.java
│   │   ├───📁 OrdinaryQ/
│   │   │   ├───📁 ArrayQ/
│   │   │   │   └───📄 ArrQueue.java
│   │   │   └───📁 ListQ/
│   │   │       └───📄 ListQueue.java
│   │   ├───📁 ParenthesisBalancingStack/
│   │   │   └───📄 ParBal.java
│   │   ├───📁 PostfixEvaluation/
│   │   │   └───📄 PostEval.java
│   │   ├───📁 PriorityQ/
│   │   │   └───📄 PQueueMenu.java
│   │   └───📁 Stack/
│   │       └───📄 ListStack.java
│   ├───📁 Unit_4/
│   │   ├───📁 CircularLinkedList/
│   │   │   └───📄 CLL.java
│   │   ├───📁 Doubly Linked list/
│   │   │   └───📄 DLL.java
│   │   └───📁 Singly Linked List/
│   │       └───📄 SLL.java
│   ├───📁 Unit_5/
│   │   ├───📁 MaxHeap/
│   │   │   └───📄 MaxHeap.java
│   │   └───📁 StackArrayImplementation/
│   │       └───📄 ArrStack.java
│   ├───📁 Unit_6/
│   │   ├───📁 Adjacency Matrix/
│   │   │   └───📄 AdjMat.java
│   │   ├───📁 BFT on a Graph/
│   │   │   └───📄 BFT.java
│   │   └───📁 DFT on a Graph/
│   │       └───📄 DFT.java
│   └───📄 instructions.md
├───📁 JAVA/
│   ├───📁 JSP/
│   │   ├───📄 Current Date and Time.md
│   │   ├───📄 JSP Login Application.md
│   │   ├───📄 Login Application with Bean.md
│   │   ├───📄 Multiplication Table Application.md
│   │   └───📄 Number Guessing .pdf
│   ├───📁 JSTL/
│   │   ├───📄 JSTL Tags to Display and Insert Movies into the Database.md
│   │   ├───📄 javax.servlet.jsp.jstl-1.2.1.jar
│   │   └───📄 javax.servlet.jsp.jstl-api-1.2.1.jar
│   ├───📁 Nov/
│   │   ├───📁 Arraylist,Employee Sort,Hashset,Linkedlistdemo/
│   │   │   ├───📁 ArrayListDemo/
│   │   │   │   └───📄 ArrayListDemo.java
│   │   │   ├───📁 EmployeeSort/
│   │   │   │   └───📄 EmpMainSort.java
│   │   │   ├───📁 HashSetDemo/
│   │   │   │   └───📄 HashSetDemo.java
│   │   │   └───📁 LinkedListdemo/
│   │   │       └───📄 LinkedListDemo.java
│   │   └───📁 Generics/
│   │       ├───📁 ArrayGeneric/
│   │       │   └───📄 StackImpl.java
│   │       ├───📁 BoxGeneric/
│   │       │   └───📄 BoxImpl.java
│   │       ├───📁 LinkedListGeneric/
│   │       │   └───📄 GenericLinkedList.java
│   │       └───📁 PairGenericImplmentation/
│   │           └───📄 PairImpl.java
│   ├───📁 Oct/
│   │   ├───📁 AccountTest&Employee/
│   │   │   ├───📁 Accounttest/
│   │   │   │   └───📄 AccountTest.java
│   │   │   └───📁 Employeetest/
│   │   │       └───📄 EmployeeTest.java
│   │   ├───📁 Accountest/
│   │   │   └───📄 AccountTest.java
│   │   ├───📁 Array&Employee/
│   │   │   ├───📁 ArrayImplementation/
│   │   │   │   └───📄 ArrayImpl.java
│   │   │   └───📁 EmployeeInheritance/
│   │   │       └───📄 EmpInheritance.java
│   │   ├───📁 CaluculatorInterface/
│   │   │   ├───📄 CalcLambdaImpl.java
│   │   │   └───📄 CalculatorDemo.java
│   │   └───📁 StackImpl/
│   │       └───📄 MyStackImpl.java
│   ├───📁 Spring/
│   │   ├───📄 Dependency Injection and Bean Scopes in a Spring Application.md
│   │   ├───📄 JDBC Template Product .odt
│   │   └───📄 aspect.odt
│   ├───📁 SpringBoot/
│   │   └───📄 HotelApplication.md
│   ├───📁 postgres/
│   │   └───📄 postgresql-42.7.3.jar
│   └───📄 instructions.md
├───📁 WT/
│   └───📄 All the best.txt
└───📄 README.md

```

## Keyboard Shortcuts for Workspace Management

### 1. Ctrl + Win + D: Create a New Desktop

- **Purpose**: Creates a new virtual desktop
- **Helps**: Organize multiple tasks or projects on separate workspaces
- **How to Use**:
  * Press `Ctrl + Win + D`
  * New desktop will be created automatically

### 2. Ctrl + Win + Left Arrow: Switch to Previous Desktop

- **Purpose**: Quickly switch to the previous desktop
- **Helps**: Move between different project workspaces
- **How to Use**:
  * Press `Ctrl + Win + Left Arrow`
  * Navigate to the previous desktop

### 3. Ctrl + Win + Right Arrow: Switch to Next Desktop

- **Purpose**: Quickly switch to the next desktop
- **Helps**: Navigate through different project workspaces
- **How to Use**:
  * Press `Ctrl + Win + Right Arrow`
  * Move to the next desktop

### 4. Ctrl + W: Close Current Window

- **Purpose**: Closes the active window
- **Helps**: Declutter workspace
- **How to Use**:
  * Press `Ctrl + W`
  * Current window or tab will close

### 5. Ctrl + Win + F4: Close Current Desktop

- **Purpose**: Closes the current virtual desktop
- **Helps**: Remove unnecessary workspaces
- **How to Use**:
  * Press `Ctrl + Win + F4`
  * Current desktop closes without affecting other desktops

## Project Management Strategy

### Desktop Organization Tips

1. **Create Separate Desktops for Projects**
   - *Desktop 1*: Project A
   - *Desktop 2*: Project B
   - *Desktop 3*: Project C

2. **Efficient Navigation**
   - Use keyboard shortcuts to switch quickly
   - Maintain focus by isolating workspaces

3. **Dynamic Workspace Management**
   - Add new desktops with `Ctrl + Win + D`
   - Remove unused desktops with `Ctrl + Win + F4`

## Best Practices

- **Stay Organized**: Keep each project on its own desktop
- **Minimize Distractions**: Use separate desktops to focus
- **Quick Access**: Learn and use keyboard shortcuts
- **Regularly Clean Up**: Close unnecessary windows and desktops
