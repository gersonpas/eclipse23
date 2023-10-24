package application;


import java.beans.EventHandler;

import javafx.application.Application;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class EventHandling23  extends Application {

	@Override
	public void start(Stage primaryStage) {
		TextField t1 = new TextField();
		BorderPane bp = new BorderPane();
		bp.setTop(t1);
		t1.setOnKeyPressed(new EventHandler<KeyEvent>() {
			
		public void handle(KeyEvent arg0) {
			
		}
			
		});
		
		Scene scene = new Scene(bp,600,600);	
									
	primaryStage.setTitle("Bem Vindo ao Mundo Java!");
	primaryStage.setScene(scene);
	primaryStage.show();
	
	}
	public static void main(String[] args) {
		launch(args);
	}
}