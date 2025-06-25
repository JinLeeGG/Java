# Java Input, Operators, and Practice (2025/06/25)

---

## 1. 입력 (Input) in Java

### 입력의 기본
- **입력 전 안내**: 사용자가 무엇을 입력해야 하는지 출력으로 안내해야 함.
- **입력 상태**: 커서가 깜빡이고 있는 상태에서 입력 대기.

### 입력 클래스와 변수 선언
```java
Scanner sc = new Scanner(System.in);
String name = "홍길동";
자료형 변수 = 값;
```

### 입력 메서드 종류

| 메서드         | 설명                                                                                  |
|----------------|--------------------------------------------------------------------------------------|
| `next()`       | 공백/줄바꿈을 구분점으로 문자열을 분리하여 입력받음. 각 단어를 순서대로 저장.         |
| `nextLine()`   | 줄바꿈까지 전체 문자열을 입력받음. 공백 포함 전체를 하나의 문자열로 저장.             |
| `nextInt()`    | 정수 입력받음.                                                                       |
| `nextDouble()` | 실수 입력받음.                                                                       |

#### 예시
```java
String a = sc.next();      // 단어 단위 입력
String b = sc.nextLine();  // 한 줄 전체 입력
int n = sc.nextInt();      // 정수 입력
```

---

## 2. 연산자 (Operators)

### 연산자란?
- **기능이 있는 특수문자**로, 연산을 수행함.

### 연산자의 우선순위

| 우선순위 | 연산자 종류         | 예시/설명                |
|----------|--------------------|--------------------------|
| 1        | 최우선 연산자      | ( )                      |
| 2        | 단항 연산자        | !                        |
| 3        | 산술 연산자        | +, -, *, /, %            |
| 4        | 쉬프트 연산자      | <<, >>                   |
| 5        | 관계 연산자        | !=, ==, >, <, >=, <=     |
| 6        | 논리 연산자        | &&, \|\|                 |
| 7        | 삼항 연산자        | 조건식 ? 참 : 거짓        |
| 8        | 대입 연산자        | =, +=, -=, ...           |

### 결합성
- 동일 연산자가 여러 번 사용될 때, **알맞은 방향**(좌→우, 우→좌)으로 결합되어 연산됨.

---

## 3. 이항 연산자 (Binary Operators)
- `+`, `-`, `*`, `/`, `%` 등 두 개의 피연산자를 필요로 함.

---

## 4. 논리형 (boolean)

| 값    | 의미   |
|-------|--------|
| true  | 참     |
| false | 거짓   |

- 선언 예시: `boolean 변수명 = true;`
- 크기: 1 byte

---

## 5. 조건식 (Conditional Expression)
- **결과가 참 또는 거짓**(true/false)로 나오는 식.

### 관계 연산자

| 연산자 | 의미      |
|--------|-----------|
| ==     | 같다      |
| !=     | 같지 않다 |
| >, <   | 초과, 미만|
| >=, <= | 이상, 이하|

### 논리 연산자

| 연산자 | 의미                                   |
|--------|----------------------------------------|
| &&     | AND, 두 조건 모두 참이면 참            |
| \|\|   | OR, 둘 중 하나라도 참이면 참           |

### 단항 연산자

| 연산자 | 의미                                   |
|--------|----------------------------------------|
| !      | NOT, 참이면 거짓, 거짓이면 참으로 변경 |

---

## 6. 삼항 연산자 (Ternary Operator)
- **형식**: `조건식 ? 참 : 거짓`
- **값**으로 사용됨.
- **예시**:
    ```java
    int result = 10 > 9 ? 10 : 9;
    ```
- **사용 시점**: 조건식이 딱 한 개 있을 때만 사용 권장.

---

## 7. 실습 예제

### 7.1 몫과 나머지 구하기

```java
Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();
int num2 = sc.nextInt();
int division = num1 / num2;
int remainder = num1 % num2;
System.out.println("몫: " + division + ", 나머지: " + remainder);
sc.close();
```

---

### 7.2 키오스크 메뉴 선택

