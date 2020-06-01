package server.andr;

import java.util.Iterator;

import server.andr.domians.Deck;
import server.andr.domians.characters.Characterr;

public class Main {

	public static void main(String[] args) {
		System.out.println("MyGame");
		
		Deck deck = new Deck();
		
		Iterator iterator = (deck.getCharacters().iterator());
		
		while(iterator.hasNext()) {
			Characterr characterr = (Characterr) iterator.next();
			System.out.println(characterr.getHillPoint());
		}
	}
}
