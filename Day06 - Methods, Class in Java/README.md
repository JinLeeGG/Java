# Method and Class in Java (2025/06/30)

## 🏛️ Classes

In Java, a **class** is a blueprint for creating objects. It's a way to bundle data (variables) and methods (functions) that work on that data into a single unit. Think of it as a template that defines the common properties and behaviors of a certain type of object.

### Class Declaration

You declare a class using the `class` keyword.

```java
class ClassName {
    // Fields (variables and methods)
}
```

  - **Fields**: These are the variables and methods that belong to the class.

### Using Class Fields: Instantiation

To use the fields of a class, you first need to create an **object** from it. This process is called **instantiation**. Instantiation turns the abstract blueprint (the class) into a concrete thing (the object) in memory.

  - **Syntax**: `ClassName objectName = new ClassName();`
  - This creates an *instance* of the class, also known as an *instance variable* or *object*.

<!-- end list -->

```mermaid
graph TD
    A[Class (Blueprint)] -- Instantiation --> B(Object 1);
    A -- Instantiation --> C(Object 2);
    A -- Instantiation --> D(Object 3);
```

-----

## 🏗️ Constructors

A **constructor** is a special method used to initialize a newly created object. It's called automatically when you use the `new` keyword.

  - It has the **same name as the class**.
  - It **does not have a return type**, not even `void`.
  - Its main job is to allocate memory for the object's fields and return the memory address.

| Feature         | Method                               | Constructor                          |
| :-------------- | :----------------------------------- | :----------------------------------- |
| **Purpose** | To perform an operation              | To initialize an object              |
| **Name** | Can be any legal identifier          | Must be the same as the class name   |
| **Return Type** | Must have a return type (or `void`)  | Has no return type                   |
| **Invocation** | Called explicitly by the programmer  | Called implicitly when creating an object |

### Default Constructor

If you don't define any constructor in a class, the Java compiler automatically provides a **default constructor**.

  - It has **no parameters**.
  - Its body is empty.
  - It is **not** created automatically if you define *any* other constructor yourself.

### The `this` Keyword

Inside a method or constructor, `this` is a reference variable that refers to the **current object**—the object whose method or constructor is being called. It's used to distinguish between instance variables and local variables when they have the same name.

  - When an object is created, its memory address is automatically stored in the `this` variable. This allows the object to know which specific instance's fields it should access.

### Example: `Company` Class

```java
package classTest;

// Abstraction: Representing essential features without including background details.
public class Company {
    String name;
    int age;
    int income;

    // Default constructor
    public Company() {;}

    // Initializer constructor
    public Company(String name, int age) {
        // 'this.name' refers to the instance variable 'name'
        // 'name' refers to the parameter 'name'
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        // Creating objects (instances) of the Company class
        Company employee1 = new Company("홍길동", 20);
        System.out.println(employee1.name); // Output: 홍길동

        Company employee2 = new Company("김길동", 45);
        System.out.println(employee2.name); // Output: 김길동

        Company employee3 = new Company("장독대", 15);
        System.out.println(employee3.name); // Output: 장독대
    }
}
```

-----

## 🛠️ Methods

A **method** defines the behavior of an object. It's a block of code that runs when it is called.

### Method Declaration & Usage

```java
// Declaration
returnType methodName(parameter1, parameter2, ...) {
    // method body
    return value; // if returnType is not void
}
```

To use a method, you must create an instance of its class first.

```java
// MethodTest.java
package methodTest;

public class MethodTest {

    // Method that doesn't return a value (void)
    void printTest(String name) {
        System.out.println(name);
    }

    // Method that returns an integer
    int sumTest(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // 1. Create an object
        MethodTest mt = new MethodTest();

        // 2. Call the methods
        mt.printTest("홍길동"); // Output: 홍길동

        int result = mt.sumTest(20, 30);
        System.out.println(result); // Output: 50
    }
}
```

### Reference vs. Value in Methods

