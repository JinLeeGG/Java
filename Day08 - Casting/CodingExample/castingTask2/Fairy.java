package castingTask;

public class Fairy extends Monster{
	
	public Fairy() {;}
	
	public Fairy(String name, int hp, int experience) {
		super(name, hp, experience);
	}
	
	@Override
	public void dropItem() {
		System.out.println("날개를 얻습니다.");
	}
}
