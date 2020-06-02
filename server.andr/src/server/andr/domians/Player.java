package server.andr.domians;

import java.util.List;

import server.andr.domians.characters.Characterr;

public class Player {
	private String name;
	private int hillPoint;
	private List<Characterr> hand;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void addCard(Characterr characterr) {
		hand.add(characterr);
	}
	
	public String getName() {
		return name;
	}
}
