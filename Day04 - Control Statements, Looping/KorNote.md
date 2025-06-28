# Java 제어문, 반복문 (2025/06/26)

## 조건문 (Conditional Statements)

### 1\. if문

`if`문은 boolean 조건에 따라 코드를 실행합니다.

#### 기본 문법

```java
if(조건식){
    실행할 문장;
}
```

#### 여러 개의 독립적인 if문

```java
// 각 조건은 독립적으로 확인됩니다
if(조건1){
    문장1;
}
if(조건2){
    문장2;
}
if(조건3){
    문장3;
}
```

#### if-else if-else 체인

```java
if(조건1){
    문장1;
}
else if(조건2){  // 위 조건이 거짓일 때만 확인됩니다
    문장2;
}
else if(조건3){
    문장3;
}
else {
    문장4;    // 모든 조건이 거짓일 때 실행됩니다
}
```

### 2\. switch문

`switch`문은 단일 변수의 값에 따라 여러 선택지를 제공합니다.

#### 문법

```java
switch(값){
    case 값1:
        문장;
        break;
    case 값2:
        문장;
        break;
    case 값3:
        문장;
        break;
    default:
        문장;
        break;
}
```

#### 중요 사항

  - **Fall-through 동작**: `break`가 없으면 다음 case로 실행이 계속됩니다.
  - 의도치 않은 다음 case 실행을 막기 위해 `break`를 사용하세요.
  - `default` case는 if문의 `else`와 같은 역할을 합니다.

-----

## 제어 흐름문 (Control Flow Statements)

### break문

  - **목적**: 현재 블록 범위를 즉시 빠져나갑니다.
  - **동작**: if문에서는 if문 자체만이 아닌, 감싸고 있는 블록을 빠져나갑니다.

### continue문

  - **목적**: 반복문에서 다음 반복으로 건너뜁니다.
  - **사용 사례**: 현재 반복에서 남은 코드를 건너뛰고 싶을 때 사용합니다.

-----

## 조건문 비교

| 문장 종류 | 최적 사용 사례 | 예시 |
|---|---|---|
| **삼항 연산자** | 간단한 참/거짓 결과가 있는 단일 조건 | `result = (x > 0) ? "양수" : "음수"` |
| **if문** | 비교 연산자(\>, \<, \>=, \<=)나 논리 연산자(&&, ||)를 포함한 복잡한 조건 | `if(score >= 90 && attendance > 80)` |
| **switch문** | 동등 비교를 위한 여러 가능한 값을 가진 하나의 변수 | `switch(dayOfWeek) { case 1: ... }` |

-----

## 반복문 (Loop Statements)

### 할당 연산자 (복합 대입 연산자)

#### 기본 할당 연산

```java
int money = 10000;
// money = money - 1000;  // 기본 형태
money -= 1000;            // 복합 대입 연산자

int data = 0;
// data = data + 1;       // 기본 형태
// data += 1;             // 복합 대입 연산자
data++;                   // 증감 연산자
```

### 증감 연산자

| 연산자 종류 | 문법 | 적용 시점 |
|---|---|---|
| **전위** | `++data`, `--data` | 현재 줄에서 즉시 적용 |
| **후위** | `data++`, `data--` | 다음 줄부터 적용 |

#### 전위 vs 후위 예시

```java
int data = 10;

// 전위: 증가 후 출력
System.out.println(++data);  // 출력: 11

// 후위: 출력 후 증가
System.out.println(data++);  // 출력: 10
System.out.println(data);    // 출력: 11
```

### 1\. for 반복문

#### 문법

```java
for(초기화식; 조건식; 증감식){
    실행할 문장;
}
```

### 2\. while 반복문

#### 문법

```java
while(조건식){
    실행할 문장;
}
```

### 3\. do-while 반복문

#### 문법

```java
do {
    실행할 문장;
} while(조건식);
```

### 반복문 선택 가이드라인

| 반복문 종류 | 사용 시점 | 예시 시나리오 |
|---|---|---|
| **for** | 반복 횟수를 알 때 | 1부터 100까지 숫자 출력 |
| **while** | 반복 횟수를 모를 때 | 사용자가 종료를 선택할 때까지 |
| **do-while** | 최소 한 번은 실행해야 할 때 | 메뉴 시스템 |

