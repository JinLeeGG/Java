package controlStatement;

// ctrl + shift + o
import java.util.Scanner;

public class IfTest {
	
	public static void main(String[] args) {
		
//		오늘 먹은 저녁 메뉴에 따라서 폭식, 다이어트, 폭주
//		치킨, 샐러드, 술 
		
		Scanner sc = new Scanner(System.in);
		String message = "오늘 먹은 저녁을 알려주세요.";
		String food = null;
		
		System.out.println(message);
		food = sc.next();
		
		// 문자열을 비교할때는 .equals()를 사용한다.
		if(food.equals("치킨")) {
			System.out.println("폭식 했습니다.");
		} else if(food.equals("샐러드")) {
			System.out.println("다이어트 했습니다.");
		} else if(food.equals("술")) {
			System.out.println("폭주를 했습니다.");
		} else {
			System.out.println("굶었습니다.");
		}
		
		sc.close();
	}
}
