package interfaceTest;

// interface 는 implements를 이용해서 Pet의 method를 가져온다.
public class Gorilla implements Pet{
	
	// 메서드 재정의 
	@Override
	public void sitDown() {
		System.out.println("자리에 앉는다");
		
	}

	@Override
	public void waitNow() {
		System.out.println("기다린다.");
	
	}

	@Override
	public void poop() {
		System.out.println("똥을 싼다.");
		
	}

	
	
}
