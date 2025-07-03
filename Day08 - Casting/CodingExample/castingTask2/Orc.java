package castingTask;

public class Orc extends Monster{
	
	public Orc() {;}
	public Orc(String name, int hp, int experience) {
		super(name, hp, experience);
	}
	
	@Override
	public void dropItem() {
		System.out.println("가죽을 얻습니다.");
	}
}
