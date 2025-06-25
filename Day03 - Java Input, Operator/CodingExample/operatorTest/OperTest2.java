package operatorTest;

public class OperTest2 {
	public static void main(String[] args) {
//		이항 연산자
		System.out.println(10 + 10);
		System.out.println(20 - 7);
		System.out.println(3 * 7);
		
//		몫 /, 나머지 %
//		자동 형변환으로 정수와 정수를 계산했기때문에 정수가 나온다 >> 7
		System.out.println(30 / 4);
//		double 타입으로 바꾸면 7.5가 나온다.
		System.out.println(30 / (double)4);
		
//		나머지값 구하기 30/4 = 7..2
		System.out.println(30 % 4);
		
	}
}
