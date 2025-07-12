# Abstract Classes and Interface (2025/07/04)

## 🔹 Abstract Classes

An **abstract class** is a class that cannot be instantiated on its own and must be subclassed. It can contain a mix of methods with implementations and **abstract methods**, which are methods declared without an implementation (no body).

The primary purpose of an abstract class is to provide a common base for a group of related subclasses, enforcing a certain structure by requiring them to implement the abstract methods. This concept is what's meant by "강제성" (enforcing rules).

### Key Characteristics:

  * Declared with the `abstract` keyword.
  * Cannot be instantiated using the `new` keyword.
  * Can have constructors, fields (variables), and methods with full implementations.
  * Can contain abstract methods (methods without a body).
  * A class that extends an abstract class must implement all of its parent's abstract methods, or it too must be declared abstract.

### Example Code:

```java
// Abstract class defining a template for an animal
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // Abstract method (no implementation)
    public abstract void makeSound();

    // Regular method (with implementation)
    public void sleep() {
        System.out.println(name + " is sleeping...");
    }

    public String getName() {
        return name;
    }
}

// Concrete class extending the abstract class
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Must implement the abstract method from Animal
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Animal myAnimal = new Animal("Generic"); // Error: Cannot instantiate an abstract class
        Dog myDog = new Dog("Buddy");
        myDog.makeSound(); // Output: Buddy says: Woof Woof!
        myDog.sleep();     // Output: Buddy is sleeping...
    }
}
```

-----

## 🔸 Interfaces

An **interface** in Java is a completely abstract blueprint of a class. It can only contain **constants** (static final variables) and **abstract methods**. Think of it as a contract or a "틀" (template/frame) that a class agrees to adhere to.

When a class `implements` an interface, it must provide an implementation for all the methods defined in that interface. This is a more advanced way to achieve abstraction and enforce a strict contract.

### Key Characteristics:

  * Declared with the `interface` keyword.
  * Can only contain `public static final` variables (constants) and `public abstract` methods (method signatures). Since Java 8, they can also have `default` and `static` methods with implementations.
  * A class uses the `implements` keyword to use an interface.
  * A class can implement multiple interfaces, allowing for a form of multiple inheritance of type.

### Example Code:

```java
// Interface defining a set of abilities
interface Playable {
    // public static final is implicit for variables
    String GAME_TYPE = "Audio Player";

    // public abstract is implicit for methods
    void play();
    void pause();
    void stop();
}

// A class that implements the Playable interface
class MP3Player implements Playable {
    @Override
    public void play() {
        System.out.println("Music is playing.");
    }

    @Override
    public void pause() {
        System.out.println("Music is paused.");
    }

    @Override
    public void stop() {
        System.out.println("Music has stopped.");
    }
}

public class Main {
    public static void main(String[] args) {
        MP3Player player = new MP3Player();
        player.play();  // Output: Music is playing.
        player.pause(); // Output: Music is paused.
    }
}

```

-----

## ⚖️ Abstract Class vs. Interface

Here is a table summarizing the key differences:

| Feature | Abstract Class | Interface |
| :--- | :--- | :--- |
| **Keyword** | `abstract class` | `interface` |
| **Implementation** | `extends` | `implements` |
| **Multiple Inheritance** | No (a class can only extend one class) | Yes (a class can implement multiple interfaces) |
| **Fields** | Can have any type of field (static, non-static, final, non-final) | Only `public static final` constants |
| **Methods** | Can have abstract and non-abstract (concrete) methods | Primarily abstract methods. (Can have `default` and `static` methods since Java 8) |
| **Constructor** | Can have a constructor | Cannot have a constructor |
| **Purpose** | To provide a common base with some default implementation (`IS-A` relationship) | To define a contract for what a class can do (`HAS-A` or `CAN-DO` relationship) |

-----

## 🔗 The Adapter Pattern: Bridging Interfaces and Classes

As you noted, if a class implements an interface, it is **forced** to implement *all* of its methods. This can be inconvenient if you only need to implement a few of them.

This is where the **Adapter class** pattern comes in. It acts as a middleman to "soften" the strict enforcement of an interface.

**How it works:**

1.  An **abstract class** is created that implements the interface.
2.  This abstract class provides an **empty implementation** for all the methods in the interface.
3.  Because the abstract class has implemented all the methods (even if they are empty), the "강제성" (enforcement) from the interface is now gone.
4.  Your final, concrete class can now **extend** this abstract "Adapter" class and **override only the methods it actually needs**.

This pattern is very useful for event listeners in GUI programming (like in Swing or Android), where an interface might have many methods, but you only care about one or two events.

### Diagram:

```mermaid
graph TD
    A[Interface <br> (e.g., MouseListener)] -- implements --> B(Abstract Adapter Class <br> (e.g., MouseAdapter) <br> provides empty method bodies)
    B -- extends --> C(Your Concrete Class <br> (e.g., MyMouseHandler) <br> Overrides only the needed methods)

    subgraph "Strict Enforcement"
        A
    end

    subgraph "Enforcement Removed"
        B
    end

    subgraph "Selective Implementation"
        C
    end
```

### Example Code with an Adapter:

```java
// 1. An interface with many methods
interface PowerControls {
    void powerOn();
    void powerOff();
    void reboot();
    void enterSleepMode();
}

// 2. The Adapter class provides empty implementations
// The name often ends with "Adapter" to signal its purpose.
abstract class PowerControlsAdapter implements PowerControls {
    @Override
    public void powerOn() {} // Empty implementation

    @Override
    public void powerOff() {} // Empty implementation

    @Override
    public void reboot() {} // Empty implementation

    @Override
    public void enterSleepMode() {} // Empty implementation
}

// 3. Your class extends the adapter and only implements what's necessary
class MyDevice extends PowerControlsAdapter {
    // We only care about turning the device on and off.
    @Override
    public void powerOn() {
        System.out.println("Device is powering ON.");
    }

    @Override
    public void powerOff() {
        System.out.println("Device is shutting down.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyDevice device = new MyDevice();
        device.powerOn(); // Output: Device is powering ON.
        device.reboot();  // Does nothing, using the empty method from the adapter.
        device.powerOff(); // Output: Device is shutting down.
    }
}
```