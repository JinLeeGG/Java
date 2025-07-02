package classTest;

// 추상화
public class Company {
	// 동적 할당
	// Company라는 class를 가진 요소는 money를 가지고 있다.
	static int money;
	
	// 정적 할당
	// 개인당 할당되는 요소
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
		
		Company employee1 = new Company("이규진", 20);
		employee1.income -= 10_000;
		System.out.println(employee1.name);
		
		Company employee2 = new Company("김현우", 20);
		employee2.income += 50_000;
		System.out.println(employee2.name);
		
		Company employee3 = new Company("박정호", 7);
		employee3.income -= 20_000;
		System.out.println(employee3.name);
		
//		부도 - 범인 이규진
		employee1.income -= 20_000;
		
		Company.money += employee1.income;
		Company.money += employee2.income;
		Company.money += employee3.income;
		
		System.out.println(String.valueOf(Company.money));
		
	}
	
	
	
	
	
	
	
}
