package methodTest;

public class MethodTest {
	
//	메서드의 선언
	void printTest(String name) {
//		이름을 받으면 이름을 콘솔에 출력
		System.out.println(name);
	}
	
	int sumTest(int num1, int num2) {
		return num1 + num2;
	}
	
	public static void main(String[] args) {
//		메서드 사용
//		동적 메모리 할당
		MethodTest mt = new MethodTest();
		
//		메서드의 사용
		mt.printTest("홍길동");
		
//		두 정수를 전달하면 두 정수를 더해주는 함수
		int num = mt.sumTest(20, 30);
		System.out.println(num);
		
	}
}



