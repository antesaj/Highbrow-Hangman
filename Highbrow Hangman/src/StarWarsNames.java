import java.util.HashMap;

/**
 *
 * @author Steven
 */
public class StarWarsNames extends HashMap {
    
	private HashMap<Integer, String> dictionary;
	
	/*
	 * Constructor creates and fills a dictionary full
	 * of classic novel titles
	 */
	
	public StarWarsNames() {
		
		dictionary = new HashMap<>();
		
		//TODO: add more entries
		dictionary.put(0, "Admiral Ackbar");
		dictionary.put(1, "Cassian Andor");
		dictionary.put(2, "Wedge Antilles");
		dictionary.put(3, "Cad Bane");
		dictionary.put(4, "Darth Bane");
		dictionary.put(5, "Jar Jar Binks");
		dictionary.put(6, "Bossk");
		dictionary.put(7, "Ezra Bridger");
		dictionary.put(8, "Lando Calrissian");
		dictionary.put(9, "Chewbacca");
		dictionary.put(10, "Chief Chirpa");
		dictionary.put(11, "Poe Dameron");
		dictionary.put(12, "Mace Windu");
		dictionary.put(13, "Anakin Skywalker");
		dictionary.put(14, "Darth Vader");
		dictionary.put(15, "Darth Plagueis");
		dictionary.put(16, "Count Dooku");
		dictionary.put(17, "Galen Erso");
		dictionary.put(18, "Boba Fett");
		dictionary.put(19, "Finn");
		dictionary.put(20, "General Grievous");
		dictionary.put(21, "Chirrut Imwe");
		dictionary.put(22, "Darth Revan");
		dictionary.put(23, "Savage Opress");
		dictionary.put(24, "Kylo Ren");
		dictionary.put(25, "Captain Phasma");
		
	}
	
	/*
	 * Returns a random dictionary entry
	 */
	
	public String getTitle() {
		return dictionary.get((int)(Math.random() * dictionary.size()));
	}
	
}