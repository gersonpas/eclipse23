package application;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class ButtonExperiment4  extends Application {

	@Override
	public void start(Stage primaryStage) {
		Button btn1 = new Button("Button One");
		Button btn2 = new Button("Button Two");
		Button btn3 = new Button("Button Three");
		
		Region spacer = new Region();
		HBox.setHgrow(spacer, Priority.ALWAYS);
		HBox hbox = new HBox(btn1,btn2,spacer, btn3);
		HBox.setMargin(btn1,new Insets(10));
		HBox.setMargin(btn2,new Insets(10));
		HBox.setMargin(btn3,new Insets(10));
		Scene scene = new Scene(hbox,500,200);							
		primaryStage.setTitle("Bem Vindo ao Mundo Java!");
		primaryStage.setScene(scene);
		
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
