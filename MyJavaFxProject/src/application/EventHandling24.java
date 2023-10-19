package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class EventHandling24  extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		Button b1 = new Button("Click Me");
		Label b2 = new Label("Você clicou o botão");
		
		b1.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
			int count = 0;
			@Override
			public void handle(ActionEvent arg0) {
			;
				count ++;
				// System.out.println("You have clicked the button "+ count +" times");
				b2.setText("Clicou o Botão Central!  " + count + "  Vezes!");
			}
			
		});
		
		BorderPane bp = new BorderPane();
		bp.setCenter(b1);
		bp.setTop(b2);
		// Add this layout to the scene		
	   Scene scene = new Scene(bp,500,400);							
	   primaryStage.setTitle("Botão Interativo com Java - Aula 48");
	   primaryStage.setScene(scene);
	   primaryStage.show();
	
	}
	public static void main(String[] args) {
		launch(args);
	}
}