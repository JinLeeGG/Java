package inputTask;

// Ctrl + Shift + O --> 필요한 모듈 가져오기
import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
//		두 정수를 입력한 뒤 덧셈 결과를 출력하기
//		단, next 만 사용하기
		
		// Initialize variables
		Scanner sc = new Scanner(System.in);
		String num1 = null, num2 = null;
		int convertedNum1 = 0, convertedNum2 = 0;
		
		// Take number (string type) as input
		num1 = sc.next();
		num2 = sc.next();
		
		// convert strings to integer
		convertedNum1 = Integer.parseInt(num1);
		convertedNum2 = Integer.parseInt(num2);
		
		// print out result 
		System.out.println(convertedNum1 + convertedNum2);
		
		sc.close();
		
	}
}
