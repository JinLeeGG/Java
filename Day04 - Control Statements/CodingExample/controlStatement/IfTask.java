package controlStatement;
import java.util.Scanner;

public class IfTask {
	public static void main(String[] args) {
		
//		동물 소리 버튼을 선택하세요.
//		1. 강아지
//		2. 고양이
//		3. 병아리
//		4. 여우
//		입력을 받아서 각 버튼에 따라 울음소리를 출력합니다
		
		int dog = 1, cat = 2, chicken = 3, fox = 4;
		String message = "동물 소리 버튼을 선택하세요.\r\n"
				+ "1. 강아지\r\n"
				+ "2. 고양이\r\n"
				+ "3. 병아리\r\n"
				+ "4. 여우\r\n"
				+ "입력을 받아서 각 버튼에 따라 울음소리를 출력합니다";
		int userInput = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(message);
		userInput = sc.nextInt();
		
		if (userInput == dog) {
			System.out.println("깨갱");
		}
		else if (userInput == cat) {
			System.out.println("야옹");
		}
		else if (userInput == chicken) {
			System.out.println("규진규진");
		}
		else if (userInput == fox) {
			System.out.println("후우우");
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		sc.close();
	}
}
