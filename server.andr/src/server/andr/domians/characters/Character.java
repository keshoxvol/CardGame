package server.andr.domians.characters;

public class Character {
	
	private String name;
	private int hillPoint;
	private int damage;
	
	public void Character(String name, int hillPoint, int damage) {
		this.name = name;
		this.hillPoint = hillPoint;
		this.damage = damage;
 	}
	
	public int getHillPoint() {
		return hillPoint;
	}
}
