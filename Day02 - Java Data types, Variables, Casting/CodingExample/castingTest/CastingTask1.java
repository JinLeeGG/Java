package castingTest;

public class CastingTask1 {
	public static void main(String[] args) {
		
		int num1 = 1, num2 = 0, num3 = 0;
		String str1 = "8.24", str2 = "7.8";
		
//		실습
//		num1 + str1 + str2로 115 만들기
		
		// interger -> String 변환 
		String st = String.valueOf(num1); 		
		
		// String -> Double 변환
		double numStr1 = Double.parseDouble(str1);
		double numStr2 = Double.parseDouble(str2);
		
		// (Double + Double) --> int로 변환 후 (15) 
		// String 1과 더해주면 "1" + 15 >> "1" + "15" >> "115"가된다.  
		System.out.println(st +((int)numStr1 + (int)numStr2));
		
		
//      int num1 = 1, num2 = 0, num3 = 0, num4 = 0;
//      String str1 = "8.24", str2 = "7.8";
//      
//	        실습, 7분
//      	num1 + str1 + str2로 115만들기
//      num2 = (int)Double.parseDouble("8.24");
//      num3 = (int)Double.parseDouble("7.8");
//      num4 = num2 + num3;
//      System.out.println(String.valueOf(num1) + num4);
	      
	}
}
