# 🔄 Mastering Recursion: Code Companion & Guide

[![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.java.com/)
[![CS Fundamentals](https://img.shields.io/badge/Category-Data%20Structures%20%26%20Algorithms-007ACC?style=for-the-badge)](https://en.wikipedia.org/wiki/Recursion_(computer_science))

Welcome to the **Recursion Companion**! This repository is a curated collection of recursion problems, ranging from absolute beginner basics to advanced backtracking and dynamic programming prerequisites. 

This README serves as both a roadmap to the repository and an educational cheat sheet to help you master the "recursive mindset."

---

## 🧠 What is Recursion?

Recursion is a programming technique where a **function calls itself** to solve a smaller instance of the same problem. Think of it as peeling an onion: you keep peeling layers (subproblems) until you reach the core (the base case), and then you build your way back out.

---

## 🔍 How to Identify Recursion Problems

You can generally solve a problem using recursion if it exhibits the following traits:

1. **Subproblem Structure:** The larger problem can be naturally broken down into smaller, identical subproblems.
2. **Choice-Based Decisions:** You have to make a choice at each step (e.g., "should I include this element or exclude it?").
3. **Keywords to Look For:**
   * *"Find all possible combinations/permutations/subsets..."*
   * *"Compute the $n$-th term..."*
   * *"Traverse all paths..."*
   * *"Divide and conquer..."*

### The 3 Golden Steps to Writing Any Recursive Function

Every recursive function follows this exact blueprint:

```java
public int solve(int n) {
    // 1. BASE CASE: The halting condition. Prevents StackOverflow.
    if (n <= 1) {
        return n;
    }
    
    // 2. RECURSIVE RELATION: Calling the function with a smaller input.
    int smallerOutput = solve(n - 1);
    
    // 3. SELF-WORK: Final computation combining the result.
    return n + smallerOutput; 
}
```

---

## 🌀 Types of Recursion

Understanding the types of recursion helps you optimize your code and understand how the **Call Stack** behaves.

| Type | Description | Visualization |
| :--- | :--- | :--- |
| **Linear Recursion** | The function makes a single recursive call per execution. | `A() -> A() -> A() -> Base` |
| **Tree Recursion** | The function makes multiple recursive calls, creating a tree-like execution graph. | `A() -> B() & C()` |
| **Tail Recursion** | The recursive call is the *very last* operation. No work is left to do after the call. | `return solve(n - 1, accumulator)` |
| **Non-Tail Recursion** | There is pending work (like addition or multiplication) after the recursive call returns. | `return n * solve(n - 1)` |
| **Indirect Recursion** | Function `A` calls Function `B`, and Function `B` calls Function `A`. | `A() -> B() -> A()` |
| **Nested Recursion** | A recursive function passes a recursive call to itself as an argument. | `solve(solve(n - 1))` |

---

## 📂 Repository Structure

The code inside this repository is organized by difficulty and pattern to help you learn step-by-step:

```text
recursion/
├── 01-Basic/              # Factorial, Fibonacci, Print 1 to N, Sum of Digits
├── 02-Arrays/             # Linear Search, Binary Search, Check Sorted Array
├── 03-Strings/            # Reverse String, Subsequences, Skip a Character
├── 04-Sorting/            # Merge Sort, Quick Sort using recursion
├── 05-Backtracking/       # N-Queens, Maze Path, Permutations, Sudoku Solver
└── README.md              # Documentation & Guide
```

---

## ⚡ The Recursion Stack: Under the Hood

Every time a recursive call is made, an activation record (stack frame) is pushed onto the **Call Stack**. It contains local variables and the return address.

```text
[ solve(1) ] -> Returns 1 (Base Case reached! Stack starts popping)
[ solve(2) ] -> Waits for solve(1)
[ solve(3) ] -> Waits for solve(2)
[   Main   ] -> Program Starts
```
⚠️ **Beware of `StackOverflowError`:** This happens if your base case is missing, incorrect, or if your inputs are too deep, exceeding the maximum call stack size.

---

## 🛠️ How to Use This Repository

### Prerequisites
- Install **Java Development Kit (JDK 11 or higher)**.
- Any terminal or IDE (VS Code, IntelliJ IDEA, Eclipse).

### Running a File
1. Clone this repository:
   ```bash
   git clone [https://github.com/tejas1598/recursion_repo.git](https://github.com/tejas1598/recursion_repo.git)
   ```
2. Navigate to the desired directory:
   ```bash
   cd recursion/01-Basic
   ```
3. Compile and run the Java file:
   ```bash
   javac Factorial.java
   java Factorial
   ```

---

## 🤝 Contributing

Have an optimized approach or want to add a new recursion problem? 
1. Fork this repository.
2. Create your branch: `git checkout -b feature/NewProblem`
3. Commit your changes: `git commit -m 'Added Permutations Solution'`
4. Push to the branch: `git push origin feature/NewProblem`
5. Open a Pull Request!

---

## 📧 Contact

**Tejas** - [GitHub Profile](https://github.com/tejas1598)  
**Project Link:** [https://github.com/tejas1598/recursion_repo](https://github.com/tejas1598/recursion_repo)
