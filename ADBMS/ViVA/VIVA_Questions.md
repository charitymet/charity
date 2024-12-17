# Basic ADBMS Concepts

### 1. Q: What is ADBMS?
A: ADBMS stands for Advanced Database Management System, which extends traditional DBMS concepts with advanced functionalities like distributed databases, object-oriented databases, data warehousing, and NoSQL databases.

### 2. Q: Differentiate between DBMS and ADBMS.
A: DBMS focuses on basic database operations, while ADBMS incorporates advanced features like distributed databases, data replication, and complex data structures.

### 3. Q: What is a distributed database?
A: A distributed database is a collection of data stored at different physical locations, which can be accessed and managed as a single logical database.

### 4. Q: What is data fragmentation?
A: Data fragmentation is the process of breaking a database into smaller pieces (fragments) to be stored at different locations.

### 5. Q: Explain horizontal and vertical fragmentation.
A: Horizontal fragmentation splits rows of a table, while vertical fragmentation splits columns.

---

# Normalization and Design

### 6. Q: What is normalization?
A: Normalization is the process of organizing data to reduce redundancy and improve data integrity.

### 7. Q: Define 1NF, 2NF, and 3NF.
A:
- **1NF**: Removes duplicate columns; each column contains atomic values.
- **2NF**: Achieves 1NF and removes partial dependencies.
- **3NF**: Achieves 2NF and removes transitive dependencies.

### 8. Q: What is denormalization?
A: Denormalization is the process of adding redundancy to improve database read performance.

### 9. Q: What is a surrogate key?
A: A surrogate key is a unique, system-generated identifier used as a primary key.

### 10. Q: Define functional dependency.
A: A functional dependency occurs when one attribute uniquely determines another attribute.

---

# SQL and Query Execution

### 11. Q: Write a query to find the second highest salary from a table.
A:
```sql
SELECT MAX(salary)
FROM employee
WHERE salary < (SELECT MAX(salary) FROM employee);
```

### 12. Q: What is the difference between HAVING and WHERE?
A: WHERE filters rows before grouping, while HAVING filters groups after grouping.

### 13. Q: What is a self-join?
A: A self-join is a join where a table is joined with itself.

### 14. Q: How do you create a view in SQL?
A:
```sql
CREATE VIEW view_name AS
SELECT column1, column2 FROM table_name;
```

### 15. Q: What are indexes in SQL?
A: Indexes are database structures that improve the speed of data retrieval.

---

# Transactions and Concurrency

### 16. Q: What is a transaction?
A: A transaction is a sequence of database operations executed as a single logical unit.

### 17. Q: Explain ACID properties.
A:
- **Atomicity**: Transactions are all-or-nothing.
- **Consistency**: Transactions bring the database from one valid state to another.
- **Isolation**: Transactions do not interfere with each other.
- **Durability**: Committed transactions are permanent.

### 18. Q: What is a deadlock?
A: A deadlock occurs when two or more transactions are waiting for each other’s resources indefinitely.

### 19. Q: Explain the two-phase locking protocol.
A: It ensures serializability by having two phases: growing (locks are acquired) and shrinking (locks are released).

### 20. Q: What is a dirty read?
A: A dirty read occurs when a transaction reads uncommitted data from another transaction.

---

# Advanced SQL

### 21. Q: Write a query to find employees who earn more than the average salary.
A:
```sql
SELECT *
FROM employee
WHERE salary > (SELECT AVG(salary) FROM employee);
```

### 22. Q: What is the purpose of GROUP BY?
A: GROUP BY groups rows sharing a property and allows aggregate functions like SUM, AVG, etc.

### 23. Q: Differentiate between INNER JOIN and OUTER JOIN.
A: INNER JOIN returns matching rows, while OUTER JOIN includes unmatched rows with NULL.

### 24. Q: What is a trigger in SQL?
A: A trigger is a stored procedure that automatically executes in response to certain events.

### 25. Q: What is a stored procedure?
A: A stored procedure is a precompiled set of SQL statements stored in the database.

---

# PL/SQL and Programming

### 26. Q: What is the difference between a procedure and a function in PL/SQL?
A: A procedure does not return a value, while a function returns a value.

### 27. Q: Write a PL/SQL block to display employee details.
A:
```plsql
BEGIN
  FOR rec IN (SELECT * FROM employee) LOOP
    DBMS_OUTPUT.PUT_LINE(rec.emp_name || ' - ' || rec.salary);
  END LOOP;
END;
```

### 28. Q: What is an exception in PL/SQL?
A: An exception is an error condition in PL/SQL that can be handled using exception-handling blocks.

### 29. Q: Explain the MERGE statement.
A: The MERGE statement performs INSERT, UPDATE, or DELETE based on a condition.

### 30. Q: What is a cursor in PL/SQL?
A: A cursor is a pointer to a result set of a query.

---

# NoSQL and New Technologies

### 31. Q: What is NoSQL?
A: NoSQL refers to non-relational databases designed for scalability and unstructured data.

### 32. Q: Name some types of NoSQL databases.
A: Document-based (MongoDB), Key-value (Redis), Column-family (Cassandra), and Graph (Neo4j).

### 33. Q: What is CAP theorem?
A: CAP theorem states that a distributed system can only guarantee two of the following: Consistency, Availability, and Partition tolerance.

### 34. Q: Differentiate between MongoDB and MySQL.
A: MongoDB is schema-less and document-based, while MySQL is a relational database with a fixed schema.

### 35. Q: What is sharding in NoSQL?
A: Sharding is the process of splitting data into smaller pieces for horizontal scaling.

---

# Data Warehousing and Mining

### 36. Q: What is a data warehouse?
A: A data warehouse is a centralized repository of integrated data from multiple sources, designed for analysis and reporting.

