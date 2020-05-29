package server.andr.domians.characters;

public class Characterr {
	
	protected String name;
	protected int hillPoint = 20;
	protected int damage;
	protected int recuperation = 0;

	public Characterr(String name, int hillPoint, int damage) {
		this.name = name;
		this.hillPoint = hillPoint;
		this.damage = damage;
 	}
	
	public Characterr(String name, int damage) {
		this.name = name;
		this.damage = damage;
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
