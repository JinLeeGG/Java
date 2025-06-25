# Java Operators (2025/06/25)

## 1. Input

### Input Characteristics
- **Cursor is blinking (waiting for input)**
- **Must inform the user what value to input through output before inputting**

### Input Class Declaration
```java
Scanner sc = new Scanner(System.in);
```
**Structure Analysis:**
```java
DataType  Variable = Value
Scanner   sc       = new Scanner(System.in)
String    name     = "John Doe"
```

## 2. Input Methods

### Scanner Input Method Types

| Method | Description | Characteristics |
|--------|-------------|-----------------|
| `next()` | String input | Separates strings using spaces/newlines as delimiters |
| `nextLine()` | String input | Treats spaces/newlines as part of the value and inputs as-is |
| `nextInt()` | Integer input | Receives input as int type |
| `nextDouble()` | Double input | Receives input as double type |

### Difference between next() and nextLine()

#### next() Method
```java
Scanner sc = new Scanner(System.in);
String first = sc.next();   // Input "Hello World" → only "Hello" is stored
String second = sc.next();  // Remaining "World" is automatically stored
```

#### nextLine() Method
```java
Scanner sc = new Scanner(System.in);
String line = sc.nextLine(); // Input "Hello World" → entire "Hello World" is stored
```

---

## 3. Operators

### What are Operators?
**Special characters with functionality**

### Operator Precedence
1. **Highest Precedence Operator**: `( )`
2. **Unary Operators**: `!`
3. **Arithmetic Operators**: `+`, `-`, `*`, `/`, `%`
4. **Shift Operators**
5. **Relational Operators**: `!=`, `==`, `>`, `<`, `>=`, `<=`
6. **Logical Operators**: `&&`, `||`
7. **Ternary Operator**: `condition ? trueValue : falseValue`
8. **Assignment Operator**: `=`

### Associativity
The property where operators of the same precedence are combined and evaluated in the appropriate direction when used multiple times in one expression.

---

## 4. Binary Operators

### Arithmetic Operators
| Operator | Description | Example |
|----------|-------------|---------|
| `+` | Addition | `10 + 10` = 20 |
| `-` | Subtraction | `20 - 7` = 13 |
| `*` | Multiplication | `3 * 7` = 21 |
| `/` | Division (quotient) | `30 / 4` = 7 |
| `%` | Modulus (remainder) | `30 % 4` = 2 |

### Division Operation Precautions
```java
System.out.println(30 / 4);         // 7 (integer)
System.out.println(30 / (double)4); // 7.5 (double)
System.out.println(30 % 4);         // 2 (remainder)
```

**Important:** Calculation between integers results in an integer (automatic type conversion)

---

## 5. Boolean Type

### Boolean Type
- **True**: `true`
- **False**: `false`
- **Size**: 1 byte

### Declaration Method
```java
boolean variableName = value(true, false);
```

---

## 6. Conditional Expressions

### What are Conditional Expressions?
**Expressions that result in either true or false**

### Relational Operators
| Operator | Description | Example |
|----------|-------------|---------|
| `==` | Equal to | `a == b` |
| `!=` | Not equal to | `a != b` |
| `>` | Greater than | `a > b` |
| `<` | Less than | `a < b` |
| `>=` | Greater than or equal to | `a >= b` |
| `<=` | Less than or equal to | `a <= b` |

### Logical Operators
| Operator | Description | Condition | Example |
|----------|-------------|-----------|---------|
| `&&` | AND | True if both conditions are true | `A && B` |
| `||` | OR | True if at least one condition is true | `A || B` |

### Unary Operators
| Operator | Description | Function |
|----------|-------------|----------|
| `!` | NOT | Changes true to false, false to true |

**Example:**
```java
boolean result = !true;  // false
boolean result2 = !false; // true
```

---

## 7. Ternary Operator

### Structure
```java
condition ? trueValue : falseValue
```

### Important Points
- **Must be viewed as a value!**
- Only **values can be written** in true and false positions
- **Use only when there is exactly one condition!**

### Basic Example
```java
int result = 10 > 9 ? 10 : 9;  // result = 10
```

### Nested Ternary Operator
```java
// Grading system
String grade = score >= 90 ? "A" 
             : score >= 80 ? "B" 
             : score >= 70 ? "C" 
             : "F";
```

---

## 8. Practice Examples