-----

## 코드 예제

### 예제 1: ForTask - 기본 반복문 연산

```java
package controlStatement;

public class ForTask {
    public static void main(String[] args) {
        
        // 1부터 100까지 짝수 출력
        for(int i = 1; i <= 100; i++) {			
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
        // 1부터 10까지의 합
        int result = 0;
        for(int i = 1; i <= 10; i++) {
            result += i;  // 복합 대입 연산자
        }
        System.out.println(result);  // 출력: 55
    }
}
```

### 예제 2: 반복문과 사용자 입력

```java
package controlStatement;
import java.util.Scanner;

public class ForTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1부터 100까지 짝수의 합
        int result1 = 0;
        for(int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                result1 += i;
            }
        }
        System.out.println("1-100 짝수의 합: " + result1);
        
        // 사용자 입력을 받아 1부터 n까지의 합 구하기
        System.out.println("N을 입력하세요: ");
        int userInput = sc.nextInt();
        int result2 = 0;
        for(int i = 1; i <= userInput; i++) {
            result2 += i;
        }
        System.out.println("1부터 " + userInput + "까지의 합: " + result2);
        
        sc.close();
    }
}
```

### 예제 3: if문에서 문자열 비교

```java
package controlStatement;
import java.util.Scanner;

public class IfTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = "오늘 저녁 뭐 드셨어요?";
        String food = null;
        
        System.out.println(message);
        food = sc.next();
        
        // 문자열 비교에는 .equals()를 사용합니다
        if(food.equals("치킨")) {
            System.out.println("과식하셨네요.");
        } else if(food.equals("샐러드")) {
            System.out.println("다이어트 중이시군요.");
        } else if(food.equals("술")) {
            System.out.println("과음하셨네요.");
        } else {
            System.out.println("굶으셨군요.");
        }
        
        sc.close();
    }
}
```

### 예제 4: 동물 소리 메뉴 시스템

```java
package controlStatement;
import java.util.Scanner;

public class IfTask {
    public static void main(String[] args) {
        
        int dog = 1, cat = 2, chicken = 3, fox = 4;
        String message = "동물 소리 버튼을 선택하세요:\n"
                + "1. 강아지\n"
                + "2. 고양이\n"
                + "3. 닭\n"
                + "4. 여우\n"
                + "선택: ";
        int userInput = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println(message);
        userInput = sc.nextInt();
        
        if (userInput == dog) {
            System.out.println("멍멍");
        }
        else if (userInput == cat) {
            System.out.println("야옹");
        }
        else if (userInput == chicken) {
            System.out.println("꼬끼오");
        }
        else if (userInput == fox) {
            System.out.println("What does the fox say?");
        }
        else {
            System.out.println("잘못된 입력입니다.");
        }
        
        sc.close();
    }
}
```

### 예제 5: Fall-through를 사용한 Switch문

```java
package controlStatement;
import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        String message = "동물 소리 버튼을 선택하세요:\n"
                + "1. 강아지\n"
                + "2. 고양이\n"
                + "3. 닭\n"
                + "4. 여우";
        
        System.out.println(message);
        choice = sc.nextInt();
        
        // Switch는 다중 선택문이 아닙니다. break가 없으면
        // 이후의 모든 case를 실행합니다 (fall-through 동작)
        switch(choice) {
            case 1:
                System.out.println("으르렁");
                break;
            case 2:
                System.out.println("야옹");
                break;
            case 3:
                System.out.println("꼬끼오");
                break;
            case 4:
                System.out.println("Ring-ding-ding");
                break;
            default:  // else와 동일
                System.out.println("잘못된 선택입니다.");
                break;
        }
        
        sc.close();
    }
}
```

### 예제 6: While 반복문 응용

```java
package controlStatement;
import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
        
        // 기본 while 반복문
        int count = 0;
        while(true) {
            System.out.println("현재 카운트: " + count);
            count++;
            if (count == 100000) {
                break;  // 반복문 탈출
            }
        }
        
        // do-while 반복문 - 고객 서비스 시스템
        String message = "1. 분실 신고\n"
                    + "2. 통신사 변경\n"
                    + "3. 결제 방법 변경\n"
                    + "5. 상담 종료\n"
                    + "0. 상담원 연결";
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        
        // 사용자가 5를 누를 때까지 계속
        do {
            System.out.println(message);
            choice = sc.nextInt();
        } while(choice != 5);
        
        sc.close();
    }
}
```

