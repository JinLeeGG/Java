package inheritanceTask;


//EmployeeTask
//비상금
//각 메서드 출력
//work 하루 종일 일을 한다
//sleep 잠을 설친다
//eat 야식을 먹는다

public class EmployeeTask extends PersonTask {
	int cash;
	
	public EmployeeTask() {;}
	
	public EmployeeTask(String name, int age, String address, String phone, int cash) {
		super(name, age, address, phone);
		this.cash = cash;
	}
	
	@Override
	public void work(){
		System.out.println("하루 종일 일을 한다.");
	}
	
	@Override
	public void sleep() {
		System.out.println("잠을 설친다.");
	}
	
	@Override
	public void eat() {
		System.out.println("야식을 먹는다.");
	}
}
