package controlStatement;

public class ForTask3 {

	public static void main(String[] args) {
		
//      합격선
//      1. 1~100까지 출력
//      2. 100~1까지 출력
//      3. 100~1까지 중 홀수만 출력하기
//		4. 1~50까지만 반복해서 모든 값을 누적합하기
//      5. 1~100중에 10~20까지 출력하기
		
		System.out.println("1. 1~100까지 출력");
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		
		System.out.println("2. 100~1까지 출력");
		for (int i = 1; i <= 100; i++) {
			System.out.println(101-i);
		}
		
		System.out.println("3. 100~1까지 중 홀수만 출력하기");
		for (int i = 100; i >= 1; i--) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		int result = 0;
		System.out.println("4. 1~50까지만 반복해서 모든 값을 누적합하기");
		for (int i = 1; i <= 50; i++) {
			result += i;
		}
		System.out.println(result);
		
		
		System.out.println("5. 1~100중에 10~20까지 출력하기");
		for (int i = 0; i < 100; i ++) {
			int num = i + 1;
			if (10 <= num && 20 >= num) {
				System.out.println(num);
			}
		}
		
		
//      서핑
//      A~F까지 출력하기
//      A~F까지 중 C를 제외하고 출력하기
//      aBcDeFgHi...Z까지 출력하기
		
		System.out.println("A~F까지 출력하기");
		for(int i = 1; i <= 6; i++) {
			System.out.print((char)(64+i));
		}
		
		
		System.out.println("A~F까지 중 C를 제외하고 출력하기");
		for(int i = 1; i <= 6; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println((char)(64+i));
		}
		
		System.out.println("aBcDeFgHi...Z까지 출력하기");
		for(int i = 1; i <= 26; i++) {
			System.out.println((char)(96+i));
			System.out.println((char)(64+i));
			
		}
		
		
      
//		      서핑
//		      A ~ F까지 출력하기
//		      for(int i = 0; i < 6; i++) {
//		         System.out.println((char)('A' + i));
//		      }
      
//		      A~F까지 중 C를 제외하고 출력하기
//		      for(int i = 0; i < 5; i++) {
//		         System.out.print((char)(i > 1 ? 'A'+ 1 + i : 'A' + i));
//		      }
      
//		      aBcDeFgHi...Z까지 출력하기
//		      for(int i = 0; i < 26; i++) {
//		         System.out.print((char)(i % 2 == 1 ? 'A' + i : 'a' + i));
//		      }
      
//		      마스터 별찍기
//		        *
//		       ***
//		      *****
//		     *******
//		    *********
		     

	}
	
}


