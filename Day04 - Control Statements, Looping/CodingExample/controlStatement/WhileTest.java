package controlStatement;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {

//		While 문
//		True 값이 기본이며, while 문 안에서 빠져나오게하는 코드가 필요하다.
		int count = 0;
		while(true) {
			System.out.println("현재 카운트: " + count);
			count ++;
			if (count == 100000) {
				break;
			}
		}
		
//		do-while 문
//		통신사 민원 접수
		String message = "1. 분실 신고\n"
					+ "2. 통신사 이동\n"
					+ "3. 결제 수단 변경\n"
					+ "5. 상담 종료\n"
					+ "0. 상담원 연결";
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
//		5를 누르지 않는 이상 계속 돌아간다.
		do {
			System.out.println(message);
			choice = sc.nextInt();
		}while(choice != 5);
	
	}
}
