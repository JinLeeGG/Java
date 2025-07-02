package classTest;

// 추상화
public class Company {
	String name;
	int age;
	int income;

//	기본 생성자
	public Company() {;}
	
//	초기화 생성자
	public Company(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		Company employee1 = new Company("홍길동", 20);
		System.out.println(employee1.name);
		
		Company employee2 = new Company("김길동", 45);
		System.out.println(employee2.name);
		
		Company employee3 = new Company("장독대", 15);
		System.out.println(employee3.name);
	}
	
	
	
	
	
	
	
}
