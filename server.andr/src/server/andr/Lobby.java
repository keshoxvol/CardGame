package server.andr;

import java.util.Iterator;

import server.andr.domians.Deck;
import server.andr.domians.Player;
import server.andr.domians.characters.Characterr;

public class Lobby {
	private Player player1;
	private Player player2;
	private Iterator deck;
	
	public Lobby(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		deck = (new Deck()).getIteratorCards();
	}
	
	public void oneGive() {
		
		while(deck.hasNext()) {
			player1.addCard((Characterr) deck.next());
			player2.addCard((Characterr) deck.next());
		}
	}
	
	public void printNames() {
		System.out.println(player1.getName());
		System.out.println(player2.getName());
	}

}
