package server.andr.domians;

import java.util.ArrayList;
import java.util.List;

import server.andr.domians.characters.CharacterDamager;
import server.andr.domians.characters.CharacterHiller;
import server.andr.domians.characters.CharacterTank;
import server.andr.domians.characters.Characterr;

public class Deck {
	
	private List<Characterr> characters = new ArrayList<Characterr>();
	
	public void Deck() {
		
		characters.add(new Characterr("Basskow", 1));
		characters.add(new Characterr("Booker", 2));
		characters.add(new Characterr("Mykka", 1));
		characters.add(new Characterr("Wenz", 2));
		characters.add(new Characterr("Markul", 2));
		
		characters.add(new CharacterHiller("Verbee"));
		characters.add(new CharacterHiller("Korj"));
		characters.add(new CharacterHiller("Macan"));
		characters.add(new CharacterHiller("Noize"));
		characters.add(new CharacterHiller("Splin"));
		
		characters.add(new CharacterDamager("Ghostmane"));
		characters.add(new CharacterDamager("Hleb"));
		characters.add(new CharacterDamager("Rammstein"));
		characters.add(new CharacterDamager("Jubilee"));
		characters.add(new CharacterDamager("Letow"));
		
		characters.add(new CharacterTank("Digga"));
		characters.add(new CharacterTank("LitleBig"));
		characters.add(new CharacterTank("Haski"));
		characters.add(new CharacterTank("Oxxy"));
		characters.add(new CharacterTank("Atl"));
		
	}

}
