# Java 입력, 연산자 (2025/06/25)

## 1. 입력 (Input)

### 입력의 특징
- **커서가 깜빡이고 있는 상태**
- 입력하기 전에 **출력을 통해 어떤 값을 입력해야 할지 사용자에게 알려주어야 한다**

### 입력 클래스 선언
```java
Scanner sc = new Scanner(System.in);
```
**구조 분석:**
```java
자료형    변수 = 값
Scanner  sc  = new Scanner(System.in)
String   name = "홍길동"
```

## 2. 입력 메서드

### Scanner 입력 메서드 종류

| 메서드 | 설명 | 특징 |
|--------|------|------|
| `next()` | 문자열 입력 | 공백/줄바꿈을 구분점으로 문자열 분리 |
| `nextLine()` | 문자열 입력 | 공백/줄바꿈도 값으로 취급하여 그대로 입력받음 |
| `nextInt()` | 정수 입력 | int 타입으로 입력받음 |
| `nextDouble()` | 실수 입력 | double 타입으로 입력받음 |

### next() vs nextLine() 차이점

#### next() 메서드
```java
Scanner sc = new Scanner(System.in);
String first = sc.next();   // "Hello World" 입력 시 "Hello"만 저장
String second = sc.next();  // 남은 "World"가 자동으로 저장됨
```

#### nextLine() 메서드
```java
Scanner sc = new Scanner(System.in);
String line = sc.nextLine(); // "Hello World" 입력 시 "Hello World" 전체 저장
```

---

## 3. 연산자 (Operators)

### 연산자란?
**기능이 있는 특수문자**

### 연산자의 우선순위
1. **최우선 연산자**: `( )`
2. **단항 연산자**: `!`
3. **산술 연산자**: `+`, `-`, `*`, `/`, `%`
4. **쉬프트 연산자**
5. **관계 연산자**: `!=`, `==`, `>`, `<`, `>=`, `<=`
6. **논리 연산자**: `&&`, `||`
7. **삼항 연산자**: `조건식 ? 참값 : 거짓값`
8. **대입 연산자**: `=`

### 결합성 (Associativity)
하나의 수식에 동일한 연산자가 여러 번 사용되면 알맞은 방향으로 결합되어 연산되는 성질

---

## 4. 이항 연산자 (Binary Operators)

### 산술 연산자
| 연산자 | 설명 | 예시 |
|--------|------|------|
| `+` | 덧셈 | `10 + 10` = 20 |
| `-` | 뺄셈 | `20 - 7` = 13 |
| `*` | 곱셈 | `3 * 7` = 21 |
| `/` | 나눗셈 (몫) | `30 / 4` = 7 |
| `%` | 나머지 | `30 % 4` = 2 |

### 나눗셈 연산 주의사항
```java
System.out.println(30 / 4);         // 7 (정수)
System.out.println(30 / (double)4); // 7.5 (실수)
System.out.println(30 % 4);         // 2 (나머지)
```

**중요:** 정수와 정수의 계산은 정수 결과가 나온다 (자동 형변환)

---

## 5. 논리형 (Boolean)

### Boolean 타입
- **참**: `true`
- **거짓**: `false`
- **크기**: 1byte

### 선언 방법
```java
boolean 변수명 = 값(true, false);
```

---

## 6. 조건식 (Conditional Expressions)

### 조건식이란?
**결과가 참 또는 거짓, 둘 중 하나가 나오는 식**

### 관계 연산자 (Relational Operators)
| 연산자 | 설명 | 예시 |
|--------|------|------|
| `==` | 같다 | `a == b` |
| `!=` | 같지 않다 | `a != b` |
| `>` | 초과 (크다) | `a > b` |
| `<` | 미만 (작다) | `a < b` |
| `>=` | 이상 (크거나 같다) | `a >= b` |
| `<=` | 이하 (작거나 같다) | `a <= b` |

### 논리 연산자 (Logical Operators)
| 연산자 | 설명 | 조건 | 예시 |
|--------|------|------|------|
| `&&` | AND | 두 조건식 모두 참이면 참 | `A && B` |
| `||` | OR | 둘 중 하나라도 참이면 참 | `A || B` |

### 단항 연산자 (Unary Operators)
| 연산자 | 설명 | 기능 |
|--------|------|------|
| `!` | NOT | 조건식이 참이면 거짓으로, 거짓이면 참으로 변경 |

**예시:**
```java
boolean result = !true;  // false
boolean result2 = !false; // true
```

---

## 7. 삼항 연산자 (Ternary Operator)

### 구조
```java
조건식 ? 참값 : 거짓값
```

### 중요 사항
- **값으로 봐야 한다!**
- 참과 거짓 자리에는 **값만 작성할 수 있다**
- **조건식이 딱 한 개 있을 때에만 사용하자!**

### 기본 예제
```java
int result = 10 > 9 ? 10 : 9;  // result = 10
```

### 복합 삼항 연산자 (Nested Ternary)
```java
// 성적 등급 매기기
String grade = score >= 90 ? "A" 
             : score >= 80 ? "B" 
             : score >= 70 ? "C" 
             : "F";
```

