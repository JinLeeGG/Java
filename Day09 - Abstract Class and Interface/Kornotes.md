# 추상 클래스와 인터페이스 

작성하신 노트를 바탕으로 Java의 `abstract` 클래스와 `interface` 개념을 정리한 자료입니다.

-----

## 🔹 추상 클래스 (Abstract Class)

**추상 클래스**란, 스스로 객체화(instantiate)될 수 없고 다른 클래스가 상속해야만 하는 클래스를 의미합니다. 이 클래스는 구현이 완료된 일반 메서드와, 구현부가 없는 \*\*추상 메서드(abstract method)\*\*를 모두 포함할 수 있습니다.

추상 클래스의 주된 목적은 관련된 여러 하위 클래스에 공통된 구조를 제공하고, 추상 메서드를 반드시 구현하도록 하여 특정 규칙("강제성")을 부여하는 것입니다.

### 주요 특징:

  * `abstract` 키워드로 선언됩니다.
  * `new` 키워드를 사용해 직접 인스턴스(객체)를 생성할 수 없습니다.
  * 생성자, 필드(변수), 그리고 구현이 완료된 일반 메서드를 가질 수 있습니다.
  * 구현부가 없는 추상 메서드를 포함할 수 있습니다.
  * 추상 클래스를 `extends` (상속)하는 클래스는 부모의 모든 추상 메서드를 반드시 구현(오버라이딩)해야 합니다. 그렇지 않으면 그 클래스 또한 추상 클래스로 선언되어야 합니다.

### 예제 코드:

```java
// 동물의 기본 구조를 정의하는 추상 클래스
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // 추상 메서드 (구현부 없음)
    public abstract void makeSound();

    // 일반 메서드 (구현부 있음)
    public void sleep() {
        System.out.println(name + "이(가) 잠을 잡니다...");
    }

    public String getName() {
        return name;
    }
}

// 추상 클래스를 상속받는 구체적인 클래스
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Animal로부터 물려받은 추상 메서드를 반드시 구현해야 함
    @Override
    public void makeSound() {
        System.out.println(getName() + "이(가) 짖습니다: 멍멍!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Animal myAnimal = new Animal("동물"); // 오류: 추상 클래스는 인스턴스화할 수 없음
        Dog myDog = new Dog("바둑이");
        myDog.makeSound(); // 출력: 바둑이이(가) 짖습니다: 멍멍!
        myDog.sleep();     // 출력: 바둑이이(가) 잠을 잡니다...
    }
}
```

-----

## 🔸 인터페이스 (Interface)

Java의 **인터페이스**는 클래스가 가져야 할 메서드를 정의하는 완전한 "설계도" 또는 "틀"입니다. 인터페이스는 **상수**(static final 변수)와 **추상 메서드**만 가질 수 있습니다. 클래스가 지켜야 할 "계약(contract)"으로 생각할 수 있습니다.

어떤 클래스가 인터페이스를 `implements` (구현)하면, 그 인터페이스에 정의된 모든 메서드를 반드시 구현해야 합니다. 이는 추상화를 달성하는 더 고도화된 방법입니다.

### 주요 특징:

  * `interface` 키워드로 선언됩니다.
  * `public static final` 특성을 갖는 **상수**와 `public abstract` 특성을 갖는 **추상 메서드**만 포함할 수 있습니다. (Java 8부터는 구현부를 가진 `default` 및 `static` 메서드도 포함 가능합니다.)
  * 클래스는 `implements` 키워드를 사용하여 인터페이스를 구현합니다.
  * 한 클래스가 여러 개의 인터페이스를 동시에 구현할 수 있습니다. (다중 상속 효과)

### 예제 코드:

```java
// 재생 기능을 정의하는 인터페이스
interface Playable {
    // 변수는 자동으로 public static final로 인식됨
    String GAME_TYPE = "오디오 플레이어";

    // 메서드는 자동으로 public abstract로 인식됨
    void play();
    void pause();
    void stop();
}

// Playable 인터페이스를 구현하는 클래스
class MP3Player implements Playable {
    @Override
    public void play() {
        System.out.println("음악을 재생합니다.");
    }

    @Override
    public void pause() {
        System.out.println("음악을 일시정지합니다.");
    }

    @Override
    public void stop() {
        System.out.println("음악을 정지합니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        MP3Player player = new MP3Player();
        player.play();  // 출력: 음악을 재생합니다.
        player.pause(); // 출력: 음악을 일시정지합니다.
    }
}

```

-----

