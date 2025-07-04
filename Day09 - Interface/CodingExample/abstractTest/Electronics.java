package abstractTest;


// 추상화 클래스는 abstract 를 붙인다.
public abstract class Electronics {
	
	// 재정의를 할때 구현을 해야함으로 구현부분이 없다.
	public abstract void on();
	public abstract void off();
	
	public void safe() {
		System.out.println("안전 장치");
	}
		
}
