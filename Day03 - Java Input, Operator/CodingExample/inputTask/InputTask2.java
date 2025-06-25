package inputTask;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
//		세 정수를 입력 받아서, 세 정수의 곱셈 결과를 출력하기
		
		// Initialize variables
		Scanner sc = new Scanner(System.in);
		System.out.println("Result: " + sc.nextInt() * sc.nextInt() * sc.nextInt());
		
		sc.close();
		
////      7분
////      세 정수를 입력 받아서, 세 정수의 곱셈(*) 결과를 출력하기
//	    Scanner sc = new Scanner(System.in);
//	    int num1 = 0, num2 = 0, num3 = 0, result = 0;
//	    String message = "세 정수를 입력하세요.\nex)10 20 30", format = "%d * %d * %d = %d";
//	      
//	    System.out.println(message);
//	    num1 = Integer.parseInt(sc.next());
//	    num2 = Integer.parseInt(sc.next());
//	    num3 = sc.nextInt();
//	    result = num1 * num2 * num3;
//	    System.out.printf(format, num1, num2, num3, result);
	}
}
