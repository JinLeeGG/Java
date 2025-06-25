# Java Input, Operators (2025/06/25)

## 1. Input in Java

### Input Basics
- **Prompt Before Input**: Always display a message to the user indicating what to enter before waiting for input.
- **Input State**: The cursor blinks, waiting for user input.

### Input Class and Variable Declaration
```java
Scanner sc = new Scanner(System.in);
String name = "Hong Gil-dong";
DataType variable = value;
```

### Input Methods

| Method         | Description                                                                                  |
|----------------|---------------------------------------------------------------------------------------------|
| `next()`       | Reads input up to a space or newline. Each word is stored in order.                         |
| `nextLine()`   | Reads the entire line including spaces until a newline.                                     |
| `nextInt()`    | Reads an integer value.                                                                     |
| `nextDouble()` | Reads a double (floating-point) value.                                                      |

#### Example
```java
String a = sc.next();      // Reads a single word
String b = sc.nextLine();  // Reads the whole line
int n = sc.nextInt();      // Reads an integer
```

## 2. Operators

### What is an Operator?
- **Special symbols** that perform operations on variables and values.

### Operator Precedence

| Priority | Operator Type         | Example/Description         |
|----------|----------------------|-----------------------------|
| 1        | Parentheses          | ( )                         |
| 2        | Unary Operator       | !                           |
| 3        | Arithmetic Operators | +, -, *, /, %               |
| 4        | Shift Operators      | <<, >>                      |
| 5        | Relational Operators | !=, ==, >, <, >=, <=        |
| 6        | Logical Operators    | &&, \|\|                    |
| 7        | Ternary Operator     | condition ? true : false    |
| 8        | Assignment Operators | =, +=, -=, ...              |

### Associativity
- When the same operator appears multiple times in an expression, it is evaluated in the correct direction (left-to-right or right-to-left).

## 3. Binary Operators
- `+`, `-`, `*`, `/`, `%` require two operands.

## 4. Boolean Type

| Value  | Meaning |
|--------|--------|
| true   | True   |
| false  | False  |

- Declaration example: `boolean variable = true;`
- Size: 1 byte

## 5. Conditional Expressions
- **Expressions that result in either true or false.**

### Relational Operators

| Operator | Meaning         |
|----------|----------------|
| ==       | Equal to       |
| !=       | Not equal to   |
| >, <     | Greater, Less  |
| >=, <=   | Greater/Equal, Less/Equal |

### Logical Operators

| Operator | Meaning                                   |
|----------|-------------------------------------------|
| &&       | AND, true if both conditions are true     |
| \|\|     | OR, true if at least one condition is true|

### Unary Operator

| Operator | Meaning                                   |
|----------|-------------------------------------------|
| !        | NOT, inverts true/false                   |

## 6. Ternary Operator
- **Format**: `condition ? true : false`
- Used as a **value**.
- **Example**:
    ```java
    int result = 10 > 9 ? 10 : 9;
    ```
- **When to use**: Only when there is a single condition.

## 7. Practice Examples

### 7.1 Division and Remainder

```java
Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();
int num2 = sc.nextInt();
int division = num1 / num2;
int remainder = num1 % num2;
System.out.println("Quotient: " + division + ", Remainder: " + remainder);
sc.close();
```

### 7.2 Kiosk Menu Selection

```java
Scanner sc = new Scanner(System.in);
String message = "Q. Please select a menu. \n1.Americano\n2.Cafe Latte\n3.Ade\n4.Milk Tea";
System.out.println(message);
int choice = sc.nextInt();
String result = choice == 1 ? "Americano"
             : choice == 2 ? "Cafe Latte"
             : choice == 3 ? "Ade"
             : choice == 4 ? "Milk Tea"
             : "Invalid input.";
System.out.println(result);
sc.close();
```

### 7.3 Grading

```java
Scanner sc = new Scanner(System.in);
System.out.println("Insert your test score: ");
int score = sc.nextInt();
String result = score >= 90 ? "A"
             : score >= 80 ? "B"
             : score >= 70 ? "C"
             : score < 70 ? "F"
             : "Invalid Input";
System.out.println("Your grade is: " + result);
sc.close();
```

### 7.4 Binary Operator Practice

```java
System.out.println(10 + 10);      // 20
System.out.println(20 - 7);       // 13
System.out.println(3 * 7);        // 21
System.out.println(30 / 4);       // 7 (integer division)
System.out.println(30 / (double)4); // 7.5 (floating-point division)
System.out.println(30 % 4);       // 2 (remainder)
```

### 7.5 Ternary Operator Practice

```java
int num1 = 11, num2 = 30;
String result = num2 % num1 == 0 ? "No remainder." : "Remainder: " + num2 % num1;
System.out.println(result);
```

### 7.6 Logical Operator Practice

```java
boolean isTrue = 10 != 11;
System.out.println(10 == 11); // false
System.out.println(isTrue); // true
System.out.println(isTrue && 10 == 10); // true
System.out.println(isTrue && 10 != 10); // false
System.out.println(isTrue || 10 != 10); // true
System.out.println(isTrue && !(10 != 10)); // true
```

### 7.7 Input Practice

#### Add Two Integers (using only next())

```java
Scanner sc = new Scanner(System.in);
String num1 = sc.next();
String num2 = sc.next();
int convertedNum1 = Integer.parseInt(num1);
int convertedNum2 = Integer.parseInt(num2);
System.out.println(convertedNum1 + convertedNum2);
sc.close();
```

#### Multiply Three Integers

```java
Scanner sc = new Scanner(System.in);
System.out.println("Result: " + sc.nextInt() * sc.nextInt() * sc.nextInt());
sc.close();
```

#### Name Input (using nextLine)

```java
Scanner sc = new Scanner(System.in);
System.out.println("Please enter your name.");
String name = sc.nextLine();
System.out.println(name + ", welcome!");
sc.close();
```

## 8. Extra Tips

- **Ctrl + Shift + O**: Automatically import required modules.
- **Declare variables**: Always declare variables at the top of your code.
- **Input prompt**: Always display a prompt with an example before input.

## 9. Operator Precedence Table

| Priority | Operator Type         | Example/Description         |
|----------|----------------------|-----------------------------|
| 1        | ( )                  | Parentheses                 |
| 2        | !                    | NOT                         |
| 3        | *, /, %              | Multiplication, Division, Modulo |
| 4        | +, -                 | Addition, Subtraction       |
| 5        | <<, >>               | Shift                       |
| 6        | <, >, <=, >=         | Relational operators        |
| 7        | ==, !=               | Equality/Inequality         |
| 8        | &&                   | Logical AND                 |
| 9        | \|\|                 | Logical OR                  |
| 10       | =, +=, -=, ...       | Assignment operators        |

## 10. Practice Tips & Cautions

- **Input prompt**: Always show a prompt with an example before input.
- **Close Scanner**: Always close the Scanner after use to prevent resource leaks.
- **Type conversion**: Use `Integer.parseInt()` to convert string input to integer if needed.
- **Ternary operator**: Use only when there is a single condition; for complex conditions, use if statements.

## 11. Summary

- Learned how to receive input in Java and use various operators (arithmetic, logical, relational, ternary, etc.).
- Strengthened skills in input, output, and operator usage through practice.
- Good habits: prompt before input, declare variables at the top, manage resources (close Scanner).

> **Run and experiment with the sample codes to deepen your understanding!**
```

