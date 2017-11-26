import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.layout.*;

public class EndScreen extends Application{
	private String titleText;
	
	public EndScreen(){
		this("Game Over!");
	}
	
	public EndScreen(String s){
		
		titleText = s;
	}
	
	
	public static void main(String[] args){
		
		launch(args);
	}
	
	@Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle(titleText);

        Text text = new Text("Text for funsies");

        BorderPane pane = new BorderPane();

        FlowPane pane2 = new FlowPane();
        pane2.getChildren().add(text);
        pane2.setAlignment(Pos.CENTER);

        pane.setCenter(pane2);

        Scene scene = new Scene(pane, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
