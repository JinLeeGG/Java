package controlStatement;

public class ForTest {
	public static void main(String[] args) {

//		전위형, 후위형 차이
		
//		int data = 10;
		
//		한줄복사 alt + ctrl + 화살표 아래

//		데이터를 증가하고 데이터 출력
//		System.out.println(++data);

//		데이터를 출력하고 증가시키기		
//		System.out.println(data++);
//		System.out.println(data);
		
//		for loop
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1 + ". 홍길동");
		}
		
//		10 ~ 1까지 출력
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
//		10 ~ 1까지 출력		
		for(int i = 0; i < 10; i++) {
			System.out.println(10 - i);
		}
		
	}
}
