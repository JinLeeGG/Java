package castingTask;

public class Character {
	String name;
	String job;
	int level;
	
	public Character() {;}

	public Character(String name, String job) {
		this.name = name;
		this.job = job;
		this.level = 1;
	}
	
	public void hunt(Monster monster) {
		if(monster instanceof Human) {
			Human human = (Human)monster;
			human.dropItem();
		}else if(monster instanceof Fairy) {
			Fairy fairy = (Fairy)monster;
			fairy.dropItem();
		}else if(monster instanceof Orc) {
			Orc orc = (Orc)monster;
			orc.dropItem();
		}
	}
	
	
}
