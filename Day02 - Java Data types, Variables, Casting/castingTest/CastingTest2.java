package castingTest;

public class CastingTest2 {
	public static void main(String[] args) {
		
//		일반 자료형 -> 문자열
		System.out.println("1" + 3);
		// 코드가 왼쪽에서 우로 읽키기 때문에 문자열에 정수를 더하는게 된다. (좌결합성)
		System.out.println("1" + 3 + 8);
		// 내가 만약 111을 출력하고 싶다면? - 소괄호로 묶어준다
		System.out.println("1" + (3 + 8));

//		문자열 -> 일반 자료형
//		"3.9" -> 3.9
//		String : "3.9"
//		double : 3.9
//		Double -> double 의 parent class
		
		double num1 = Double.parseDouble("3.9"); // 3.9라는 더블 타입이 된다.
		boolean isTrue = Boolean.parseBoolean("true"); // true 라는 불린 타입이 된다. 
		int num2 = Integer.parseInt("20");
		
		// 실수 -> 문자열
		String str1 = String.valueOf(3.9); 		
		
		
	}
}