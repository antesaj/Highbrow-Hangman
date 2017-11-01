
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



public class PlayHangman extends Application {
	
	private static String TITLE = "Highbrow Hangman 1.0";

	public static void main(String[] args) {
		
			launch(args);
		
	}
	
	@Override
	public void start(Stage primaryStage) {
		
		primaryStage.setTitle(TITLE);
		Image backgroundImage = new Image("background_image.jpg");
		BackgroundImage bg = new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, new BackgroundSize(800,800,true,true,true,true));
		
		
		BorderPane pane = new BorderPane();
		pane.setBackground(new Background(bg));
		FlowPane topPane = new FlowPane(Orientation.HORIZONTAL);
		FlowPane centerPane = new FlowPane();
		centerPane.setAlignment(Pos.CENTER);
		
		Button newGame = new Button("New Game");
		newGame.setMinWidth(100);
		
		Button exitButton = new Button("Exit");
		// EXIT BUTTON: CLOSES APPLICATION
		exitButton.addEventHandler(MouseEvent.MOUSE_CLICKED,
				new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				primaryStage.close();
			}
		});
		exitButton.setMinWidth(100);
		
		centerPane.getChildren().add(newGame);
		centerPane.getChildren().add(exitButton);
		centerPane.setHgap(10);
		pane.setCenter(centerPane);
		
		Text titleText = new Text(TITLE);
		// TODO: Extrabold isn't actually doing anything.
		titleText.setFont(Font.font("Vivaldi", FontWeight.EXTRA_BOLD, 60));
		titleText.setEffect(new DropShadow(100, Color.BLACK));
		titleText.setFill(Color.WHITE);
		topPane.setAlignment(Pos.CENTER);
		topPane.getChildren().addAll(titleText);
		pane.setTop(topPane);
		
		Scene scene = new Scene(pane, 800, 800);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
}
