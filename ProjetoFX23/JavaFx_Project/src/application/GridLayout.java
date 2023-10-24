package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridLayout extends Application {	
						
	
	@Override
	public void start(Stage primaryStage) {	
		
		Button btn1 = new Button("Btn1");
		Button btn2 = new Button("Btn2");
		Button btn3 = new Button("Btn3");
		Button btn4 = new Button("Btn4");
		Button btn5 = new Button("Btn5");
		Button btn6 = new Button("Btn6");
		Button btn7 = new Button("Btn7");
		Button btn8 = new Button("Btn8");
		Button btn9 = new Button("Btn9");
		GridPane gridPane = new GridPane();
		gridPane.setMinSize(400, 200);	
		gridPane.setPadding(new Insets(10));
		gridPane.setVgap(15);
		gridPane.setHgap(15);
		gridPane.add(btn1, 0, 0);
		gridPane.add(btn2, 1, 0);
		gridPane.add(btn3, 2, 0);
		gridPane.add(btn4, 0, 1);
		gridPane.add(btn5, 1, 1);
		gridPane.add(btn6, 2, 1);
		gridPane.add(btn7, 0, 2);
		gridPane.add(btn8, 1, 2);
		gridPane.add(btn9, 2, 2);
		
		Scene scene = new Scene(gridPane, 600,600);
		gridPane.setGridLinesVisible(true);
		gridPane.setAlignment(Pos.CENTER);
		primaryStage.setTitle("Grade de Botões - Exemplo 9");
		primaryStage.setScene(scene);
		primaryStage.show();		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	
	}


}