### 예제 7: 반복문을 이용한 문자 연산

```java
package controlStatement;

public class ForTest {
    public static void main(String[] args) {

        // 전위와 후위의 차이
        int data = 10;
        
        // data를 증가시킨 후 출력
        System.out.println(++data);  // 출력: 11

        // data를 출력한 후 증가		
        System.out.println(data++);  // 출력: 11
        System.out.println(data);    // 출력: 12
        
        // for 반복문 예제
        for(int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". 홍길동");
        }
        
        // 10부터 1까지 출력
        for(int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        
        // 10부터 1까지 출력하는 다른 방법		
        for(int i = 0; i < 10; i++) {
            System.out.println(10 - i);
        }
    }
}
```

-----

## 연습 문제

### 기본 문제 (Pass Level)

1.  **1부터 100까지 출력**
2.  **100부터 1까지 출력**
3.  **100부터 1까지 홀수만 출력**
4.  **1부터 50까지의 합 계산**
5.  **1-100 범위 내에서 10부터 20까지 출력**

### 심화 문제 (Surf Level)

1.  **A부터 F까지 알파벳 출력**
2.  **A부터 F까지 C를 제외하고 출력**
3.  **aBcDeFgHi...Z (대소문자 번갈아 출력)**

### 마스터 문제

**별 패턴**

```
    *
   ***
  *****
 *******
*********
```

### 해설 예제

```java
package controlStatement;

public class ForTask3 {
    public static void main(String[] args) {
        
        // 1. 1부터 100까지 출력
        System.out.println("1. 1부터 100까지 출력");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        
        // 2. 100부터 1까지 출력
        System.out.println("2. 100부터 1까지 출력");
        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }
        
        // 3. 100부터 1까지 홀수만 출력
        System.out.println("3. 100부터 1까지 홀수만 출력");
        for (int i = 100; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        
        // 4. 1부터 50까지 모든 값의 합
        int result = 0;
        System.out.println("4. 1부터 50까지 모든 값의 합");
        for (int i = 1; i <= 50; i++) {
            result += i;
        }
        System.out.println("합계: " + result);
        
        // 5. 1-100 범위 내에서 10부터 20까지 출력
        System.out.println("5. 10부터 20까지 출력");
        for (int i = 1; i <= 100; i++) {
            if (10 <= i && i <= 20) {
                System.out.println(i);
            }
        }
        
        // 심화 문제
        
        // A부터 F까지 출력
        System.out.println("A부터 F까지 출력:");
        for(int i = 0; i < 6; i++) {
            System.out.print((char)('A' + i));
        }
        System.out.println();
        
        // A부터 F까지 C를 제외하고 출력
        System.out.println("A부터 F까지 C를 제외하고 출력:");
        for(int i = 0; i < 6; i++) {
            if (i == 2) {  // C는 A로부터 인덱스 2에 위치
                continue;
            }
            System.out.println((char)('A' + i));
        }
        
        // aBcDeFgHi...Z (대소문자 번갈아 출력)
        System.out.println("aBcDeFgHi...Z 출력:");
        for(int i = 0; i < 26; i++) {
            if (i % 2 == 0) {
                System.out.print((char)('a' + i));  // 소문자
            } else {
                System.out.print((char)('A' + i));  // 대문자
            }
        }
        System.out.println();
    }
}
```

-----

## 미완성 코드 예제 (MBTI 분석)

원본 노트에는 미완성된 MBTI 분석 프로그램이 포함되어 있었습니다. 다음은 수정된 버전입니다:

