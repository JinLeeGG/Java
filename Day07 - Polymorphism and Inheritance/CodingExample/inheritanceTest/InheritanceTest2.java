package inheritanceTest;

// 사람 
class Human {
	String name;
	public Human() {;}
	public Human(String name) {
		this.name = name;
	}
	
//	 먹고 자고 걷고
	void eat() {
		System.out.println("먹기");
	}
	
	void sleep() {
		System.out.println("자기");
	}
	
	void walk() {
		System.out.println("두 발로 걷기");
	}
	
}


class Monkey extends Human {
	public Monkey(String name) {
		super(name); // == Human(String name){}
	}
	
	@Override
	void walk() {
		System.out.println("네 발로 걷기");
	}
	
	// 이런식으로 각각 만드는것은 비효율적이다.
	void monkeyWalk() {
		System.out.println("킹콩은 네 발로 걷습니다.");
	}
}

class Snake extends Human {
	// 이런식으로 각각 만드는것은 비효율적이다.
	
	@Override
	void walk() {
		System.out.println("기어다닙니다.");
	}
	
	void snakeWalk() {
		System.out.println("뱀은 기어다닙니다.");
	}
}



public class InheritanceTest2 {
	public static void main(String[] args) {
		Monkey kingkong = new Monkey("홍킹콩");
		kingkong.walk();
		System.out.println(kingkong.name);
		
		Snake cobra = new Snake();
		cobra.walk();
		
	}
}
