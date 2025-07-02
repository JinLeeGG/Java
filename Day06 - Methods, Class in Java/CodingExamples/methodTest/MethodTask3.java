package methodTest;

public class MethodTask3 {
	
//	.split() 사용 안됨
//	.chatAt(인덱스) : 해당 인덱스의 값을 가져오는 메서드
	
//	1. "가a나a다a라a마a바" 값 중에서 a를 제거하고 
//	"가나다라마바"만 출력해주는 메서드
	void removeA(String content) {
		String result = "";
		for(int i = 0; i < content.length(); i++) {
			if(content.charAt(i) != 'a') {
				result += content.charAt(i);
			}
		}
		System.out.println(result);
	}
	
//	2. "abcdefg"라고 전달하면 "gfedcba"로 뒤집어서 값을 주는 메서드
	String reverse(String content) {
		String result = "";
		for(int i = 0; i < content.length(); i++) {
			result += content.charAt(content.length() - 1 - i);
		}
		return result;
	}
	
	public static void main(String[] args) {
		MethodTask3 mt3 = new MethodTask3();
		String reverseResult = null;
		mt3.removeA("가a나a다a라a마a바");
		
		reverseResult = mt3.reverse("abcdefg");
		System.out.println(reverseResult);
		
//		.split(구분자): 구분자를 기준으로 잘라 리스트로 반환하는 문자열 메서드
		String[] arrData1 = null;
		"가a나a다a라a마a바".split("a");
		"가.나.다.라.마.바".split("\\.");
		
//		구분자를 아무것도 전달하지 않으면, 처음부터 끝까지 모두 자른다.
		arrData1 = "가a나a다a라a마a바".split("");
		for(int i = 0; i< arrData1.length; i++) {
			System.out.println(arrData1[i]);
		}
		
//		.indexOf(char): 해당 값이 위치한 index를 반환해주는 메서드
		System.out.println("가a나a다a라a마a바".indexOf('마'));
		
		
	}
}





