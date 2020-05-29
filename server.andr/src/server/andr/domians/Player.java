package server.andr.domians;

public class Player {
	private String name;
	private int hillPoint = 20;
	
	public void Player(String name) {
		this.name = name;
	}
	
	public int getHillPoint() {
		return hillPoint;
	} 
}
