# Java Day 02 Lecture Notes - Java Data types, Variables, Casting (2025/06/24)

## 1. Control Characters (Escape Sequences)

Control characters **must be written inside quotation marks**.

| Control Character | Description | Usage |
|-------------------|-------------|-------|
| `\n` | new line | Line break, newline character |
| `\t` | tab | Tab spacing for alignment |
| `\"` | " expression | Display double quote |
| `\'` | ' expression | Display single quote |
| `\\` | \ expression | Display backslash |

## 2. Output Methods

### Method Types
- **`print()`**: Does not automatically add line break at the end, continues output on same line
- **`println()`**: Automatically adds line break at the end
- **`printf()`**: Changes format using format specifiers

### Purpose of Output Methods
- Inspect transmitted and received data
- Specify and check error occurrence points

### Format Characters (Format Specifiers)
Must be written inside quotation marks and used with `printf()` method.

| Format Character | Description | Usage |
|------------------|-------------|-------|
| `%d` | decimal | 10-base integer |
| `%o` | octal | 8-base integer |
| `%x` | hexadecimal | 16-base integer |
| `%f` | float | Real number |
| `%c` | character | Single character |
| `%s` | string | String |

#### Example Code
```java
String name = "Gyujin Lee";
int age = 22;
double height = 172.02;

// Regular string concatenation
System.out.println("My name is " + name + ", age is " + age + " years old, my height is " + height +" cm.");

// Using printf (recognizes in order)
System.out.printf("My name is %s, age is %d years old, my height is %f cm.", name, age, height);
```

## 3. Data Types

### Primitive Data Types Table

| Data Type | Type | Byte | Value Examples | Notes |
|-----------|------|------|----------------|-------|
| Integer | `int` | 4 | 10, 302, 3321, -1 | Default type |
| Real Number | `float` | 4 | 10.5F, -0.9F, 0.0F | F indicates float |
| | `double` | 8 | 10.5, 0.6, 123.456 | |
| Boolean | `boolean` | 1 | true, false | |
| Character | `char` | 2 | '김', 'A', '0' | Single character, single quotes |
| String | `String` | ? | "홍길동", "ABC", "A" | Double quotes |

### Important Notes
- **float**: F indicates float type (e.g., `10.5F`)
- **char**: In Java, single character is represented as char type, uses single quotes (`'`)
- **String**: String values use double quotes (`"`)
- **Type conversion**: float(4byte) can fit into double(8byte), but reverse is not possible

## 4. Variables

### Variable Declaration Guidelines
1. Cannot declare variables with the same name
2. Initialize variables
3. Preferably declare all variables at once in the declaration section (top of scope)

### Variable Naming Rules
- Must start with a letter
- Cannot use special characters (except `_` is allowed)
- Start with lowercase letter
- Cannot use spaces
- Avoid using Korean characters
- Use nouns
- Use meaningful words

### Variable Declaration Examples
```java
// Individual declaration
int num1 = 5;
int num2 = 98590;

// Multiple variable declaration at once
int num1 = 5, num2 = 98590;
char char1 = 'b', char2 = 'S', char3 = 'D';
```

### Assignment Operator
- `=` is the assignment operator (means putting a value)
- Must define variable and type together (static binding)

## 5. Constants

### What are Constants?
- Numbers that always remain the same
- Purpose is to prevent value changes

### Reasons for Using Constants
1. To give meaning to meaningless values
2. To prevent typos

### Constant Declaration
```java
final int CODE = 1234567;
// CODE = 2000; // Error! Cannot change value of final constant
```

## 6. Type Casting

### Automatic Type Conversion
- **Real number + Integer = Real number**
- **String + Value = String**

#### Automatic Type Conversion Examples
```java
System.out.println(20 + "");      // "20" (String)
System.out.println(1 + 1);        // 2 (Integer)
System.out.println(1 + 2.5);      // 3.5 (Real number)
System.out.println("1" + 1);      // "11" (String)
System.out.println(5/2);          // 2 (Integer)
```

