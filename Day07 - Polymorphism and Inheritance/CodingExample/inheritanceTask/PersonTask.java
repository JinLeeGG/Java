package inheritanceTask;

//상속 및 분리 실습
//
//PersonTask
//이름, 나이, 주소, 핸드폰
//각 메서드 출력
//work 일을 한다
//sleep 잠을 잔다
//eat 세 끼를 먹는다

public class PersonTask {
	String name;
	int age;
	String address;
	String phone;

	public PersonTask() {;}
	
//	Alt + shift + S -> 0
	

	public PersonTask(String name, int age, String address, String phone) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}
	
	public void work() {
		System.out.println("일을 한다.");
	}

	public void sleep() {
		System.out.println("잠을 잔다.");
	}
	
	public void eat() {
		System.out.println("세 끼를 먹는다.");
	}
}
