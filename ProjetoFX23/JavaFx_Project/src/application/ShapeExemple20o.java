package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class ShapeExemple20o  extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		Group gp = new Group();
		
		for(int i=0; i<800; i+=10) {
			
			Line line1 = new Line(i,0,i,800); // Linhas verticais // new Line(startX, startY, endX, endY)
			line1.setStroke(Color.LIGHTGRAY);
			Line line2 = new Line(0,i,800,i); // Linhas Horizontais // new Line(startX, startY, endX, endY)
			line2.setStroke(Color.LIGHTGRAY);
			gp.getChildren().addAll(line1, line2);
			
			
		}
		
		Scene scene = new Scene(gp,500,550);
		
		primaryStage.setTitle("Exemplos de tipos de Menus");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}