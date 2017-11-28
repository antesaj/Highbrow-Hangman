
//*******************************************************
// AUTHORS: Andrew Antes, Cameron Troy, 
//          Steven Foust, and Gabrielle Dubbs
// PROGRAM: HangmanSound.java
// DESCRIPTION: Creates new a new Media and MediaPlayer.
// 				This adds the sound to the Hangman game.
//*******************************************************
import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class HangmanSound {

	private String soundFile;
	private Media inGameSound;
	private MediaPlayer gameSoundPlayer;

	public HangmanSound(String pFile) {
		soundFile = pFile;
	} // End of ctor() block

	public void play() {
		inGameSound = new Media(new File(soundFile).toURI().toString());
		gameSoundPlayer = new MediaPlayer(inGameSound);
		gameSoundPlayer.setCycleCount(MediaPlayer.INDEFINITE);
		gameSoundPlayer.play();
	} // End of method block

	public void playOnce() {
		inGameSound = new Media(new File(soundFile).toURI().toString());
		gameSoundPlayer = new MediaPlayer(inGameSound);
		gameSoundPlayer.play();
	}// End of method block

	public void stop() {
		gameSoundPlayer.stop();
	} // End of method block

} // End of class block
