
//*******************************************************
// AUTHORS: Andrew Antes, Cameron Troy, 
//          Steven Foust, and Gabrielle Dubbs
// PROGRAM: LitDictionary.java
// DESCRIPTION: Creates a new HashMap and adds entries. 
//              It also returns a random entry
//*******************************************************

import java.util.HashMap;

/**
 *
 * Class LitDictionary extends HashMap and creates a dictionary of names that
 * are chosen at random
 */
public class LitDictionary extends HashMap {

	private HashMap<Integer, String> dictionary;

	/**
	 * Constructor creates and fills a dictionary full of classic novel titles
	 */
	public LitDictionary() {

		dictionary = new HashMap<>();

		dictionary.put(0, "A Tale of Two Cities");
		dictionary.put(1, "The Great Gatsby");
		dictionary.put(2, "Oliver Twist");
		dictionary.put(3, "To Kill a Mockingbird");
		dictionary.put(4, "East of Eden");
		dictionary.put(5, "Grapes of Wrath");
		dictionary.put(6, "Brave New World");
		dictionary.put(7, "Middlemarch");
		dictionary.put(8, "Jane Eyre");
		dictionary.put(9, "Sense and Sensibility");
		dictionary.put(10, "Nineteen Eighty Four");
		dictionary.put(11, "The Catcher in the Rye");
		dictionary.put(12, "Of Mice and Men");
		dictionary.put(13, "Don Quixote");
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
		dictionary.put(26, "Wuthering Heights");
		dictionary.put(28, "Little Women");
		dictionary.put(29, "Animal Farm");
		dictionary.put(30, "Great Expectations");
		dictionary.put(31, "Moby Dick");
		dictionary.put(32, "Persuasion");
		dictionary.put(33, "Mrs Dalloway");
		dictionary.put(34, "Count of Monte Cristo");
		dictionary.put(35, "Dracula");
		dictionary.put(36, "The Hobbit");
		dictionary.put(37, "Les Miserables");
		dictionary.put(38, "Romeo and Juliet");
		dictionary.put(39, "The Old Man and the Sea");
		dictionary.put(40, "Treasure Island");
		dictionary.put(41, "Northanger Abbey");
		dictionary.put(42, "Adventures of Tom Sawyer");
		dictionary.put(43, "Heart of Darkness");
		dictionary.put(44, "Mansfield Park");
		dictionary.put(46, "East of Eden");
		dictionary.put(47, "The Three Musketeers");
		dictionary.put(48, "Macbeth");
		dictionary.put(49, "The Diary of a Young Girl");
		dictionary.put(50, "The Handmaids Tale");

	} // End of ctor()

	/**
	 * getTitle() method returns a name from the dictionary created
	 * 
	 * @return random name
	 */
	public String getTitle() {
		return dictionary.get((int) (Math.random() * dictionary.size()));
	} // End of getTitle() method block
} // End of class block