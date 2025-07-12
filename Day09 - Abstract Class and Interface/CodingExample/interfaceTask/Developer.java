package interfaceTask;

public class Developer {
	String name;
	String job;
	String language;

//	기본 생성자
	Developer() {;}

//	초기화 생성자 (alt + shift + o ->s)
	public Developer(String name, String job, String language) {
		this.name = name;
		this.job = job;
		this.language = language;
	}

	public void introduce() {
		System.out.println(this.name + "이(가) 사용하는 주 언어는 " + this.language +" 입니다.");
	}
	
	
	public void skills() {
		System.out.println("스킬: 키보드를 두드리는 능력이 있습니다! 샷건!");
	}
	
}
