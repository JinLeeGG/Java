package interfaceTask;

public class Lee extends Developer implements GoogleMarker{
	
	public Lee() {;}
	
	public Lee(String name, String job, String language) {
		super(name, job, language);
	}
	
	@Override
	public void skills() {
		System.out.println(super.name + ": 목소리로 코딩하는 바이브 코딩의 소유자!");
	}
	
}
