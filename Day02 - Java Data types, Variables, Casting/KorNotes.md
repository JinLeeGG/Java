# Java Day 02 Lecture Notes (2025/06/24)

## 1. 제어 문자 (Control Characters)

제어 문자는 **반드시 따옴표 안에서 작성**해야 합니다.

| 제어 문자 | 설명 | 용도 |
|----------|------|------|
| `\n` | new line | 개행 문자, 줄 바꿈 |
| `\t` | tab | 위 아래 줄 간격 맞춰 띄기 |
| `\"` | " 표현 | 큰따옴표 출력 |
| `\'` | ' 표현 | 작은따옴표 출력 |
| `\\` | \ 표현 | 백슬래시 출력 |

## 2. 출력 메서드 (Output Methods)

### 메서드 종류
- **`print()`**: 마지막에 자동으로 줄바꿈이 되지 않고 아래 문장과 이어서 출력
- **`println()`**: 마지막에 자동으로 줄바꿈 처리
- **`printf()`**: 포맷을 이용하여 서식 변경

### 출력 메서드의 목적
- 전달받은 데이터 및 전달할 데이터 검사
- 오류 발생 지점 구체화 및 검사

### 서식 문자 (Format Characters)
반드시 따옴표 안에서 작성하며, `printf()` 메서드와 함께 사용합니다.

| 서식 문자 | 설명 | 용도 |
|----------|------|------|
| `%d` | decimal | 10진수 정수 |
| `%o` | octal | 8진수 정수 |
| `%x` | hexadecimal | 16진수 정수 |
| `%f` | float | 실수 |
| `%c` | character | 문자 |
| `%s` | string | 문자열 |

#### 예제 코드
```java
String name = "Gyujin Lee";
int age = 22;
double height = 172.02;

// 일반적인 문자열 연결
System.out.println("My name is " + name + ", age is " + age + " years old, my height is " + height +" cm.");

// printf 사용 (순서대로 인식)
System.out.printf("My name is %s, age is %d years old, my height is %f cm.", name, age, height);
```

## 3. 자료형 (Data Types)

### 기본 자료형 표

| 자료형 | Type | Byte | 값 예시 | 비고 |
|--------|------|------|---------|------|
| 정수형 | `int` | 4 | 10, 302, 3321, -1 | 기본형 |
| 실수형 | `float` | 4 | 10.5F, -0.9F, 0.0F | F가 있으면 float |
| | `double` | 8 | 10.5, 0.6, 123.456 | |
| 논리형 | `boolean` | 1 | true, false | |
| 문자형 | `char` | 2 | '김', 'A', '0' | 한 글자, 작은따옴표 |
| 문자열 | `String` | ? | "홍길동", "ABC", "A" | 큰따옴표 |

### 중요 사항
- **float**: F가 있으면 float형 (예: `10.5F`)
- **char**: 자바에서는 한 글자를 문자형으로 표현, 작은따옴표(`'`) 사용
- **String**: 문자열값은 큰따옴표(`"`) 사용
- **형변환**: float(4byte)는 double(8byte) 안에 들어갈 수 있지만, 반대는 불가능

## 4. 변수 (Variables)

### 변수 선언 시 주의사항
1. 같은 이름의 변수로 선언할 수 없다
2. 초기화를 해준다
3. 되도록 선언부에 한꺼번에 선언한다 (영역 상단)

### 변수명 주의사항
- 문자로 시작해야 한다
- 특수문자는 사용할 수 없다 (단, `_`는 허용)
- 소문자로 시작한다
- 공백을 사용할 수 없다
- 되도록 한글은 사용하지 않는다
- 명사로 사용한다
- 뜻이 있는 단어를 사용한다

### 변수 선언 예제
```java
// 개별 선언
int num1 = 5;
int num2 = 98590;

// 한 번에 여러 변수 선언
int num1 = 5, num2 = 98590;
char char1 = 'b', char2 = 'S', char3 = 'D';
```

### 대입연산자
- `=`는 대입연산자 (값을 넣어준다는 의미)
- 변수와 타입을 같이 정의해야 한다 (정적 바인딩)

## 5. 상수 (Constants)

### 상수란?
- 항상 그대로인 수
- 값을 변경할 수 없도록 하는 것이 목적

### 상수를 사용하는 이유
1. 의미 없는 값에 의미를 부여하기 위한 목적
2. 오타를 방지하기 위한 목적

