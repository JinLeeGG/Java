package interfaceTask;

public class Kim extends Developer implements GoogleMarker{
	
	public Kim() {;}
	
	public Kim(String name, String job, String language) {
		super(name, job, language);
	}
	
	@Override
	public void skills() {
		System.out.println(super.name + ": 딸꾹질 때문에 바이브 코딩 불가! 순수 하드 코딩!");
	}
	
	

}
