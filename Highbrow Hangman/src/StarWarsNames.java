
//*******************************************************
// AUTHORS: Andrew Antes, Cameron Troy, 
//          Steven Foust, and Gabrielle Dubbs
// PROGRAM: StarWarsNames.java
// DESCRIPTION: Creates a new HashMap and adds entries. 
//              It also returns a random entry
//*******************************************************

import java.util.HashMap;

/**
 *
 * Class StarWarsNames extends HashMap and creates a dictionary of names that
 * are chosen at random
 */
public class StarWarsNames extends HashMap {

	private HashMap<Integer, String> dictionary;

	/**
	 * Ctor() creates new hashmap and adds names to it.
	 */
	public StarWarsNames() {

		dictionary = new HashMap<>();
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
		dictionary.put(26, "Raymus Antilles");
		dictionary.put(27, "Obi Wan Kenobi");
		dictionary.put(28, "Dr Evazan");
		dictionary.put(29, "BB Eight");
		dictionary.put(30, "Commander Bly");
		dictionary.put(31, "Borvo the Hutt");
		dictionary.put(32, "C threePO");
		dictionary.put(33, "Supreme Leader Snoke");
		dictionary.put(34, "Rush Clovis");
		dictionary.put(35, "Lieutenant Connix");
		dictionary.put(36, "Captain Colton");
		dictionary.put(37, "Captain Rex");
		dictionary.put(38, "Biggs Darklighter");
		dictionary.put(39, "Dengar");
		dictionary.put(40, "Jan Dodonna");
		dictionary.put(41, "Rey");
		dictionary.put(42, "Lyra Erso");
		dictionary.put(43, "Jyn Erso");
		dictionary.put(44, "Jango Fett");
		dictionary.put(45, "Saw Gerrera");
		dictionary.put(46, "Greedo");
		dictionary.put(47, "Wes Janson");
		dictionary.put(48, "Owen Lars");
		dictionary.put(49, "Beru Lars");
		dictionary.put(50, "Luke Skywalker");

	} // End of ctor()

	/**
	 * getName() method returns a name from the dictionary created
	 * 
	 * @return random name
	 */
	public String getName() {
		return dictionary.get((int) (Math.random() * dictionary.size()));
	} // End of getName() method

} // End of class block