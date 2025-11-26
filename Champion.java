package entities;

public class Champion {
	
	private String name;
	private int life;
	private int attack;
	private int armor;
	
	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public int getLife() {
		return life;
	}

	public int getAttack() {
		return attack;
	}

	public int getArmor() {
		return armor;
	}

	public void takeDamage(Champion attacker) {
		int damage = attacker.getAttack() - this.getArmor();
		
		if (damage < 1) {
			damage = 1;
		}
		
		this.life -= damage;
		
		if (this.life < 0) {
			this.life = 0;
		}
	}
	
	public String status() {
		if (getLife() == 0) {
			return getName() 
				+ ": "
				+ getLife()
				+ " de vida (morreu)";
		}
		else {
			return getName()
					+	": "
					+	getLife()
					+	" de vida";
		}
	}
}
