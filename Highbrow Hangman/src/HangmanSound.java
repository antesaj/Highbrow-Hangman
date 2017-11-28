
import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class HangmanSound {

	private String soundFile;
	private Media inGameSound;
	private MediaPlayer gameSoundPlayer;
	
	public HangmanSound(String pFile) {
		soundFile = pFile;
	}
	
	public void play() {
		inGameSound = new Media(new File(soundFile).toURI().toString());
		gameSoundPlayer = new MediaPlayer(inGameSound);
		gameSoundPlayer.setCycleCount(MediaPlayer.INDEFINITE);
		gameSoundPlayer.play();
	}
	
	public void playOnce() {
		inGameSound = new Media(new File(soundFile).toURI().toString());
		gameSoundPlayer = new MediaPlayer(inGameSound);
		gameSoundPlayer.play();
	}
	
	public void stop() {
		gameSoundPlayer.stop();
	}
	
}
