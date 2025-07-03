package casting;

//Type: Person
class Person{}

//Type: Alien, Person
class Alien extends Person{}

public class CastingTest {
	public static void main(String[] args) {
		
//		upcasting & downcasting
		
//		upcasting
		Person a = new Alien();
		
//		downcasting
		a = (Alien)a;
		
//		부모 클래스는 자식 클래스를 모르기 때문에 되지 않는다.
//		Alien b = new Person(); // 그냥 에러가 난다. 
		
		
		
	}
}
