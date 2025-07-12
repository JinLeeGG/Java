package interfaceTest;


// 인터페이스는 강제성이 강하기 때문에
// 강제성을 없애주기 위해서 어댑터를 사용한다.

public abstract class PetAdapter implements Pet {
	
	// Tiger 는 waitNow가 필요없기때문에 인터페이스를 사용할 수 없다.
	// 따라서 상속으로 강제성을 없애주기위해서 어탭터를 사용한다. 
	
	// 여기다가 waitNow를 선언해주면 상속시 더이상 강제성을 띄지 못하기 때문에 선언한다.
	
	@Override
	public void waitNow() {;}
	
}