```java
package controlStatement;
import java.util.Scanner;

public class WhileTask {
    public static void main(String[] args) {
        // MBTI 분석 프로그램
        // 사용자가 자신의 MBTI를 입력하고 메시지를 받습니다
        // while 반복문 사용
        
        String mbti = null;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("MBTI 유형을 입력하세요 ('exit' 입력 시 종료):");
        
        while(true) {
            mbti = sc.next().toUpperCase();
            
            if(mbti.equals("EXIT")) {
                System.out.println("안녕히 가세요!");
                break;
            }
            
            switch(mbti) {
                case "ESFP":
                    System.out.println("당신은 사교적이고 즐거운 분위기를 만들어 사람들을 행복하게 합니다.");
                    break;
                case "INTP":
                    System.out.println("당신은 논리적이고 창의적이며 새로운 아이디어에 개방적입니다.");
                    break;
                case "ISTP":
                    System.out.println("당신은 유연하고 실용적인 사고로 뛰어난 문제 해결 능력을 가지고 있습니다.");
                    break;
                case "INFJ":
                    System.out.println("당신은 통찰력 있고 깊이 있는 사고로 사람들의 마음을 잘 이해합니다.");
                    break;
                case "ISTJ":
                    System.out.println("당신은 책임감 있고 신뢰할 수 있으며, 모든 조직의 든든한 기둥입니다.");
                    break;
                case "ISFJ":
                    System.out.println("당신은 깊은 배려심과 헌신으로 주변 사람들을 따뜻하게 보살핍니다.");
                    break;
                case "INTJ":
                    System.out.println("당신은 체계적이고 전략적인 사고로 목표를 효과적으로 달성합니다.");
                    break;
                case "ISFP":
                    System.out.println("당신은 조용하고 감성적이며 뛰어난 예술적 감각을 가지고 있습니다.");
                    break;
                case "INFP":
                    System.out.println("당신은 이상을 추구하며 다른 사람들의 감정에 진심으로 공감합니다.");
                    break;
                case "ESTP":
                    System.out.println("당신은 에너지 넘치며 뛰어난 상황 대처 능력과 강한 행동 지향성을 보입니다.");
                    break;
                case "ENFP":
                    System.out.println("당신은 열정적이고 창의적이며 사람들과의 교류를 즐깁니다.");
                    break;
                case "ENTP":
                    System.out.println("당신은 재치 있고 도전적이며 새로운 것을 시도하는 데 열정적입니다.");
                    break;
                case "ESTJ":
                    System.out.println("당신은 체계적이고 현실적이며 조직을 잘 이끌어갑니다.");
                    break;
                case "ESFJ":
                    System.out.println("당신은 사람들을 잘 챙기고 조화를 중시하며 신뢰를 줍니다.");
                    break;
                case "ENFJ":
                    System.out.println("당신은 뛰어난 리더십과 타인에게 동기를 부여하는 탁월한 능력을 가지고 있습니다.");
                    break;
                case "ENTJ":
                    System.out.println("당신은 결단력 있고 전략적으로 목표를 향해 나아갑니다.");
                    break;
                default:
                    System.out.println("유효하지 않은 MBTI 유형입니다. 올바른 4글자 MBTI 유형을 입력해주세요.");
                    break;
            }
            
            System.out.println("다른 MBTI 유형을 입력하세요 ('exit' 입력 시 종료):");
        }
        
        sc.close();
    }
}
```

-----

## 핵심 개념 요약

### 중요 개념

1.  **문자열 비교**: 문자열에는 `==` 대신 `.equals()`를 사용합니다.
2.  **증감 연산자**: 전위와 후위의 차이점을 이해합니다.
3.  **Switch Fall-through**: `break`문의 중요성
4.  **반복문 선택**: 상황에 맞는 적절한 반복문 유형을 선택합니다.
5.  **아스키 코드 활용**: 문자 출력을 위한 형변환

### 디버깅 팁

  - **무한 루프 방지**: while 루프의 종료 조건을 항상 확인합니다.
  - **경계값 확인**: 배열 또는 문자열 인덱스 접근을 확인합니다.
  - **타입 변환**: char와 int 간 변환 시 아스키 값을 고려합니다.
  - **논리 오류**: 경계 사례와 예외 조건을 테스트합니다.

### 모범 사례

1.  **의미 있는 변수명 사용**
2.  **복잡한 로직에는 주석 추가**
3.  **사용자 입력 유효성 검사 처리**
4.  **적절한 데이터 타입 사용**
5.  **일관된 코드 서식 준수**