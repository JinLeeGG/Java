package inheritanceTest;

// 다른 패키지 안에 있음으로 import 를 해줘야 한다.

import inheritanceTask.EmployeeTask;
import inheritanceTask.PersonTask;
import inheritanceTask.StudentTask;

// 상속 및 분리 실습
// 
// PersonTask
// 이름, 나이, 주소, 핸드폰
// 각 메서드 출력
// work 일을 한다
// sleep 잠을 잔다
// eat 세 끼를 먹는다


//StudentTask
//인스타아이디
//각 메서드 출력
//work 아르바이트를 한다
//sleep 수업 시간에 잠을 잔다
//eat 아침을 거른다


// EmployeeTask
// 비상금
// 각 메서드 출력
// work 하루 종일 일을 한다
// sleep 잠을 설친다
// eat 야식을 먹는다



// InhertanceTask에서
// 사람, 학생, 직장인 객체화 후 각 메서드 출력하기

public class InheritanceTask1 {
	public class inheritanceTask {
		public static void main(String[] args) {
			PersonTask pt = new PersonTask("이규진", 23, "강남", "아이폰");
			pt.work();
			pt.sleep();
			pt.eat();
			System.out.println("");
			
			StudentTask st = new StudentTask("김사과", 18, "서초", "아이폰", "@1234");
			st.work();
			st.sleep();
			st.eat();
			System.out.println("");
			
			EmployeeTask et = new EmployeeTask("김사과", 18, "서초", "아이폰", 1000);
			et.work();
			et.sleep();
			et.eat();
		}
	}
}
