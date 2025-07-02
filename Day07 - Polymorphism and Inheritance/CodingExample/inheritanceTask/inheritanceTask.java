package inheritanceTask;

// 같은 package 안에 있음으로 import가 필요없다.

//상속 및 분리 실습
//
//PersonTask
//이름, 나이, 주소, 핸드폰
//각 메서드 출력
//work 일을 한다
//sleep 잠을 잔다
//eat 세 끼를 먹는다
//
//StudentTask
//인스타아이디
//각 메서드 출력
//work 아르바이트를 한다
//sleep 수업 시간에 잠을 잔다
//eat 아침을 거른다
//
//EmployeeTask
//비상금
//각 메서드 출력
//work 하루 종일 일을 한다
//sleep 잠을 설친다
//eat 야식을 먹는다
//

//InhertanceTask에서
//사람, 학생, 직장인 객체화 후 각 메서드 출력하기

public class inheritanceTask {
	public static void main(String[] args) {
		PersonTask pt = new PersonTask("이규진", 23, "강남", "아이폰");
		System.out.println("이름: " + pt.name + "\n나이: " + pt.age + 
				"\n주소: " + pt.address + "\n핸드폰: " + pt.phone);
		pt.work();
		pt.sleep();
		pt.eat();
		System.out.println("");
		
		StudentTask st = new StudentTask("김사과", 18, "서초", "아이폰", "@1234");
		System.out.println("이름: " + st.name + "\n나이: " + st.age + 
				"\n주소: " + st.address + "\n핸드폰: " + st.phone + "\n인스타: " + st.insta);
		st.work();
		st.sleep();
		st.eat();
		System.out.println("");
		
		EmployeeTask et = new EmployeeTask("김사과", 18, "서초", "아이폰", 1000);
		System.out.println("이름: " + et.name + "\n나이: " + et.age + 
				"\n주소: " + et.address + "\n핸드폰: " + et.phone + "\n비상금: " + et.cash);
		et.work();
		et.sleep();
		et.eat();
	}
}
