package castingTask;

public class Monster {
	String name;
	int hp;
	int experience;
	
	public Monster() {;}

	public Monster(String name, int hp, int experience) {
		this.name = name;
		this.hp = hp;
		this.experience = experience;
	}
	
	public void dropItem() {
		System.out.println("몬스터가 사냥당했습니다.");
		System.out.println("아이템을 떨어뜨렸습니다.");
	}
	
}
