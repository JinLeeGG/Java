package inputTest;

import java.util.Scanner;

// ctrl + shift + o 
// 필요한 모듈을 가져온다. 

public class InputTest {

	public static void main(String[] args) {	
		// 입력을 받을수 있는 메서드를 가져올려면 클래스를 가져와야한다.
		Scanner sc = new Scanner(System.in);
		// 변수 선언은 맨 위상단에 해야 함으로 name 을 하나 만들어준다
		String name = null, firstName = null, lastName = null;
		
		System.out.println("이름을 입력하세요.");
		
//		// Scanner 가 user input 을 받을 수 있다. (변수의 재할당)
//		// next()는 인풋을 한개 받아올때 사용한다.
//		lastName = sc.next();
//		// 여러 개의 인풋을 받아올려면? 인풋값을 여러개 선언하면 된다. 
//		firstName = sc.next();

		// nextLine은 띄어쓰기까지 문자열로 보는 매서드이다.  
		name = sc.nextLine();
		
//		System.out.println(lastName + firstName + "님 환영합니다!");
		System.out.println(name + "님 환영합니다!");
		
		sc.close();
		
	}
	
}
