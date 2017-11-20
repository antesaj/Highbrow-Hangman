/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playhangman;
import java.util.HashMap;

public class LitDictionary extends HashMap {

	private HashMap<Integer, String> dictionary;
	
	/*
	 * Constructor creates and fills a dictionary full
	 * of classic novel titles
	 */
	
	public LitDictionary() {
		
		dictionary = new HashMap<>();
		
		//TODO: add more entries
		dictionary.put(0, "A Tale of Two Cities");
		dictionary.put(1, "The Great Gatsby");
		dictionary.put(2, "Oliver Twist");
		dictionary.put(3, "To Kill a Mockingbird");
		dictionary.put(4, "East of Eden");
		dictionary.put(5, "Grapes of Wrath");
		dictionary.put(6, "Brave New World");
		dictionary.put(7, "Fahrenheit 451");
		dictionary.put(8, "Jane Eyre");
		dictionary.put(9, "Sense and Sensibility");
		dictionary.put(10, "Nineteen Eighty Four");
		dictionary.put(11, "The Catcher in the Rye");
		dictionary.put(12, "Of Mice and Men");
		dictionary.put(13, "The Count of Monte Cristo");
		dictionary.put(14, "Frankenstein");
		dictionary.put(15, "Lord of the Flies");
		dictionary.put(16, "The Scarlet Letter");
		dictionary.put(17, "War and Peace");
		dictionary.put(18, "Crime and Punishment");
		dictionary.put(19, "Gone with the Wind");
		dictionary.put(20, "Lolita");
		dictionary.put(21, "Les Miserables");
		dictionary.put(22, "A Christmas Carol");
		dictionary.put(23, "Gullivers Travels");
		dictionary.put(24, "Don Quixote");
		dictionary.put(25, "Pride and Prejudice");
		
	}
	
	/*
	 * Returns a random dictionary entry
	 */
	
	public String getTitle() {
		return dictionary.get((int)(Math.random() * dictionary.size()));
	}
	
}