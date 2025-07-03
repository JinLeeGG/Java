package castingTask;

public class Human extends Monster{

	public Human() {;}
	public Human(String name, int hp, int experience) {
		super(name, hp, experience);
	}

	@Override
	public void dropItem() {
		System.out.println("갑옷을 얻습니다.");
	}
}
