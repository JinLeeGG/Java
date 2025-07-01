package arrayTest;

import java.util.Scanner;

//만약 사용자가 입력한 글자가 소문자라면 대문자로 바꾸고
//소문자라면 대문자로 바꿔서 출력한다.
//단, 영어 이외에 단어는 그대로 출력된다.
//ex)
//입력 : 안녕hi!
//출력 : 안녕HI!

//System.out.println("abcded".length());
//System.out.println("abcded".charAt(0));

public class ArrayT2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "대소문자를 바꿀 문장을 입력하세요.", input = null;
		char[] arr = null;
		
		System.out.println(message);
		input = sc.nextLine();
		
//		사용자가 입력한 글자만큼 배열 칸수를 만들고,
		arr = new char[input.length()];
		
//		'A': 65
//		'a': 97
//		알파뱃 개수: 26
//		배열에 각 글자를 담는다.
		for(int i = 0; i < input.length(); i++) {
			char c = (char)input.charAt(i);
			
			if(c >= 65 && c <= 90) { // 대문자
				arr[i] = (char)(c + 32);
			}else if(c >= 97 && c <= 122) { // 소문자
				arr[i] = (char)(c - 32);
			}else {
				arr[i] = c;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
