package methodTest;

import java.util.Scanner;

public class MethodTask1 {

//	7분
//	1. 하나의 정수를 전달 받으면 2배로 값을 반환해주는 메서드
	int multipleBy2(int num) {
		return num * 2;
	}
	
//	10분
//	2. 이름을 n번 출력하는 메서드
	void printName(String name, int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
//		메서드를 실행
		
		MethodTask1 mt = new MethodTask1();
		
//		1번
//		int result = 0;
//		result = mt.multipleBy2(100);
//		System.out.println(result);
		
//		2번
		Scanner sc = new Scanner(System.in);
		String message = "이름과 반복할 횟수를 입력하세요.\nex)홍길동 3";
		String name = null;
		int count = 0;
		
		System.out.println(message);
		name = sc.next();
		count = Integer.parseInt(sc.next());
		mt.printName(name, count);
	}
}








