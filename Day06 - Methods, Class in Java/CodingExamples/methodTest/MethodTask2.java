package methodTest;

public class MethodTask2 {
	
//	10분
//	1. 두 수의 대소비교 후 큰 값을 알려주는 메서드
	int getMax(int num1, int num2) {
		if(num1 == num2) { return -1; } 
		return num1 > num2 ? num1 : num2; 
	}
	
//	가변인자
//	매개변수가 몇 개가 들어올지 모를 때 사용하는 문법
	int getMax2(int... numbers) {
		int max = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			if(max < numbers[i]) {
				max = numbers[i];
			}
		}
		return max;
	}	
	
//	12분
//	단, 가변인자로 만든다.
//	사용자에게 0,1,0,1,0,0,1,0,0,1를 받아서
//	0의 개수와 1의 개수를 반환해주는 함수
//	ex) 0의 개수 5개, 1의 개수 4개
	String getCountZeroAndOne(int... numbers) {
		int zeroCount = 0;
		int oneCount = 0;
		String result = null;
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == 0) {
				zeroCount++;
			}else if(numbers[i] == 1) {
				oneCount++;
			}else {
				continue;
			}
		}
		
		result = "결과)\n0의 개수:" + zeroCount + "\n1개 개수:" + oneCount;
		return result;
	}
	
	
	
	
	
	
//	2. 정수 배열을 받아서, 배열의 평균값을 구하는 메서드
	double getAverage(int[] arr) {
		int total = 0; 
		double average = 0.0;
		
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		average = total / arr.length;
		return average;
	}
	
	
	public static void main(String[] args) {
		MethodTask2 mt2 = new MethodTask2();
		int[] arr = {30, 25, 22, 17, 50};
		int max = 0;
		double average = 0.0;
		
		max = mt2.getMax(30, 10);
		System.out.println("큰 값:" + max);
		
		average = mt2.getAverage(arr);
		System.out.println("평 균:" + average);
		
		mt2.getMax2(10, 20, 30, 40, 50);
		
		System.out.println(mt2.getCountZeroAndOne(0, 1, 1, 0, 0, 1, 1, 1, 0));
		
		
	}
}