### 37. Q: What is OLAP?
A: Online Analytical Processing (OLAP) enables multidimensional analysis of data.

### 38. Q: What is a star schema?
A: A star schema is a data warehouse schema with a central fact table connected to dimension tables.

### 39. Q: What is data mining?
A: Data mining involves discovering patterns and insights from large datasets.

### 40. Q: Name some common data mining techniques.
A: Classification, clustering, association rule mining, and regression.

---

# Security and Miscellaneous

### 41. Q: What is SQL injection?
A: SQL injection is a code injection technique used to exploit vulnerabilities in SQL query execution.

### 42. Q: How can you prevent SQL injection?
A: Use parameterized queries, stored procedures, and input validation.

### 43. Q: What is database replication?
A: Database replication involves copying and maintaining database instances across multiple locations.

### 44. Q: What is a role in database security?
A: A role is a collection of permissions that can be granted to users.

### 45. Q: What is data masking?
A: Data masking hides sensitive data to protect it from unauthorized access.

---

# Practical Scenarios

### 46. Q: How would you optimize a slow-running query?
A: Use indexes, avoid SELECT *, rewrite subqueries, and analyze execution plans.

### 47. Q: Explain the purpose of a database checkpoint.
A: A checkpoint saves the current state of the database to ensure recovery after a crash.

### 48. Q: What is the difference between TRUNCATE and DELETE?
A: TRUNCATE removes all rows quickly without logging, while DELETE allows row-specific deletions and logging.

### 49. Q: What is the use of the EXPLAIN command?
A: The EXPLAIN command displays the execution plan of a query.

### 50. Q: How do you back up a database?
A: Use database-specific commands or tools like mysqldump (MySQL) or pg_dump (PostgreSQL).

---

# Parallel Database Systems

### 51. What is a parallel database system?
A parallel database system uses multiple processors and storage devices to perform database operations simultaneously for better performance and scalability.

### 52. What are the types of parallelism in databases?
- **Inter-query parallelism**: Executes multiple queries concurrently.
- **Intra-query parallelism**: Executes a single query using multiple processors.
- **Intra-operation parallelism**: Parallel execution within an operation like sorting.
- **Inter-operation parallelism**: Parallel execution of different operations in a query.

### 53. What is partitioning in parallel databases?
A: Partitioning divides a database table into smaller parts to distribute the data across multiple nodes for parallel processing.

### 54. What are the types of partitioning?
- Horizontal Partitioning
- Vertical Partitioning
- Hash Partitioning
- Range Partitioning

### 55. Name a key advantage of parallel databases.
A: Improved query performance due to distributed workload across processors.

### 56. What is a shared-nothing architecture?
A: A parallel database architecture where each node has its own processor, memory, and disk, ensuring no shared resources among nodes.

### 57. What challenges are associated with parallel databases?
- Data skew
- Communication overhead
- Fault tolerance

### 58. How is load balancing achieved in parallel databases?
A: By evenly distributing data and queries across processors to prevent bottlenecks.

---

# Distributed Database Systems

### 59. What is a distributed database?
A: A distributed database is a database where data is stored across multiple locations connected by a network.

### 60. What are the components of a distributed database system?
- Database nodes
- Network
- Distributed DBMS

### 61. What are the types of distributed databases?
- Homogeneous distributed database
- Heterogeneous distributed database

### 62. What is data fragmentation?
A: Breaking down a database into smaller fragments to store them at different locations.

### 63. What are the types of data fragmentation?
- Horizontal fragmentation
- Vertical fragmentation
- Mixed fragmentation

### 64. Define data replication in distributed databases.
A: Data replication involves copying data to multiple locations to ensure availability and fault tolerance.

### 65. What are the advantages of distributed databases?
- Improved reliability
- Faster data access
- Scalability

### 66. What are the challenges of distributed databases?
- Data consistency
- Communication failures
- Complex query optimization

### 67. Explain CAP theorem in distributed databases.
A: The CAP theorem states that a distributed system can achieve at most two of the following three properties: Consistency, Availability, and Partition Tolerance.

### 68. What is a two-phase commit protocol (2PC)?
A: A protocol ensuring transaction atomicity in distributed databases by using two phases: prepare and commit.

---

# Object-Relational Database Management Systems (ORDBMS)

### 69. What is ORDBMS?
A: ORDBMS combines the features of relational databases with object-oriented programming, allowing complex data types and object behavior.

### 70. What are the key features of ORDBMS?
- Support for complex data types
- Inheritance
- User-defined types (UDTs)
- Extensibility

### 71. How does ORDBMS differ from RDBMS?
A: ORDBMS supports objects, user-defined data types, and methods, whereas RDBMS supports only predefined data types.

### 72. Name an example of ORDBMS software.
A: PostgreSQL.

### 73. What is a user-defined type (UDT)?
A: A custom data type created by users in ORDBMS to model real-world entities.

### 74. What is the role of inheritance in ORDBMS?
A: It allows new types or classes to inherit properties and methods from existing types.

### 75. What are the advantages of ORDBMS?
- Better handling of complex data
- Object-oriented capabilities
- Backward compatibility with RDBMS

---

# Object-Oriented Database Management Systems (OODBMS)

### 76. What is OODBMS?
A: OODBMS stores data as objects, similar to object-oriented programming, supporting inheritance, polymorphism, and encapsulation.

### 77. What are the key features of OODBMS?
- Object identity
- Complex objects
- Encapsulation
- Inheritance
- Polymorphism

### 78. What is object identity in OODBMS?
A: Every object in OODBMS has a unique identifier that does not change over its lifetime.

### 79. How does OODBMS differ from ORDBMS?
A: OODBMS is purely object-oriented, while ORDBMS combines relational

