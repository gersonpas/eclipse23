package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxLayoutExample3 extends Application {
	
			
	@Override
	public void start(Stage primaryStage) {
		Button btn1 = new Button("Button One");
		Button btn2 = new Button("Button Two");
		Button btn3 = new Button("Button Three");
		HBox hbox = new HBox(btn1,btn2,btn3);
		Scene cena = new Scene(hbox,500,500);
		primaryStage.setTitle("HBox Exemple 3 - GPAS 09/23");
		primaryStage.setScene(cena);
		primaryStage.show();
				
	}

	public static void main(String[] args) {
		launch(args);
	
	}

			
	
}
