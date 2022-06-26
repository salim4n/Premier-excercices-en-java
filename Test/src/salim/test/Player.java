package salim.test;

public class Player {

	private String name;
	private int health;
	private int attack;
	
	public Player(String name, int health, int attack) {
		this.name = name;
		this.health = health;
		this.attack = attack;
	}
	
	public void damage(int damage) {
		this.health -= damage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
}
