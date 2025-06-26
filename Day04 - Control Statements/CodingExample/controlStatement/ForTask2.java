package controlStatement;

import java.util.Scanner;

public class ForTask2 {
	public static void main(String[] args) {

		String message = "N을 입력하세요: ";
		int userInput = 0;
		int result1 = 0, result2 = 0;
		Scanner sc = new Scanner(System.in);
		
		
//      6분
//      1)
//      1~100까지 반복 후 짝수만 누적합하기			
		for(int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				result1 += i;
			}
		}
		System.out.println(result1);
	
		
//      9분
//      2)
//      n 은 사용자에게 입력받는다.
//      1~n 까지의 합을 출력하기	
		System.out.println(message);
		userInput = sc.nextInt();
		for(int i = 1; i <= userInput; i++) {
			result2 += i;
		}
		System.out.println(result2);
		
		sc.close();
		
	}
	
}