```java
Scanner sc = new Scanner(System.in);
String message = "Q. 메뉴를 고르세요. \n1.아메리카노\n2.카페라떼\n3.에이드\n4.밀크티";
System.out.println(message);
int choice = sc.nextInt();
String result = choice == 1 ? "아메리카노"
             : choice == 2 ? "카페라떼"
             : choice == 3 ? "에이드"
             : choice == 4 ? "밀크티"
             : "잘못 입력하셨습니다.";
System.out.println(result);
sc.close();
```

---

### 7.3 성적 등급 매기기

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

---

### 7.4 이항 연산자 실습

```java
System.out.println(10 + 10);      // 20
System.out.println(20 - 7);       // 13
System.out.println(3 * 7);        // 21
System.out.println(30 / 4);       // 7 (정수 나눗셈)
System.out.println(30 / (double)4); // 7.5 (실수 나눗셈)
System.out.println(30 % 4);       // 2 (나머지)
```

---

### 7.5 삼항 연산자 실습

```java
int num1 = 11, num2 = 30;
String result = num2 % num1 == 0 ? "나머지가 없습니다." : "나머지: " + num2 % num1;
System.out.println(result);
```

---

### 7.6 논리 연산자 실습

```java
boolean isTrue = 10 != 11;
System.out.println(10 == 11); // false
System.out.println(isTrue); // true
System.out.println(isTrue && 10 == 10); // true
System.out.println(isTrue && 10 != 10); // false
System.out.println(isTrue || 10 != 10); // true
System.out.println(isTrue && !(10 != 10)); // true
```

---

### 7.7 입력 실습

#### 두 정수 덧셈 (next()만 사용)

```java
Scanner sc = new Scanner(System.in);
String num1 = sc.next();
String num2 = sc.next();
int convertedNum1 = Integer.parseInt(num1);
int convertedNum2 = Integer.parseInt(num2);
System.out.println(convertedNum1 + convertedNum2);
sc.close();
```

#### 세 정수 곱셈

```java
Scanner sc = new Scanner(System.in);
System.out.println("Result: " + sc.nextInt() * sc.nextInt() * sc.nextInt());
sc.close();
```

#### 이름 입력 (nextLine 사용)

```java
Scanner sc = new Scanner(System.in);
System.out.println("이름을 입력하세요.");
String name = sc.nextLine();
System.out.println(name + "님 환영합니다!");
sc.close();
```

---

## 8. 추가 팁

- **Ctrl + Shift + O**: 필요한 모듈(Import) 자동 추가.
- **변수 선언**: 항상 코드 상단에 선언.
- **입력 안내 메시지**: 사용자에게 입력값 예시와 함께 안내 출력.

---

## 9. 연산자 우선순위 표

| 우선순위 | 연산자 종류         | 예시/설명                |
|----------|--------------------|--------------------------|
| 1        | ( )                | 괄호                     |
| 2        | !                  | NOT                      |
| 3        | *, /, %            | 곱셈, 나눗셈, 나머지      |
| 4        | +, -               | 덧셈, 뺄셈               |
| 5        | <<, >>             | 쉬프트                   |
| 6        | <, >, <=, >=       | 관계 연산자              |
| 7        | ==, !=             | 등가/부등가              |
| 8        | &&                 | 논리 AND                 |
| 9        | \|\|               | 논리 OR                  |
| 10       | =, +=, -=, ...     | 대입 연산자              |

---

## 10. 실습 시 주의사항 및 팁

- **입력값 안내**: 항상 입력 전에 예시와 함께 안내 메시지 출력.
- **Scanner 사용 후 close()**: 자원 누수 방지를 위해 입력 후 반드시 닫기.
- **형변환 주의**: 문자열 입력 후 정수로 변환 필요시 `Integer.parseInt()` 사용.
- **삼항 연산자**: 조건이 1개일 때만 사용 권장, 복잡한 조건은 if문 사용.

---

## 11. 오늘의 요약

- Java에서 입력받는 방법과 다양한 연산자(산술, 논리, 관계, 삼항 등)의 사용법을 익힘.
- 실습을 통해 입력, 출력, 연산자 활용 능력 강화.
- 코드 작성 시 입력 안내, 변수 선언, 자원 관리(Scanner close) 등 기본 습관 중요.

---