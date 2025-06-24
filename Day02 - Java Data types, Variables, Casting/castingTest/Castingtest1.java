package castingTest;

public class Castingtest1 {
	
	public static void main(String[] args) {
		
		// 내가 형변환을 해야할때가 있고 자동으로 해야할때가 있다.
		
//		자동 형변환
//		실수 + 정수 = 실수
//		문자열 + 값 = 문자열
		
		
//		자동 형변환:
		
		// 이 경우 문자열로 변환된다.
		System.out.println(20 + "");
		// 이 경우 integer 로 나온다.
		System.out.println(1 + 1);
		// 이 경우 실수로 형변환이 자동으로 된다.
		System.out.println(1 + 2.5);
		// 이 경우 문자열로 바뀐다. 
		System.out.println("1" + 1);			
		// 이 경우 integer 로 나온다.
		System.out.println(5/2); 
		
//		강제 형변환:
		
		// 이 경우 타입캐스팅으로 double 로 나온다
		System.out.println(5/(double)2);
		
		// 실수값을 정수로 바꾸면 모든 가수가 사라진다.
		System.out.println((int)8.43); 
		// 두 수를 더해서 10으로 만들기
		System.out.println((int)8.43 + (int)2.59);
		
		// ASCII code 자동 형변환 A = 65이다. 
		// 자바는 백앤드 언어로서, 비번 암호화를 할때 사용한다. 
		System.out.println('A' + 10);
		System.out.println((char)('A' + 10)); // 이런식으로 다시 문자열로 바꾸는것도 가능하다.
	}
}
