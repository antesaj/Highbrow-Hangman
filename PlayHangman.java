package playhangman;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.layout.*;
import javafx.scene.control.ChoiceBox;
import javafx.collections.FXCollections;
import javafx.beans.value.ObservableValue;
import javafx.beans.value.ChangeListener;

public class PlayHangman extends Application {
	
	private static String TITLE = "Highbrow Hangman 1.0";
        public static String choice;

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
		newGame.setStyle("-fx-background-color: \r\n" + 
				"        linear-gradient(#686868 0%, #232723 25%, #373837 75%, #757575 100%),\r\n" + 
				"        linear-gradient(#020b02, #3a3a3a),\r\n" + 
				"        linear-gradient(#b9b9b9 0%, #c2c2c2 20%, #afafaf 80%, #c8c8c8 100%),\r\n" + 
				"        linear-gradient(#f5f5f5 0%, #dbdbdb 50%, #cacaca 51%, #d7d7d7 100%);\r\n" + 
				"    -fx-background-insets: 0,1,4,5;\r\n" + 
				"    -fx-background-radius: 9,8,5,4;\r\n" + 
				"    -fx-padding: 15 30 15 30;\r\n" + 
				"    -fx-font-family: \"Helvetica\";\r\n" + 
				"    -fx-font-size: 18px;\r\n" + 
				"    -fx-font-weight: bold;\r\n" + 
				"    -fx-text-fill: #333333;\r\n" + 
				"    -fx-effect: dropshadow( three-pass-box , rgba(255,255,255,0.2) , 1, 0.0 , 0 , 1);");
		
		// NEW GAME BUTTON: Begins new instance of hangman
		newGame.addEventHandler(MouseEvent.MOUSE_CLICKED,
				new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
                                if(choice != null){
				Game game = new Game(choice);
                                }
			}
		});
		newGame.setMinWidth(150);
                
                
                final String[] theme = new String[]{null,"Classic Novel Titles",
                        "Star Wars Names"};
                ChoiceBox<String> choiceBox = new ChoiceBox<>(FXCollections.
                        observableArrayList("Choose a Theme","Classic Novel Titles",
                        "Star Wars Names"));
                
                // Sets Default Values
                choiceBox.setValue("Choose a Theme");
		
		choiceBox.setStyle("-fx-background-color: \r\n" + 
				"        linear-gradient(#686868 0%, #232723 25%, #373837 75%, #757575 100%),\r\n" + 
				"        linear-gradient(#020b02, #3a3a3a),\r\n" + 
				"        linear-gradient(#b9b9b9 0%, #c2c2c2 20%, #afafaf 80%, #c8c8c8 100%),\r\n" + 
				"        linear-gradient(#f5f5f5 0%, #dbdbdb 50%, #cacaca 51%, #d7d7d7 100%);\r\n" + 
				"    -fx-background-insets: 0,1,4,5;\r\n" + 
				"    -fx-background-radius: 9,8,5,4;\r\n" + 
				"    -fx-padding: 15 30 15 30;\r\n" + 
				"    -fx-font-family: \"Helvetica\";\r\n" + 
				"    -fx-font-size: 18px;\r\n" + 
				"    -fx-font-weight: bold;\r\n" + 
				"    -fx-text-fill: #333333;\r\n" + 
				"    -fx-effect: dropshadow( three-pass-box , rgba(255,255,255,0.2) , 1, 0.0 , 0 , 1);");
		
		// NEW GAME BUTTON: Begins new instance of hangman
		choiceBox.getSelectionModel().selectedIndexProperty()
                        .addListener(new ChangeListener<Number>(){
                    public void changed(ObservableValue ov, Number value, Number new_value){
                    
                        choice = theme[new_value.intValue()];
                    }
                });
		choiceBox.setMinWidth(150);  
                
		
		Button exitButton = new Button("Exit");
		exitButton.setStyle("-fx-background-color: \r\n" + 
				"        linear-gradient(#686868 0%, #232723 25%, #373837 75%, #757575 100%),\r\n" + 
				"        linear-gradient(#020b02, #3a3a3a),\r\n" + 
				"        linear-gradient(#b9b9b9 0%, #c2c2c2 20%, #afafaf 80%, #c8c8c8 100%),\r\n" + 
				"        linear-gradient(#f5f5f5 0%, #dbdbdb 50%, #cacaca 51%, #d7d7d7 100%);\r\n" + 
				"    -fx-background-insets: 0,1,4,5;\r\n" + 
				"    -fx-background-radius: 9,8,5,4;\r\n" + 
				"    -fx-padding: 15 30 15 30;\r\n" + 
				"    -fx-font-family: \"Helvetica\";\r\n" + 
				"    -fx-font-size: 18px;\r\n" + 
				"    -fx-font-weight: bold;\r\n" + 
				"    -fx-text-fill: #333333;\r\n" + 
				"    -fx-effect: dropshadow( three-pass-box , rgba(255,255,255,0.2) , 1, 0.0 , 0 , 1);");
		
		// EXIT BUTTON: Closes Application
		exitButton.addEventHandler(MouseEvent.MOUSE_CLICKED,
				new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				primaryStage.close();
			}
		});
		exitButton.setMinWidth(150);
		
		centerPane.getChildren().addAll(newGame, choiceBox, exitButton);
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