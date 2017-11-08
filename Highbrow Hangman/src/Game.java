
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
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.layout.*;

public class Game {
	
	private Stage gameStage;
	
	private Circle head;
	private Line body, leftArm, rightArm, leftLeg, rightLeg;
	
	private Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;

	public Game() {
		
		this.init();
		this.play();
		
	}
	
	public void play() {
		// TODO: implement - should contain gameplay logic. May need more methods.
		// TODO: Individual class for the phrase. Below is starter code for this class, remove from play() method.
		LitDictionary dictionary = new LitDictionary("novels");
		String phrase = dictionary.getTitle().toUpperCase();
		String[] array = phrase.split(" ", 5);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public void init() {
		gameStage = new Stage();
		gameStage.setTitle("Highbrow Hangman 1.0");
		
		// Background image, set background
		Image backgroundImage = new Image("background_image.jpg");
		BackgroundImage bg = new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT,
				BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, new BackgroundSize(800,800,true,true,true,true));
		
		BorderPane gamePane = new BorderPane();
		gamePane.setBackground(new Background(bg));
		
		// Set up letter boxes on the bottom
		TilePane letters = new TilePane();
		letters.setPrefColumns(13);
		letters.setPrefRows(3);
		letters.setHgap(5);
		letters.setVgap(5);
		letters.setAlignment(Pos.CENTER);
		
		a = new Button("A"); setButtonStyle(a);
		b = new Button("B"); setButtonStyle(b);
		c = new Button("C"); setButtonStyle(c);
		d = new Button("D"); setButtonStyle(d);
		e = new Button("E"); setButtonStyle(e);
		f = new Button("F"); setButtonStyle(f);
		g = new Button("G"); setButtonStyle(g);
		h = new Button("H"); setButtonStyle(h);
		i = new Button("I"); setButtonStyle(i);
		j = new Button("J"); setButtonStyle(j);
		k = new Button("K"); setButtonStyle(k);
		l = new Button("L"); setButtonStyle(l);
		m = new Button("M"); setButtonStyle(m);
		n = new Button("N"); setButtonStyle(n);
		o = new Button("O"); setButtonStyle(o);
		p = new Button("P"); setButtonStyle(p);
		q = new Button("Q"); setButtonStyle(q);
		r = new Button("R"); setButtonStyle(r);
		s = new Button("S"); setButtonStyle(s);
		t = new Button("T"); setButtonStyle(t);
		u = new Button("U"); setButtonStyle(u);
		v = new Button("V"); setButtonStyle(v);
		w = new Button("W"); setButtonStyle(w);
		x = new Button("X"); setButtonStyle(x);
		y = new Button("Y"); setButtonStyle(y);
		z = new Button("Z"); setButtonStyle(z);
		
		
		letters.getChildren().addAll(a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z);
		gamePane.setBottom(letters);
		
		// Set up area for phrase to show
		//TilePane phrase = new TilePane();
		//phrase.setAlignment(Pos.CENTER);
		//phrase.getChildren().add(new Text("___ ___ ___ ___ ___ ___ ___"));
		//gamePane.setLeft(phrase);
		
		// Set up the pane for the hangman body
		Pane gallowPane = new Pane();
		
		// Head
		head = new Circle(410,340,30);
		gallowPane.getChildren().add(head);
		head.setVisible(true);
		
		// Body
		body = new Line(410, 400, 410, 550);
		body.setStrokeWidth(15);
		gallowPane.getChildren().add(body);
		body.setVisible(true);
		
		//Left Arm
		leftArm = new Line(410, 390, 345, 450);
		leftArm.setStrokeWidth(15);
		gallowPane.getChildren().add(leftArm);
		leftArm.setVisible(true);
		
		//Right Arm
		rightArm = new Line(410, 390, 475, 450);
		rightArm.setStrokeWidth(15);
		gallowPane.getChildren().add(rightArm);
		rightArm.setVisible(true);
		
		//Left Leg
		leftLeg = new Line(410, 550, 385, 675);
		leftLeg.setStrokeWidth(15);
		gallowPane.getChildren().add(leftLeg);
		leftLeg.setVisible(true);
		
		//Right Leg
		rightLeg = new Line(410, 550, 435, 675);
		rightLeg.setStrokeWidth(15);
		gallowPane.getChildren().add(rightLeg);
		rightLeg.setVisible(true);
		
		gamePane.setCenter(gallowPane);
		
		Scene gameScene = new Scene(gamePane, 800, 800);
		gameStage.setScene(gameScene);
		gameStage.show();
	}
	
	// Styling for the letters at the bottom of the screen.
	
	public static void setButtonStyle(Button x) {
		x.setMinHeight(56);
		x.setMinWidth(56);
		x.setStyle("-fx-padding: 8 15 15 15;\r\n" + 
				"    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\r\n" + 
				"    -fx-background-radius: 8;\r\n" + 
				"    -fx-background-color: \r\n" + 
				"        linear-gradient(from 0% 93% to 0% 100%, #a34313 0%, #903b12 100%),\r\n" + 
				"        #9d4024,\r\n" + 
				"        #d86e3a,\r\n" + 
				"        radial-gradient(center 50% 50%, radius 100%, #d86e3a, #c54e2c);\r\n" + 
				"    -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.75) , 4,0,0,1 );\r\n" + 
				"    -fx-font-weight: bold;\r\n" + 
				"    -fx-font-size: 20px;");
		
		x.addEventHandler(MouseEvent.MOUSE_ENTERED_TARGET,
				new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				x.setStyle("-fx-background-color: \r\n" + 
						"        linear-gradient(from 0% 93% to 0% 100%, #a34313 0%, #903b12 100%),\r\n" + 
						"        #9d4024,\r\n" + 
						"        #d86e3a,\r\n" + 
						"        radial-gradient(center 50% 50%, radius 100%, #ea7f4b, #c54e2c);");
				}
			});
		
		x.addEventHandler(MouseEvent.MOUSE_EXITED_TARGET,
				new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				x.setStyle("-fx-padding: 8 15 15 15;\r\n" + 
						"    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;\r\n" + 
						"    -fx-background-radius: 8;\r\n" + 
						"    -fx-background-color: \r\n" + 
						"        linear-gradient(from 0% 93% to 0% 100%, #a34313 0%, #903b12 100%),\r\n" + 
						"        #9d4024,\r\n" + 
						"        #d86e3a,\r\n" + 
						"        radial-gradient(center 50% 50%, radius 100%, #d86e3a, #c54e2c);\r\n" + 
						"    -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.75) , 4,0,0,1 );\r\n" + 
						"    -fx-font-weight: bold;\r\n" + 
						"    -fx-font-size: 20px;");
				}
			});
		
	}
	
	
	// Providing the mechanisms to display body parts
	// for wrong answers. This functionality will be
	// in the play() method.
	
	public void showHead() {
		head.setVisible(true);
	}
	
	public void showBody() {
		body.setVisible(true);
	}
	
	public void showLeftArm() {
		leftArm.setVisible(true);
	}
	
	public void showRightArm() {
		rightArm.setVisible(true);
	}
	
	public void showLeftLeg() {
		leftLeg.setVisible(true);
	}
	
	public void showRightLeg() {
		rightLeg.setVisible(true);
	}
	
	
	
	
	
}
