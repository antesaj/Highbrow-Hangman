
import javafx.application.Application;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.layout.*;

public class Game {
	
	private Stage gameStage;

	public Game() {
		
		this.init();
		this.play();
		
	}
	
	public void play() {
		
	}
	
	public void init() {
		gameStage = new Stage();
		gameStage.setTitle("Highbrow Hangman 1.0");
		
		Image backgroundImage = new Image("background_image.jpg");
		BackgroundImage bg = new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, new BackgroundSize(800,800,true,true,true,true));
		
		BorderPane gamePane = new BorderPane();
		gamePane.setBackground(new Background(bg));
		
		GridPane gameBottom = new GridPane();
	
		
		
		
		
		gamePane.setBottom(gameBottom);
		
		Scene gameScene = new Scene(gamePane, 800, 800);
		gameStage.setScene(gameScene);
		gameStage.show();
	}
	
}
