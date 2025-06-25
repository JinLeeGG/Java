package operatorTest;

import java.util.Scanner;

public class OperTask2 {
	public static void main(String[] args) {

//		키오스크
//		사용자에게 메뉴 선택 받아 출력해주기
//		Q. 메뉴를 고르세요
//		1. 아메리카노
//		2. 카페라떼
//		3. 에이드
//		4. 밀크티
		
//		키오스크 
		Scanner sc = new Scanner(System.in);
		String message = "Q. 메뉴를 고르세요. \n1.아메리카노\n2.카페라떼\n3.에이드\n4.밀크티", 
				result = null, errorMessage = "잘못 입력하셨습니다.";
		String menu1 = "아메리카노", menu2 = "카페라떼", menu3 = "에이드", menu4 = "밀크티";
		int choice = 0;
		
		
		System.out.println(message);
		
		choice = sc.nextInt();
		
		result = choice == 1 ? menu1 
				: choice == 2 ? menu2 
						: choice == 3 ? menu3 
								: choice == 4 ? menu4 : errorMessage; 
		
		System.out.println(result);
		
		sc.close();
	}
}
