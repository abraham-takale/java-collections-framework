# Java Collections Framework

A practical learning repository covering the Java Collection Framework with individual Java classes, examples, and explanations.

## About This Project

This repository demonstrates how to store, access, update, search, sort, and remove data using Java Collections.

Each collection class has its own Java file to make learning and practicing easier.

## Topics Covered

### 1. List Interface

- ArrayList
- LinkedList
- Vector
- Stack

### 2. Set Interface

- HashSet
- LinkedHashSet
- TreeSet

### 3. Queue Interface

- PriorityQueue
- ArrayDeque
- LinkedList as Queue

### 4. Map Interface

- HashMap
- LinkedHashMap
- TreeMap
- Hashtable

### 5. Generics

- Generic Classes
- Generic Methods
- Type Safety

### 6. Collections Utility

- Sorting
- Reversing
- Searching
- Maximum and Minimum
- Frequency
- Shuffling

## Project Structure

```text
src/
├── list/
├── set/
├── queue/
├── map/
├── generics/
└── utility/
```

## Technologies Used

- Java
- Java Collection Framework
- Object-Oriented Programming
- Visual Studio Code

## Requirements

- Java JDK 17 or later
- VS Code or IntelliJ IDEA

## How to Run

### 1. Clone the repository

```bash
git clone https://github.com/abraham-takale/java-collections-framework.git
```

### 2. Enter the project directory

```bash
cd java-collections-framework
```

### 3. Compile the Java files (PowerShell)

```powershell
$files = Get-ChildItem -Recurse src -Filter *.java |
    ForEach-Object { $_.FullName }

javac -d out $files
```

### 4. Run an example

```bash
java -cp out list.ArrayListExample
```

## Learning Objectives

- Understand the Java Collection Framework.
- Learn the differences between collection classes.
- Practice Java Generics.
- Improve Data Structures and Algorithms skills.
- Develop practical Java programming skills.

## Author

Abraham

## License

This project is intended for educational purposes.
