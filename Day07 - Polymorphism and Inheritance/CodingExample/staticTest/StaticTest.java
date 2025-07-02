package staticTest;

class Data {
	int data; // 동적 변수
	static int data_s; // 정적 변수
	
	void increase() {
		System.out.println(++data);
	}
	
	void increase_s() {
		System.out.println(++data_s);
	}
}


// 접근 권한 제어자
// 선택값 public, private, protected
// 파일명과 같은 클래스는 다 public 으로 만들어줘야 한다. 

public class StaticTest {
	public static void main(String[] args) {
		Data data1 = new Data(); // 메모리상의 데이터 클래스를 할당시켜놓고 추가시킨다. 
//		data1.increase();
//		data1.increase();
//		data1.increase();
//		data1.increase();
//		data1.increase();
//		
		// new 를 만나면 정적 데이터가 종료된다. 
//		data1 = new Data(); // 메모리상의 데이터 클래스를 하나 더 할당시켜놓고 추가시킨다. 
//		
//		data1.increase();
//		data1.increase();
//		data1.increase();
//		data1.increase();
//		data1.increase();
		
		data1.increase_s();
		data1.increase_s();
		data1.increase_s();
		data1.increase_s();
		data1.increase_s();
		
		data1 = new Data(); // new 를 만나면 정적 데이터가 종료된다. (하지만 동적 데이터는 프로그램이 종료되지 않는 이상 종료되지 않는다)
		
		data1.increase_s();
		data1.increase_s();
		data1.increase_s();
		data1.increase_s();
		data1.increase_s();
		
		// 자바의 garbage collector (사용하지 않는 정적 데이터를 삭제한다)
		System.gc();
		
	}
}
