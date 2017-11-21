/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playhangman;


import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

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
	
	private static Circle head;
	private static Line body, leftArm, rightArm, leftLeg, rightLeg;
	private static int count;
	private boolean running = true;
        private String choice, phrase;
	
	private Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
	private static ArrayList<Text> phraseLetters;

	public Game(String choice) {
		this.choice = choice;
		count = 6;
		this.init();
		this.play();
		
	}
	
	/*
	 * play() contains the logic for the gameplay.
	 */
	
	public void play() {
		// TODO: implement - should contain gameplay logic. May need more methods.
		// TODO: Individual class for the phrase. Below is starter code for this class, remove from play() method.
		
	}
	
	/*
	 * init() initializes the GUI for the game.
	 * It creates a new window for Hangman gameplay.
	 */
	
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
		letters.setPrefRows(2);
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
		gamePane.setMargin(letters, new Insets(0,0,20,0));
		LitDictionary dictionary1 = new LitDictionary();
                StarWarsNames dictionary2 = new StarWarsNames();
		// Set up phrase section to be filled in by gameplay.
                switch(choice){
                    case "Classic Novel Titles": phrase = dictionary1.getTitle();
                    break;
                    
                    case "Star Wars Names": phrase = dictionary2.getTitle();
                    break;
		
                }
                
		phraseLetters = new ArrayList<>();
		for (int i = 0; i < phrase.length(); i++) {
			phraseLetters.add(new Text(phrase.substring(i, i+1)));
		}
		TilePane phrasePane = new TilePane();
		phrasePane.setAlignment(Pos.CENTER);
		for (int i = 0; i < phraseLetters.size(); i++) {
			phrasePane.getChildren().add(phraseLetters.get(i));
		}
                
		setPhraseStyle();
                
		gamePane.setTop(phrasePane);
		gamePane.setMargin(phrasePane, new Insets(75,0,0,0));
		// Set up the pane for the hangman body
		Pane gallowPane = new Pane();
		
		// Head
		head = new Circle(410,245,30);
		gallowPane.getChildren().add(head);
		head.setVisible(false);
		
		// Body
		body = new Line(410, 245, 410, 400); //startX, startY, endX, endY
		body.setStrokeWidth(15);
		gallowPane.getChildren().add(body);
		body.setVisible(false);
		
		//Left Arm
		leftArm = new Line(410, 270, 390, 330);
		leftArm.setStrokeWidth(15);
		gallowPane.getChildren().add(leftArm);
		leftArm.setVisible(false);
		
		//Right Arm
		rightArm = new Line(410, 270, 430, 330);
		rightArm.setStrokeWidth(15);
		gallowPane.getChildren().add(rightArm);
		rightArm.setVisible(false);
		
		//Left Leg
		leftLeg = new Line(410, 400, 385, 500);
		leftLeg.setStrokeWidth(15);
		gallowPane.getChildren().add(leftLeg);
		leftLeg.setVisible(false);
		
		//Right Leg
		rightLeg = new Line(410, 400, 435, 500);
		rightLeg.setStrokeWidth(15);
		gallowPane.getChildren().add(rightLeg);
		rightLeg.setVisible(false);
		
		gamePane.setCenter(gallowPane);
		gamePane.setMargin(gallowPane, new Insets(-25, 0, 0, 0));
		Scene gameScene = new Scene(gamePane, 800, 800);
		gameStage.setScene(gameScene);
		gameStage.show();
	}
	
	/*
	 * setButtonStyle will edit the style of the passed Button.
	 * This is specifically for the letter buttons for the bottom
	 * of the screen.
	 */
	
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
		
		/*
		 * what happens when a letter is clicked
		 */
		
		x.addEventHandler(MouseEvent.MOUSE_CLICKED,
				new EventHandler<MouseEvent>() {
			@Override public void handle(MouseEvent e) {
				x.setStyle("-fx-background-color: \r\n" + 
						"        linear-gradient(from 0% 93% to 0% 100%, #a34313 0%, #903b12 100%),\r\n" + 
						"        #9d4024,\r\n" + 
						"        #d86e3a,\r\n" + 
						"        radial-gradient(center 50% 50%, radius 100%, #ea7f4b, #c54e2c);");
				
				boolean inPhrase = isInPhrase(x);
				if (inPhrase) {
					for (Text a : phraseLetters) {
						if (a.getText().equalsIgnoreCase(x.getText())) {
							a.setVisible(true);
						}
					}
				} else {
					count--;
					if (count == 5) {
						showHead();
					} else if (count == 4) {
						showBody();
					} else if (count == 3) {
						showLeftArm();
					} else if (count == 2) {
						showRightArm();
					} else if (count == 1) {
						showLeftLeg();
					} else if (count == 0) {
						showRightLeg();
						System.out.println("You lose.");
						count = 0;
					}
				} // end if else sequence for letter checking
				
				
				}
			});
		
	}
	
	/*
	 * Set letter style for phrase letters
	 */
	
	public static void setPhraseStyle() {
		for (Text x : phraseLetters) {
			if (!(x.getText().equals(" "))) {
				x.setVisible(false);
			}
		} 
		for (Text x : phraseLetters) {
			x.setFont(Font.font("Algerian", FontWeight.EXTRA_BOLD, 45));
			x.setFill(Color.WHITE);
		}
		
	}
	
	/*
	 * Check if letter is in phrase
	 */
	public static boolean isInPhrase(Button x) {
		for (Text a : phraseLetters) {
			if (x.getText().equalsIgnoreCase(a.getText())) {
				return true;
			}
		}
		return false;
	}
	
	
	// Providing the mechanisms to display body parts
	// for wrong answers. This functionality will be
	// in the play() method.
	
	public static void showHead() {
		head.setVisible(true);
	}
	
	public static void showBody() {
		body.setVisible(true);
	}
	
	public static void showLeftArm() {
		leftArm.setVisible(true);
	}
	
	public static void showRightArm() {
		rightArm.setVisible(true);
	}
	
	public static void showLeftLeg() {
		leftLeg.setVisible(true);
	}
	
	public static void showRightLeg() {
		rightLeg.setVisible(true);
	}
	
	
	
	
	
}