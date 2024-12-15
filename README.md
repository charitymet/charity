��#   C h a r i t y 

 # Project Management: Keyboard Shortcuts and File Structure Guide

## Overview

This guide will show you how to effectively manage virtual desktops using keyboard shortcuts and also provide the file structure for the `min/ji.html` project. The goal is to help you switch between tasks, organize your workspace, and easily navigate between your project files.
 Below is the recommended folder structure for organizing your project files:

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
│   ├───📄 .DS_Store
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
│   │   │   ├───📁 DQ/
│   │   │   │   └───📄 DQueueMain.java
│   │   │   └───📄 DQueueMain.java
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
│   ├───📄 .DS_Store
│   └───📄 instructions.md
├───📁 JAVA/
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
│   ├───📁 jstl/
│   │   ├───📄 javax.servlet.jsp.jstl-1.2.1.jar
│   │   └───📄 javax.servlet.jsp.jstl-api-1.2.1.jar
│   ├───📁 postgres/
│   │   └───📄 postgresql-42.7.3.jar
│   ├───📄 .DS_Store
│   └───📄 instructions.md
├───📁 WT/
│   └───📄 All the best.txt
├───📄 .DS_Store
└───📄 README.md

```

---

## **1. Keyboard Shortcuts for Workspace Management**

### 1.1 **Ctrl + Win + D**: Create a New Desktop
This shortcut creates a new virtual desktop, helping you organize multiple tasks or projects on separate workspaces.

#### **How to Use**:
- Press `Ctrl + Win + D` to create a new virtual desktop.
- You'll be automatically switched to the new desktop. To return, use desktop-switching shortcuts.

---

### 1.2 **Ctrl + Win + Left Arrow**: Switch to the Previous Desktop
Quickly switch to the previous desktop where you were working on a task or project.

#### **How to Use**:
- Press `Ctrl + Win + Left Arrow` to move to the desktop on the left (previous desktop).
- If you are already on the first desktop, this will have no effect.

---

### 1.3 **Ctrl + W**: Close the Current Window
This shortcut closes the active window, useful when you need to declutter your workspace or finish a task.

#### **How to Use**:
- Press `Ctrl + W` to close the currently active window.
- In a web browser, it will close the active tab. In other apps (e.g., File Explorer), it will close the window.

---

## **2. Switching Between Projects Efficiently**

By organizing your projects across multiple virtual desktops, you can easily switch between them without losing focus.

### 2.1 **How to Set Up and Use Virtual Desktops for Projects**:
1. **Create a Desktop for Each Project**:
   - Use `Ctrl + Win + D` to create a new desktop for each project you're working on.
   - For example:
     - Desktop 1: Project A
     - Desktop 2: Project B
     - Desktop 3: Project C

2. **Switch Between Projects**:
   - Use `Ctrl + Win + Left Arrow` or `Ctrl + Win + Right Arrow` to switch between desktops.
   - This helps you focus on one project at a time without distractions.

3. **Create New Desktops as Needed**:
   - If you need more workspaces, just press `Ctrl + Win + D` again to create an additional desktop.

4. **Close Desktops**:
   - Close unused desktops by pressing `Ctrl + Win + F4`. This won’t affect the open apps on other desktops.

---
