
import java.io.InputStream;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;



public class PlayHangman extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		
		primaryStage.setTitle("Highbrow Hangman");
		Image backgroundImage = new Image("background_image.jpg");
		ImagePattern background = new ImagePattern(backgroundImage);
		
		BorderPane pane = new BorderPane();
		pane.setId("pane");
		Scene scene = new Scene(pane, 613, 613);
		scene.setFill(background);
		FlowPane topPane = new FlowPane(Orientation.HORIZONTAL);
		
		Text titleText = new Text("Highbrow Hangman 1.0");
		titleText.setFont(Font.font("Vivaldi", 60));
		titleText.setFill(Color.WHITE);
		topPane.setAlignment(Pos.CENTER);
		topPane.getChildren().add(titleText);
		pane.setTop(topPane);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
}
