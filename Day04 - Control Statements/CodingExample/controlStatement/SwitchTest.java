package controlStatement;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
	    int choice = 0;
	    String message = "동물 소리 버튼을 선택하세요.\n"
	            + "1. 강아지\n"
	            + "2. 고양이\n"
	            + "3. 병아리\n"
	            + "4. 여우";
	    
	    System.out.println(message);
	    choice = sc.nextInt();
	    
	    // 스위치문은 다중선택문이 아니다. 예를 들어 case 2 일경우 뒤에있는 모든 코드를 실행시킨다. (냥, 규진규진, 상훈상훈, 잘못선택했습니다.)
	    // 이걸 방지하기위해서 break 문을 사용한다.
	    switch(choice) {
	    case 1:
	    	System.out.println("으르렁");
	    	break;
	    case 2:
	    	System.out.println("냥");
	    	break;
	    case 3:
	    	System.out.println("규진규진");
	    	break;
	    case 4:
	    	System.out.println("상훈상훈");
	    	break;
	    // else 와 동일 (디폴트값)
	    default:
	    	System.out.println("잘못 선택했습니다.");
	    	break;
	    }
	    
	    sc.close();
		
	}
}
