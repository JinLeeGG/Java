package casting;

// Car
class Car {
	public Car() {;}
	
	void engineStart() {
		System.out.println("열쇠로 시동 킴!");
	}
}


// SuperCar
class SuperCar extends Car {
	
	@Override
	void engineStart() {
		System.out.println("엔진 스타트 음성으로 시동 킴");
	}
	
	void openRoof() {
		System.out.println("뚜껑 오픈!");
	}
}


public class CastingTest2 {
	public static void main(String[] args) {
		// 일반 객체 생성
		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();
		
		// upcasting 객체
		Car noOptionFerrari = new SuperCar();
		
		// 일반객체와 업캐스팅의 차이
		// 부모 크기 만큼만 메모리에 할당되기 때문에 부모클래스 안에 있는 메서드만 사용이 가능하다.
		noOptionFerrari.engineStart(); // 자식 클래스 안에 있는 메서드가 출려된다. (부모 메모리에 덮어씌어진다)
//		noOptionFerrari.openRoof() // 이건 작동이 안된다.
		
//		다운캐스팅
		SuperCar optionFerrari = (SuperCar)noOptionFerrari;
		optionFerrari.openRoof();
		
		System.out.println(matiz instanceof Car);
		
//      instanceof : 조건식   
//      객체 instanceof 타입
	    System.out.println(matiz instanceof Car);
	    System.out.println(matiz instanceof SuperCar);
	    System.out.println(ferrari instanceof Car);
	    System.out.println(ferrari instanceof SuperCar);
	    System.out.println(noOptionFerrari instanceof Car);
	    System.out.println(noOptionFerrari instanceof SuperCar);
	    System.out.println(optionFerrari instanceof Car);
	    System.out.println(optionFerrari instanceof SuperCar);
		
	}
}
