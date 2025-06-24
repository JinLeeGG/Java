package variableTest;

public class FormatTest {
	
	public static void main(String[] args) {
//      서식 문자(format)
//      반드시 따옴표 안에서 작성한다.
//      
//      %d : decimal(10진수 정수)
//      %o : octal(8진수 정수)
//      %x : hexadecimal(16진수 정수)
//      %f : float(실수)
//      %c : character(문자)
//      %s : string(문자열)
		
		// My name is XXX, age is xx years old, my height is xxx cm.
		
		String name = "Gyujin Lee";
		int age = 22;
		double height = 172.02;
		
		// 자바에서는 문자열과 변수값이 더하기로 연결되면 "연산" 처리를 하지아않고 연결처리를 한다.
		System.out.println("My name is " + name + ", age is " + age + " years old, my height is " + height +" cm.");
		
		//printf 사용. 순서대로 인식한다. 
		System.out.printf("My name is %s, age is %d years old, my height is %f cm.", name, age, height);
		
	}
}
