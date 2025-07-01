package arrayTest;

import java.util.Scanner;

public class ArrayTask1 {
	public static void main(String[] args) {
//		1. 10칸짜리 배열을 선언 한 후 1~10까지 배열에 담는다.
//		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		         
//		2. 1~100까지 배열에 담고 홀수만 출력 (훌륭)
//		int[] arr2 = new int[100];
//		for(int i = 0; i < arr2.length; i++) {
//			arr2[i] = i + 1;
//			System.out.println(arr2[i]);
//		}
		
//		for(int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
		
//		3. 1~10까지 배열에 담고 모든 누적합을 출력하기 (출중)
//		int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int total = 0;
		
//		for(int i = 0; i < arr3.length; i++) {
////			total = total + i;
//			total += arr3[i];
//		}
//		System.out.println(total);
		
//		4. 5개의 정수를 입력받고 배열에 담은 후 (폭주)
//		최댓값과 최솟값을 출력하기
		int[] arr4 = new int[5];
		int min = 0, max = 0;
		Scanner sc = new Scanner(System.in);
		String message = "5개 정수를 입력하세요.", 
				exampleMessage = "예)10 20 30 40 50";
		
		System.out.println(message);
		System.out.println(exampleMessage);

		for(int i = 0; i < arr4.length; i++) {
			arr4[i] = sc.nextInt();
		}
		
		max = arr4[0];
		min = arr4[0];
		
		for(int i = 1; i < arr4.length; i++) {
			if(max < arr4[i]) { max = arr4[i]; };
			if(min > arr4[i]) { min = arr4[i]; };
		}
		
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
	}
}







