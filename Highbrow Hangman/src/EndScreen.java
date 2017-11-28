
//*******************************************************
// AUTHORS: Andrew Antes, Cameron Troy, 
//          Steven Foust, and Gabrielle Dubbs
// PROGRAM: EndScreen.java
// DESCRIPTION: Creates a new scene that shows if player 
//				Wins or Loses and has a button to exit the window.
//              
//*******************************************************

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * 
 * Class EndScreen shows a window with either win or lose after the game is
 * over. It also has an exit button.
 *
 */
public class EndScreen extends Application {
	private String titleText;

	// ctor
	public EndScreen() {
		this("Game Over");
	}

	// ctor
	public EndScreen(String s) {
		titleText = s;
	}

	/**
	 * start() method creates new stage
	 */
	@Override
	public void start(Stage primaryStage) {

		primaryStage.setTitle("Game Over");

		// Create new Text for lose or win
		Text text = new Text(titleText);

		// Create FlowPane
		FlowPane centerPane = new FlowPane();
		centerPane.setAlignment(Pos.CENTER);

		// Sets font, effect, and fill for win or lose text
		text.setFont(Font.font("Helvetica", FontWeight.BOLD, 60));
		text.setEffect(new DropShadow(100, Color.BLACK));
		text.setFill(Color.WHITE);
		centerPane.setAlignment(Pos.CENTER);
		centerPane.getChildren().addAll(text);

		// Creates new Image and adds background image
		Image backgroundImage = new Image("background_image.jpg");
		BackgroundImage bg = new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
				new BackgroundSize(800, 800, true, true, true, true));

		BorderPane pane = new BorderPane();
		pane.setBackground(new Background(bg));

		// Create new VBox to add text and button to
		// VBox will allow the text and button to be centered
		VBox pane2 = new VBox();

		// Create and style the exit button
		Button exitButton = new Button("Exit");
		exitButton.setStyle("-fx-background-color: \r\n"
				+ "        linear-gradient(#686868 0%, #232723 25%, #373837 75%, #757575 100%),\r\n"
				+ "        linear-gradient(#020b02, #3a3a3a),\r\n"
				+ "        linear-gradient(#b9b9b9 0%, #c2c2c2 20%, #afafaf 80%, #c8c8c8 100%),\r\n"
				+ "        linear-gradient(#f5f5f5 0%, #dbdbdb 50%, #cacaca 51%, #d7d7d7 100%);\r\n"
				+ "    -fx-background-insets: 0,1,4,5;\r\n" + "    -fx-background-radius: 9,8,5,4;\r\n"
				+ "    -fx-padding: 15 30 15 30;\r\n" + "    -fx-font-family: \"Helvetica\";\r\n"
				+ "    -fx-font-size: 18px;\r\n" + "    -fx-font-weight: bold;\r\n" + "    -fx-text-fill: #333333;\r\n"
				+ "    -fx-effect: dropshadow( three-pass-box , rgba(255,255,255,0.2) , 1, 0.0 , 0 , 1);");

		// EXIT BUTTON: Closes Application
		exitButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

			/**
			 * handle() method closes the stage and Overrides EventHandler
			 */
			@Override
			public void handle(MouseEvent e) {
				primaryStage.close();
			}

		});
		exitButton.setMinWidth(150);

		// adds text and exit button to the pane and aligns them
		pane2.getChildren().add(text);
		pane2.setAlignment(Pos.CENTER);
		pane2.getChildren().add(exitButton);
		pane2.setAlignment(Pos.CENTER);
		pane.setCenter(pane2);

		// Creates new Scene and shows the stage
		Scene scene = new Scene(pane, 800, 800);
		primaryStage.setScene(scene);
		primaryStage.show();

	} // End of Start method

} // End of EndScreen class
