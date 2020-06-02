package server.andr;

import java.util.Iterator;

import server.andr.domians.Deck;
import server.andr.domians.Player;
import server.andr.domians.characters.Characterr;

public class Main {

	public static void main(String[] args) {
		Lobby lobby1 = new Lobby(new Player("kek"), new Player("shmek"));
		lobby1.oneGive();
	}
}
