package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Main extends Application {
	
	Button btn;
	@Override
	public void start(Stage primaryStage) {
		try {
			
			btn = new Button();
			BorderPane bp = new BorderPane();
					
			btn.setText("Mostrar Mensagem aqui!");					
			Label lbl = new Label();
			lbl.setText(" ====>>   Você não cliquou! <=====");			
			bp.setTop(lbl);
			bp.setCenter(btn);			
			
			Button btn1 = new Button("Button One");
			Button btn2 = new Button("Button Two");
			Button btn3 = new Button("Button Three");
			HBox hbox = new HBox(btn2,btn1,btn3);
			hbox.setSpacing(50);
			hbox.setPadding(new Insets(10));
			HBox.setMargin(btn2, new Insets(10));
			HBox.setMargin(btn1, new Insets(10));
			HBox.setMargin(btn3, new Insets (10));
			Scene scene = new Scene(hbox,500,500);
				
							
			primaryStage.setTitle("Bem Vindo ao Mundo ===> Java!");
			primaryStage.setScene(scene);
			
			primaryStage.show();
						
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
