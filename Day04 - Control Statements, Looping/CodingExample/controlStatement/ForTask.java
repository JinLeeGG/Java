package controlStatement;

public class ForTask {

	public static void main(String[] args) {
		
//		1~100까지 짝수만 출력하기
		for(int i = 1; i <= 100; i++) {			
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
//		1 부터 10 까지 더한 연산을 보고싶다.
		int result = 0;
		for(int i = 1; i <= 10; i++) {
//			누적 복합 연산자
//			result = result + i;
			result += i;
		}
		
		System.out.println(result);

	}
}