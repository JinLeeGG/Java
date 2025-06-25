package operatorTest;

import java.util.Scanner;

// 삼항 연산자 실습
public class OperTask3 {
	public static void main(String[] args) {
//		성적 등급 매기기
//		90이상 A 
//		80이상 B
//		70이상 C
//		70미만은 F
		
//		초기값 
//		정수: 0;
//		실수: 0.0;
//		문자형 : ' ';
//		문자열 : null, ""; (+ 이용해서 강제 형변환시 "" 사용)
		
		
		
		int score = 0;
		Scanner sc = new Scanner(System.in);
		String result = null;
		String message = "Insert your test score: ";
		String gradeA = "A", gradeB = "B", gradeC = "C", gradeF = "F";
		String ErrorM = "Invalid Input";
		
		System.out.println(message);
		score = sc.nextInt();
		
		result = score >= 90 ? gradeA 
				: score >= 80 ? gradeB 
						: score >= 70 ? gradeC 
								: score < 70 ? gradeF : ErrorM;
		
		System.out.println("Your grade is: " + result);
		sc.close();
		
	}
}