---

## 8. 실습 예제

### 예제 1: 몫과 나머지 구하기
```java
package operatorTest;

import java.util.Scanner;

public class OperTask1 {
    public static void main(String[] args) {
        // 두 정수를 입력하면, 몫과 나머지를 구해서 출력하기
        // ex) 입력한 값: 10 2
        //     몫: 5, 나머지: 0
        
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0, division = 0, remainder = 0;
        
        System.out.println("두 정수를 입력하세요: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        division = num1 / num2;
        remainder = num1 % num2;
        
        System.out.println("몫: " + division + ", 나머지: " + remainder);
        
        sc.close();
    }
}
```

### 예제 2: 키오스크 메뉴 선택
```java
package operatorTest;

import java.util.Scanner;

public class OperTask2 {
    public static void main(String[] args) {
        // 키오스크
        // 사용자에게 메뉴 선택 받아 출력해주기
        // Q. 메뉴를 고르세요
        // 1. 아메리카노
        // 2. 카페라떼
        // 3. 에이드
        // 4. 밀크티
        
        Scanner sc = new Scanner(System.in);
        String message = "Q. 메뉴를 고르세요. \n1.아메리카노\n2.카페라떼\n3.에이드\n4.밀크티";
        String result = null, errorMessage = "잘못 입력하셨습니다.";
        String menu1 = "아메리카노", menu2 = "카페라떼", menu3 = "에이드", menu4 = "밀크티";
        int choice = 0;
        
        System.out.println(message);
        choice = sc.nextInt();
        
        result = choice == 1 ? menu1 
               : choice == 2 ? menu2 
               : choice == 3 ? menu3 
               : choice == 4 ? menu4 : errorMessage; 
        
        System.out.println("선택하신 메뉴: " + result);
        sc.close();
    }
}
```

### 예제 3: 성적 등급 매기기
```java
package operatorTest;

import java.util.Scanner;

public class OperTask3 {
    public static void main(String[] args) {
        // 성적 등급 매기기
        // 90이상 A 
        // 80이상 B
        // 70이상 C
        // 70미만은 F
        
        int score = 0;
        Scanner sc = new Scanner(System.in);
        String result = null;
        String message = "시험 점수를 입력하세요: ";
        String gradeA = "A", gradeB = "B", gradeC = "C", gradeF = "F";
        String ErrorM = "잘못된 입력입니다";
        
        System.out.println(message);
        score = sc.nextInt();
        
        result = score >= 90 ? gradeA 
               : score >= 80 ? gradeB 
               : score >= 70 ? gradeC 
               : score < 70 ? gradeF : ErrorM;
        
        System.out.println("당신의 등급은: " + result);
        sc.close();
    }
}
```

### 예제 4: 나머지 검사
```java
package operatorTest;

public class OperTest3 {
    public static void main(String[] args) {
        // 삼항 연산자
        int num1 = 11, num2 = 30;
        
        // True인 경우 "나머지가 없습니다." 출력, False인 경우 나머지 출력  
        String result = num2 % num1 == 0 ? "나머지가 없습니다." : "나머지: " + num2 % num1; 
        System.out.println(result);
    }
}
```

---

## 9. 중요 개념 정리

### Scanner 사용 시 주의사항
1. **import 구문 필요**: `import java.util.Scanner;`
2. **객체 생성**: `Scanner sc = new Scanner(System.in);`
3. **자원 해제**: `sc.close();` (사용 후 반드시 닫기)

### 삼항 연산자 사용 가이드라인
- **단순한 조건식 하나**일 때만 사용
- **복잡한 조건**은 if-else 문 사용 권장
- **가독성**을 우선 고려

### 연산자 우선순위 기억법
1. **괄호** 먼저
2. **단항** 연산자
3. **산술** 연산자
4. **관계** 연산자
5. **논리** 연산자
6. **삼항** 연산자
7. **대입** 연산자

### 논리 연산자 진리표
| A | B | A && B | A \|\| B | !A |
|---|---|--------|----------|----|
| T | T | T | T | F |
| T | F | F | T | F |
| F | T | F | T | T |
| F | F | F | F | T |

---

## 10. 실무 팁

### 변수 초기값
- **정수**: `0`
- **실수**: `0.0`
- **문자형**: `' '` (공백문자)
- **문자열**: `null` 또는 `""` (+ 연산자로 강제 형변환시 `""` 사용)

### 코드 작성 시 주의사항
1. **변수 초기화**: 입력받기 전에 변수를 0이나 null로 초기화
2. **의미 있는 변수명**: `choice`, `result`, `message` 등 목적에 맞는 이름 사용
3. **에러 처리**: 잘못된 입력에 대한 에러 메시지 준비

### 성능 고려사항
- **Scanner 객체**는 무거우므로 필요할 때만 생성
- **문자열 연산**이 많을 때는 StringBuilder 고려
- **복잡한 조건**은 삼항 연산자보다 if문이 더 효율적