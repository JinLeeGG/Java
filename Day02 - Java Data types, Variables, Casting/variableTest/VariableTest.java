package variableTest;

public class VariableTest {
	// This is class area

	public static void main(String[] args) {
		// code must be inside of method
		// "=" 는 대입연산자이다. (값을 넣어준다는 의미이다)
		// 변수와 타입을 같이 정의를 해줘야한다. (정적 바인딩)
		/*
		 * int x = 10; String name = "Kim";
		 */

		// integer
		int a = 10;
		// float
		float b = 10.56F;
		double c = 10.567;
		// float(4byte)는 double(8byte) 안에 들어갈 수 있다. 하지만 데이터를 담는 크기가 다르므로 반대로는 안된다.
		double d = 123.456F;
		// 문자형
		char e = 'A';
		// 문자열
		String f = "ABC";

		
		
		
		// 실습
		// 각 데이터에 맞는 타입 선언 후 출력해보기
		// 5, false, 7845.15, B, 85.10F, 자바, S, 98590, D, true, 공백문자
		
		
//		여러 변수들을 한번에 선언하기:
//		int num1 = 5;
//		int num2 = 98590;
		int num1 = 5, num2 = 98590;

//		char char1 = 'b';
//		char char2 = 'S';
//		char char3 = 'D';		
		char char1 = 'b', char2 = 'S', char3 = 'D';
		

		boolean bool1 = false;
		boolean bool2 = true;

		double double1 = 7845.15;

		float float1 = 85.10F;

		String str1 = "자바";
		String str2 = " ";

		
//		줄 복사: Ctrl + Alt + 화살표 위 또는 아래 
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(char1);
		System.out.println(char2);
		System.out.println(char3);
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println(double1);
		System.out.println(float1);
		System.out.println(str1);
		System.out.println(str2);

	}

}
