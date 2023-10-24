package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxLayoutExample5  extends Application {

	@Override
	public void start(Stage telaPrincipal) {
		Button btn1 = new Button("Button One");
		Button btn2 = new Button("Button Two");
		Button btn3 = new Button("Button Three");
		VBox vbox = new VBox(20,btn1,btn2,btn3);
		//vbox.setSpacing(20);
		vbox.setPadding(new Insets(10));
		vbox.setAlignment(Pos.CENTER);
		//vbox.getChildren().addAll(btn1,btn2,btn3);
		btn1.setMaxWidth(Double.MAX_VALUE);
		btn3.setMaxWidth(Double.MAX_VALUE);

		Scene scene = new Scene(vbox,400,300);
		telaPrincipal.setTitle("JavaFX VBox Example 5");
		telaPrincipal.setScene(scene);
		telaPrincipal.show();
		//primaryStage
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
