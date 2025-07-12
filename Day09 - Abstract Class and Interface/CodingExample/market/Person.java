package market;

public class Person {
	String name;
	int age;
	int money;
	int discount;
	
	// 기본 생성자
	public Person() {;}
	
	// 생성자 
	public Person(String name, int age, int money, int discount) {
		this.name = name;
		this.age = age;
		this.money = money;
		this.discount = discount;
	}
}