## ⚖️ 추상 클래스 vs. 인터페이스

두 개념의 주요 차이점은 다음과 같습니다.

| 구분 | 추상 클래스 (Abstract Class) | 인터페이스 (Interface) |
| :--- | :--- | :--- |
| **키워드** | `abstract class` | `interface` |
| **구현 방식** | `extends` (상속) | `implements` (구현) |
| **다중 상속** | 불가능 (클래스는 하나만 상속 가능) | 가능 (클래스는 여러 인터페이스 구현 가능) |
| **필드 (변수)** | 모든 종류의 변수 선언 가능 (static, final 등) | `public static final` 상수만 선언 가능 |
| **메서드** | 추상 메서드와 일반 메서드 모두 포함 가능 | 주로 추상 메서드만 포함 (Java 8부터 `default`, `static` 메서드 가능) |
| **생성자** | 가질 수 있음 | 가질 수 없음 |
| **목적** | 일부 구현을 공유하며 공통된 기반을 제공 (`IS-A` 관계) | 클래스가 무엇을 "할 수 있는지"에 대한 계약을 정의 (`HAS-A` 또는 `CAN-DO` 관계) |

-----

## 🔗 어댑터 패턴: 인터페이스와 클래스의 다리 역할

말씀하신 것처럼, 클래스가 인터페이스를 구현하면 그 안의 **모든** 메서드를 의무적으로 구현해야 합니다. 이는 단 몇 개의 메서드만 필요한 상황에서는 매우 번거로울 수 있습니다.

이때 **어댑터 클래스(Adapter class)** 패턴이 사용됩니다. 이 패턴은 인터페이스의 엄격한 "강제성"을 완화시키는 중간자 역할을 합니다.

**동작 방식:**

1.  특정 인터페이스를 구현하는 **추상 클래스**를 만듭니다.
2.  이 추상 클래스는 인터페이스의 모든 메서드에 대해 **빈(empty) 구현부**를 제공합니다.
3.  추상 클래스가 모든 메서드를 (비록 내용은 없지만) 구현했기 때문에, 인터페이스가 가졌던 "강제성"이 사라집니다.
4.  이제 최종 클래스는 이 "어댑터" 추상 클래스를 **상속**받아, **자신에게 정말 필요한 메서드만 선택적으로 오버라이딩**하면 됩니다.

이 패턴은 스윙(Swing)이나 안드로이드 같은 GUI 프로그래밍의 이벤트 리스너에서 매우 유용하게 사용됩니다. 인터페이스에는 수많은 이벤트 메서드가 정의되어 있지만, 개발자는 한두 개의 이벤트에만 관심이 있는 경우가 많기 때문입니다.

### 다이어그램:

```mermaid
graph TD
    A[인터페이스 <br> (예: MouseListener)] -- implements --> B(추상 어댑터 클래스 <br> (예: MouseAdapter) <br> 빈 메서드 제공)
    B -- extends --> C(사용자 클래스 <br> (예: MyMouseHandler) <br> 필요한 메서드만 오버라이딩)

    subgraph "강제성 부여"
        A
    end

    subgraph "강제성 소멸"
        B
    end

    subgraph "선택적 구현"
        C
    end
```

### 어댑터 패턴 예제 코드:

```java
// 1. 많은 메서드를 가진 인터페이스
interface PowerControls {
    void powerOn();
    void powerOff();
    void reboot();
    void enterSleepMode();
}

// 2. 어댑터 클래스가 빈 구현부를 제공
// 클래스 이름 끝에 "Adapter"를 붙여 목적을 명확히 함
abstract class PowerControlsAdapter implements PowerControls {
    @Override
    public void powerOn() {} // 빈 구현

    @Override
    public void powerOff() {} // 빈 구현

    @Override
    public void reboot() {} // 빈 구현

    @Override
    public void enterSleepMode() {} // 빈 구현
}

// 3. 어댑터를 상속하여 필요한 메서드만 구현하는 클래스
class MyDevice extends PowerControlsAdapter {
    // 우리는 전원을 켜고 끄는 기능에만 관심이 있음
    @Override
    public void powerOn() {
        System.out.println("기기 전원을 켭니다.");
    }

    @Override
    public void powerOff() {
        System.out.println("기기를 종료합니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyDevice device = new MyDevice();
        device.powerOn(); // 출력: 기기 전원을 켭니다.
        device.reboot();  // 어댑터의 빈 메서드가 호출되어 아무 일도 일어나지 않음
        device.powerOff(); // 출력: 기기를 종료합니다.
    }
}
```