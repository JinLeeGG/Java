package arrayTest;

import java.util.Scanner;

public class ArrayT1 {
	public static void main(String[] args) {
//		1. 10칸짜리 배열을 선언 한 후 1~10까지 배열에 담는다.
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
//		2. 1~100까지 배열에 담고 홀수만 출력 (훌륭)
		
		int[] arr1 = new int[100];
		
		for(int i = 1; i < arr1.length; i++) {
			arr1[i] = i; 
			if (arr1[i] % 2 != 0){
				System.out.println(arr1[i]);
			}
		}
		
		
//		3. 1~10까지 배열에 담고 모든 누적합을 출력하기 (출중)
		int[] arr2 = new int[11];
		int count = 0;
		
		for(int i = 1; i < arr2.length; i++) {
			arr2[i] = i;
			count += arr2[i];
		}
		System.out.println(count);
		
		
//		4. 5개의 정수를 입력받고 배열에 담은 후 (폭주)
//		최댓값과 최솟값을 출력하기
		
		int[] arr3 = new int[5];
		int min = 0, max = 0;
		Scanner sc = new Scanner(System.in);
		String message = "5개 정수를 입력하세요.", 
				exampleMessage = "예)10 20 30 40 50";
		
		System.out.println(message);
		System.out.println(exampleMessage);
		
		for(int i = 0; i < arr3.length; i++) {
			arr3[i] = sc.nextInt();
		}
		
		max = arr3[0];
		min = arr3[0];
		
		for(int i = 1; i < arr3.length; i++) {
			if (max < arr3[i]) {
				max = arr3[i];
			}
			if (min > arr3[i]) {
				min = arr3[i];
			}
		}
		
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
		
	}
}