When you pass a variable to a method, Java's behavior depends on the variable's type.

  - **Primitive Types (int, double, etc.)**: A copy of the value is passed (**Pass by Value**). Changes inside the method do not affect the original variable.
  - **Reference Types (Arrays, Objects)**: A copy of the memory address is passed (**Pass by Reference**). Changes made to the object's fields inside the method **will** affect the original object.

#### Example: `LocationTest`

```java
// LocationTest.java
package methodTest;

public class LocationTest {

    // This method receives a reference to an array.
    int[] test(int[] data) {
        // Modifying the array at the given memory address
        data[0] = 20;
        return data;
    }

    public static void main(String[] args) {
        LocationTest lt = new LocationTest();
        int[] data = {50};

        System.out.println("Before calling test(): " + data[0]); // Output: 50
        lt.test(data); // Pass the reference of 'data' to the method
        System.out.println("After calling test(): " + data[0]);  // Output: 20
    }
}
```

In this example, the `test` method modifies the original `data` array because it receives its memory address.

### Variable-Length Arguments (Varargs)

Varargs allow a method to accept zero or more arguments of a specified type. This is useful when you don't know how many arguments will be passed to the method.

  - **Syntax**: `returnType methodName(DataType... variableName)`
  - Inside the method, the varargs are treated as an array.

#### Example: Find Max Number

```java
// MethodTask2.java (partial)
int getMax2(int... numbers) {
    int max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
        if (max < numbers[i]) {
            max = numbers[i];
        }
    }
    return max;
}

// Usage
// getMax2(10, 20, 30, 40, 50); -> returns 50
```

### Method Examples & Tasks

Here are some practical method examples.

#### Task 1: Basic Operations

```java
// MethodTask1.java
public class MethodTask1 {

    // 1. Returns double the value of an integer
    int multipleBy2(int num) {
        return num * 2;
    }

    // 2. Prints a name n times
    void printName(String name, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(name);
        }
    }
}
```

#### Task 2: Array and Varargs

```java
// MethodTask2.java
public class MethodTask2 {

    // 1. Returns the larger of two numbers
    int getMax(int num1, int num2) {
        if (num1 == num2) { return -1; } // Or handle as an error
        return num1 > num2 ? num1 : num2;
    }

    // 2. Calculates the average of an integer array
    double getAverage(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return (double)total / arr.length; // Cast to double for accurate division
    }

    // 3. Counts zeros and ones using varargs
    String getCountZeroAndOne(int... numbers) {
        int zeroCount = 0;
        int oneCount = 0;
        for (int num : numbers) {
            if (num == 0) {
                zeroCount++;
            } else if (num == 1) {
                oneCount++;
            }
        }
        return "Result)\n0's count: " + zeroCount + "\n1's count: " + oneCount;
    }
}
```

#### Task 3: String Manipulation

```java
// MethodTask3.java
public class MethodTask3 {

    // 1. Removes all 'a' characters from a string
    // Uses charAt(index) to get a character at a specific position
    void removeA(String content) {
        String result = "";
        for (int i = 0; i < content.length(); i++) {
            if (content.charAt(i) != 'a') {
                result += content.charAt(i);
            }
        }
        System.out.println(result); // Output: 가나다라마바
    }

    // 2. Reverses a string
    String reverse(String content) {
        String result = "";
        for (int i = content.length() - 1; i >= 0; i--) {
            result += content.charAt(i);
        }
        return result; // returns "gfedcba" for "abcdefg"
    }
}
```

#### Useful String Methods

  - `str.split(delimiter)`: Splits a string into an array of substrings based on a delimiter.
      - `"a.b.c".split("\\.")` -\> `{"a", "b", "c"}` (The dot `.` is a special character in regex and needs to be escaped with `\\`)
  - `str.indexOf(char)`: Returns the index of the first occurrence of a character.
  - `str.charAt(index)`: Returns the character at a specific index.