### 상수 선언
```java
final int CODE = 1234567;
// CODE = 2000; // 오류! final로 선언된 상수는 값 변경 불가
```

## 6. 형변환 (Type Casting)

### 자동 형변환
- **실수 + 정수 = 실수**
- **문자열 + 값 = 문자열**

#### 자동 형변환 예제
```java
System.out.println(20 + "");      // "20" (문자열)
System.out.println(1 + 1);        // 2 (정수)
System.out.println(1 + 2.5);      // 3.5 (실수)
System.out.println("1" + 1);      // "11" (문자열)
System.out.println(5/2);          // 2 (정수)
```

### 강제 형변환 (Type Casting)
```java
System.out.println(5/(double)2);  // 2.5 (실수)
System.out.println((int)8.43);    // 8 (소수점 제거)
System.out.println((int)8.43 + (int)2.59); // 10
```

### ASCII 코드 활용
```java
System.out.println('A' + 10);     // 75 (A=65, 65+10=75)
System.out.println((char)('A' + 10)); // 'K'

// 소문자를 대문자로 변환 (A=65, a=97, 차이=32)
System.out.println((char)('a' - 32)); // 'A'
System.out.println((char)('j' - 32)); // 'J'
System.out.println((char)('k' - 32)); // 'K'
```

## 7. 문자열 형변환

### 1. 다른 자료형 → 문자열
```java
// 자동 형변환
System.out.println("1" + 3);        // "13"
System.out.println("1" + 3 + 8);    // "138" (좌결합성)
System.out.println("1" + (3 + 8));  // "111"

// String.valueOf() 메서드 사용
String str1 = String.valueOf(3.9);  // "3.9"
```

### 2. 문자열 → 다른 자료형
**일반 자료형은 일반 자료형끼리만 형변환이 가능**하므로, 문자열 타입은 클래스 타입이기 때문에 일반 자료형의 클래스 타입의 도움을 받아야 합니다.

| 변환 방법 | 메서드 | 예제 |
|-----------|--------|------|
| String → int | `Integer.parseInt()` | `int num = Integer.parseInt("20");` |
| String → boolean | `Boolean.parseBoolean()` | `boolean flag = Boolean.parseBoolean("true");` |
| String → double | `Double.parseDouble()` | `double num = Double.parseDouble("3.9");` |
| String → float | `Float.parseFloat()` | `float num = Float.parseFloat("3.9F");` |

### 형변환 예제
```java
double num1 = Double.parseDouble("3.9");      // 3.9 (double)
boolean isTrue = Boolean.parseBoolean("true"); // true (boolean)
int num2 = Integer.parseInt("20");             // 20 (int)
```

## 8. 실습 예제

### 예제 1: 형변환을 이용한 계산
```java
int num1 = 1;
String str1 = "8.24", str2 = "7.8";

// num1 + str1 + str2로 115 만들기
String st = String.valueOf(num1);              // "1"
double numStr1 = Double.parseDouble(str1);     // 8.24
double numStr2 = Double.parseDouble(str2);     // 7.8
System.out.println(st + ((int)numStr1 + (int)numStr2)); // "1" + 15 = "115"
```

### 예제 2: 문자 형변환
```java
// 'a', 'j', 'k'를 연산하여 'A', 'J', 'K' 출력하기
System.out.println((char)('a' - 32)); // 'A'
System.out.println((char)('j' - 32)); // 'J'
System.out.println((char)('k' - 32)); // 'K'
```

## 9. 유용한 단축키
- **줄 복사**: `Ctrl + Alt + 화살표 위 또는 아래`

## 10. 중요 개념 정리

### 좌결합성
자바에서 코드는 왼쪽에서 오른쪽으로 읽히기 때문에 연산의 순서가 중요합니다.
```java
System.out.println("1" + 3 + 8);    // "138"
System.out.println("1" + (3 + 8));  // "111"
```

### 정적 바인딩
자바에서는 변수와 타입을 함께 정의해야 합니다.
```java
int x = 10;        // 올바른 선언
String name = "Kim"; // 올바른 선언
```

### 클래스 타입 vs 일반 자료형
- **일반 자료형**: int, double, float, boolean, char
- **클래스 타입**: String
- String은 클래스 타입이므로 일반 자료형과의 형변환 시 특별한 메서드가 필요합니다.