### Example 1: Finding Quotient and Remainder
```java
package operatorTest;

import java.util.Scanner;

public class OperTask1 {
    public static void main(String[] args) {
        // Input two integers, calculate and output quotient and remainder
        // ex) Input values: 10 2
        //     Quotient: 5, Remainder: 0
        
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0, quotient = 0, remainder = 0;
        
        System.out.println("Enter two integers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        quotient = num1 / num2;
        remainder = num1 % num2;
        
        System.out.println("Quotient: " + quotient + ", Remainder: " + remainder);
        
        sc.close();
    }
}
```

### Example 2: Kiosk Menu Selection
```java
package operatorTest;

import java.util.Scanner;

public class OperTask2 {
    public static void main(String[] args) {
        // Kiosk
        // Get menu selection from user and output
        // Q. Choose a menu
        // 1. Americano
        // 2. Cafe Latte
        // 3. Ade
        // 4. Milk Tea
        
        Scanner sc = new Scanner(System.in);
        String message = "Q. Choose a menu: \n1. Americano\n2. Cafe Latte\n3. Ade\n4. Milk Tea";
        String result = null, errorMessage = "Invalid input.";
        String menu1 = "Americano", menu2 = "Cafe Latte", menu3 = "Ade", menu4 = "Milk Tea";
        int choice = 0;
        
        System.out.println(message);
        choice = sc.nextInt();
        
        result = choice == 1 ? menu1 
               : choice == 2 ? menu2 
               : choice == 3 ? menu3 
               : choice == 4 ? menu4 : errorMessage; 
        
        System.out.println("You selected: " + result);
        sc.close();
    }
}
```

### Example 3: Grade Assignment
```java
package operatorTest;

import java.util.Scanner;

public class OperTask3 {
    public static void main(String[] args) {
        // Grade assignment
        // 90 or above: A 
        // 80 or above: B
        // 70 or above: C
        // Below 70: F
        
        int score = 0;
        Scanner sc = new Scanner(System.in);
        String result = null;
        String message = "Enter your test score: ";
        String gradeA = "A", gradeB = "B", gradeC = "C", gradeF = "F";
        String errorMessage = "Invalid Input";
        
        System.out.println(message);
        score = sc.nextInt();
        
        result = score >= 90 ? gradeA 
               : score >= 80 ? gradeB 
               : score >= 70 ? gradeC 
               : score < 70 ? gradeF : errorMessage;
        
        System.out.println("Your grade is: " + result);
        sc.close();
    }
}
```

### Example 4: Remainder Check
```java
package operatorTest;

public class OperTest3 {
    public static void main(String[] args) {
        // Ternary operator
        int num1 = 11, num2 = 30;
        
        // If True: output "No remainder", If False: output remainder  
        String result = num2 % num1 == 0 ? "No remainder" : "Remainder: " + num2 % num1; 
        System.out.println(result);
    }
}
```

---

## 9. Key Concepts Summary

### Scanner Usage Precautions
1. **Import statement required**: `import java.util.Scanner;`
2. **Object creation**: `Scanner sc = new Scanner(System.in);`
3. **Resource cleanup**: `sc.close();` (must close after use)

### Ternary Operator Usage Guidelines
- Use only for **simple single conditions**
- Use **if-else statements** for complex conditions
- Prioritize **readability**

### Operator Precedence Memory Aid
1. **Parentheses** first
2. **Unary** operators
3. **Arithmetic** operators
4. **Relational** operators
5. **Logical** operators
6. **Ternary** operator
7. **Assignment** operator

### Logical Operator Truth Table
| A | B | A && B | A \|\| B | !A |
|---|---|--------|----------|----|
| T | T | T | T | F |
| T | F | F | T | F |
| F | T | F | T | T |
| F | F | F | F | T |

---

## 10. Practical Tips

### Variable Default Values
- **Integer**: `0`
- **Double/Float**: `0.0`
- **Character**: `' '` (space character)
- **String**: `null` or `""` (use `""` for string concatenation with `+` operator for type casting)

### Code Writing Precautions
1. **Variable initialization**: Initialize variables to 0 or null before input
2. **Meaningful variable names**: Use purposeful names like `choice`, `result`, `message`
3. **Error handling**: Prepare error messages for invalid inputs

### Performance Considerations
- **Scanner objects** are heavy, create only when necessary
- Consider **StringBuilder** for frequent string operations
- **Complex conditions** are more efficient with if statements than ternary operators