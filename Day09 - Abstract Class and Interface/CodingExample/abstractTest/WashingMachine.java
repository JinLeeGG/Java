package abstractTest;

public class WashingMachine extends Electronics{

	@Override
	public void on() {
		System.out.println("음성으로 킨다");
	}

	@Override
	public void off() {
		System.out.println("음성으로 끈다");
	}
	
	
	
}
