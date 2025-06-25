package operatorTest;

import java.util.Scanner;

public class OperTask1 {
	public static void main(String[] args) {
//		두 정수를 입력하면, 몫과 나머지를 구해서 출력하기
//		ex) 입력한 값: 10 2
//			몫: 5, 나머지: 0
		
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, division = 0, remainder = 0;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		division = num1 / num2;
		remainder = num1 % num2;
		
		System.out.println("몫: " + division + ", 나머지: " + remainder);
		
		sc.close();
	}
}