### Explicit Type Casting
```java
System.out.println(5/(double)2);  // 2.5 (Real number)
System.out.println((int)8.43);    // 8 (Decimal places removed)
System.out.println((int)8.43 + (int)2.59); // 10
```

### ASCII Code Utilization
```java
System.out.println('A' + 10);     // 75 (A=65, 65+10=75)
System.out.println((char)('A' + 10)); // 'K'

// Convert lowercase to uppercase (A=65, a=97, difference=32)
System.out.println((char)('a' - 32)); // 'A'
System.out.println((char)('j' - 32)); // 'J'
System.out.println((char)('k' - 32)); // 'K'
```

## 7. String Type Conversion

### 1. Other Data Types → String
```java
// Automatic type conversion
System.out.println("1" + 3);        // "13"
System.out.println("1" + 3 + 8);    // "138" (left associativity)
System.out.println("1" + (3 + 8));  // "111"

// Using String.valueOf() method
String str1 = String.valueOf(3.9);  // "3.9"
```

### 2. String → Other Data Types
**Primitive data types can only be converted among themselves**, so since String type is a class type, it needs help from the class types of primitive data types.

| Conversion Method | Method | Example |
|-------------------|--------|---------|
| String → int | `Integer.parseInt()` | `int num = Integer.parseInt("20");` |
| String → boolean | `Boolean.parseBoolean()` | `boolean flag = Boolean.parseBoolean("true");` |
| String → double | `Double.parseDouble()` | `double num = Double.parseDouble("3.9");` |
| String → float | `Float.parseFloat()` | `float num = Float.parseFloat("3.9F");` |

### Type Conversion Examples
```java
double num1 = Double.parseDouble("3.9");      // 3.9 (double)
boolean isTrue = Boolean.parseBoolean("true"); // true (boolean)
int num2 = Integer.parseInt("20");             // 20 (int)
```

## 8. Practice Examples

### Example 1: Calculation using Type Conversion
```java
int num1 = 1;
String str1 = "8.24", str2 = "7.8";

// Making 115 with num1 + str1 + str2
String st = String.valueOf(num1);              // "1"
double numStr1 = Double.parseDouble(str1);     // 8.24
double numStr2 = Double.parseDouble(str2);     // 7.8
System.out.println(st + ((int)numStr1 + (int)numStr2)); // "1" + 15 = "115"
```

### Example 2: Character Conversion
```java
// Convert 'a', 'j', 'k' to output 'A', 'J', 'K'
System.out.println((char)('a' - 32)); // 'A'
System.out.println((char)('j' - 32)); // 'J'
System.out.println((char)('k' - 32)); // 'K'
```

## 9. Useful Shortcuts
- **Copy line**: `Ctrl + Alt + Up/Down Arrow`

## 10. Important Concepts Summary

### Left Associativity
In Java, code is read from left to right, so the order of operations is important.
```java
System.out.println("1" + 3 + 8);    // "138"
System.out.println("1" + (3 + 8));  // "111"
```

### Static Binding
In Java, variables and types must be defined together.
```java
int x = 10;        // Correct declaration
String name = "Kim"; // Correct declaration
```

### Class Type vs Primitive Data Type
- **Primitive Data Types**: int, double, float, boolean, char
- **Class Type**: String
- Since String is a class type, special methods are needed for type conversion with primitive data types.

## 11. Additional Programming Concepts

### Backend Language Usage
- Java is a backend language
- Used for password encryption and security features
- ASCII code manipulation is commonly used in cryptography

### Memory Management
- Different data types use different amounts of memory
- Understanding byte sizes helps with memory optimization
- Type casting can affect memory usage and performance

### Best Practices
- Always initialize variables when declaring them
- Use meaningful variable names for code readability
- Group variable declarations at the top of code blocks
- Use constants for values that shouldn't change
- Be careful with type conversions to avoid data loss