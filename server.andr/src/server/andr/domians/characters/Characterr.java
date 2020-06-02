package server.andr.domians.characters;

public class Characterr {
	
	protected String name;
	protected int hillPoint = 20;
	protected int damage = 1;
	protected int recuperation = 0;
	
	public Characterr(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHillPoint() {
		return hillPoint;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public int getRecuperation() {
		return recuperation;
	}
}
