package server.andr.domians;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import server.andr.domians.characters.Characterr;

public class Deck {
	
	private List<Characterr> cards = new ArrayList<Characterr>();
	
	public Deck() {
		cards.add(new Characterr("Basskow"));
		cards.add(new Characterr("Booker"));
	} 
	
	public int getSizeDeck() {
		return cards.size();
	}
	
	public List getListCards() {
		return cards;
	}
	
	public Iterator getIteratorCards() {
		return cards.iterator();
	}

}
