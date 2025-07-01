package arrayTest;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		
		int[] arr = {1, 3, 2, 5, 7};
		int[] arr2 = new int[5];
		int[] arr3 = null;
				
		System.out.println(arr2);
//		System.out.println(arr2[0]);
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
		
//		for(int i = 0; i < 5; i++) {
//			System.out.println(arr[i]);
//		}
		
//		8분
//		arr에 5, 4, 3, 2, 1을 순서대로 담은 후 출력
//		for(int i = 0; i < 5; i++) {
//			arr[i] = 5 - i;
//		}
//		
		
//		배열의 길이도
		System.out.println(arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}





