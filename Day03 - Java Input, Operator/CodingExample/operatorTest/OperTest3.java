package operatorTest;

public class OperTest3 {
	public static void main(String[] args) {
//		삼항 연산자
		int num1 = 11, num2 = 30;
		
//		True 인경우 "나머지가 없습니다." 출력, False 인경우 나머지 출력  
		String result = num2 % num1 == 0 ? "나머지가 없습니다." : "나머지: " + num2 % num1; 
		System.out.println(result);
		
	}
}
