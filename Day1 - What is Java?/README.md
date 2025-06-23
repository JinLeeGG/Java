# Day1 - What is Java? (2025/06/23)

## What is a Programming Language?
A programming language is a language that allows developers and computers to communicate. It serves as a medium to convert human language into a form that computers can understand and execute commands.

## History of Java

Java is an object-oriented programming language developed by **James Gosling** and other researchers at Sun Microsystems.

### Origin of the Name
- Initially called **"Oak"** or **"Green"** after an oak tree outside the office
- Finally chose **"Java"** randomly selected from a word list
- The name Java was chosen because developer James Gosling was a complete Java coffee enthusiast who drank over 10 cups of Java coffee daily

### Key Characteristics
- **Object-Oriented Programming Language**
- **Platform Independence** (Write Once, Run Anywhere)
- **High Portability**

## Basic Terminology

### Source Code
- Written instructions/commands
- Content written for developers and computers to communicate

### Source File
- A file containing source code
- In Java, files have `.java` extension

### Compile
- The process of converting human language (high-level language) into computer-understandable language (machine code)
- In Java, converts `.java` files to `.class` files

### Compiler
- A program or command that performs compilation
- In Java, uses the `javac` command

### Console
- A window that displays the results of communication between developers and computers
- Shows program output or error messages

### Program
- A well-structured framework built with source code
- A collection of instructions designed to perform specific tasks

## Program Execution Structure Comparison

### General Program
```
Program
    ↓
OS (Operating System) - Sends appropriate electrical signals to hardware
    ↓
Hardware
```

### Java Program
```
Java Program
    ↓
JVM - Translates Java programs to match the OS
    ↓
OS (Operating System) - Sends appropriate electrical signals to hardware
    ↓
Hardware
```

**※ Java programs have excellent portability thanks to JVM.**

## Java Runtime Environment

### JVM (Java Virtual Machine)
- Executes Java programs and translates them to match the operating system
- Core component providing platform independence
- Converts bytecode (.class) to machine code

### JRE (Java Runtime Environment)
- Creates JVM and contains library files needed for execution
- Minimum environment required to run Java programs
- JVM + Java class libraries + other files

### JDK (Java Development Kit)
- Contains development tools in addition to JRE
- Includes compile command (`javac`) and execution command (`java`)
- Complete environment for developers to develop Java programs

```
JDK ⊃ JRE ⊃ JVM
```

## Basic Structure of Java Programs

### Hierarchical Structure
```
Project
└── Package
    └── Class (First letter capitalized)
        └── Method (name())
            └── Source Code
```

### Basic Class Structure Example
```java
package com.example.myproject;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## Comments

Comments are used for the following purposes:
1. **Writing explanatory text** - Explaining code behavior or purpose
2. **When you don't want to compile code** that is not currently being used

### Types of Comments and Shortcuts

#### Single-line Comment
- **Syntax**: `//`
- **Shortcut**: `Ctrl + /`
```java
// This is a single-line comment
int number = 10; // Variable declaration
```

#### Multi-line Comment
- **Syntax**: `/* */`
- **Shortcut**: `Ctrl + Shift + /`
```java
/*
 * This is a multi-line comment
 * Used for long explanations or temporarily disabling code
 */
```

#### Documentation Comment (Additional)
- **Syntax**: `/** */`
- Used for API documentation generation
```java
/**
 * This method adds two numbers
 * @param a first number
 * @param b second number
 * @return sum of two numbers
 */
public int add(int a, int b) {
    return a + b;
}
```

## Additional Learning Points

### Key Features of Java
- **Object-Oriented Programming**: Programming based on classes and objects
- **Automatic Memory Management**: Memory management through garbage collection
- **Strong Type Checking**: Type error detection at compile time
- **Multithreading Support**: Support for concurrent programming

### Development Environment Setup
1. **Install JDK**: Oracle JDK or OpenJDK
2. **Set Environment Variables**: JAVA_HOME, PATH
3. **Choose IDE**: Eclipse, IntelliJ IDEA, Visual Studio Code, etc.

### Recommended Learning Sequence
1. Basic Syntax (Variables, Data Types, Operators)
2. Control Structures (Conditional statements, Loops)
3. Object-Oriented Programming (Classes, Inheritance, Polymorphism)
4. Exception Handling
5. Collection Framework
6. Input/Output Processing

## Java Compilation and Execution Process

### Step-by-Step Process
1. **Write Source Code**: Create `.java` file
2. **Compile**: Use `javac` to create `.class` file (bytecode)
3. **Execute**: Use `java` command to run the program through JVM

### Command Examples
```bash
# Compile Java source file
javac HelloWorld.java

# Run compiled Java program
java HelloWorld
```

## Basic Java Program Structure

### Minimal Java Program
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Key Components Explained
- **`public class HelloWorld`**: Class declaration (must match filename)
- **`public static void main(String[] args)`**: Entry point of the program
- **`System.out.println()`**: Output statement to console

## Java Naming Conventions

### Classes
- Start with uppercase letter
- Use PascalCase
- Example: `HelloWorld`, `StudentManager`

### Methods
- Start with lowercase letter
- Use camelCase
- Example: `getName()`, `calculateTotal()`

### Variables
- Start with lowercase letter
- Use camelCase
- Example: `studentName`, `totalScore`

### Packages
- All lowercase
- Use reverse domain naming
- Example: `com.company.project`

## Best Practices for Beginners

1. **Always use meaningful names** for classes, methods, and variables
2. **Follow Java naming conventions** consistently
3. **Use comments** to explain complex logic
4. **Keep methods short** and focused on single tasks
5. **Handle exceptions** properly
6. **Practice regularly** with small programs
7. **Read official Java documentation** for reference

## Common Beginner Mistakes to Avoid

1. **Case sensitivity**: Java is case-sensitive (`Hello` ≠ `hello`)
2. **Missing semicolons**: Every statement must end with `;`
3. **Mismatched braces**: Always ensure `{` has matching `}`
4. **Filename mismatch**: Class name must match filename exactly
5. **Incorrect main method**: Must be `public static void main(String[] args)`