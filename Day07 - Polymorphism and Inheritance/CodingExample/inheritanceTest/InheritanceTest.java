package inheritanceTest;

class A {
	String name;
	int data;

	public A() {
		System.out.println(this);
		System.out.println("부모 생성자 호출");
		this.name = "A";
		this.data = 10;
	}
	
	void printName() {
		System.out.println(name);
	}
	
}

class B extends A {
	public B() {
		super(); // == A() 부모 생성자를 불러주는 것.
		System.out.println(this);
		System.out.println("자식 생성자 호출");
	}
	
	// 만약 A에서 코드를 가져왔다면 data 가 출력될것이다. 
	void printData() {
		System.err.println(data);
	}
}


public class InheritanceTest {
	public static void main(String[] args) {
		B b = new B();
		b.printName();
		b.printData();
	}
}
