package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class EventHandling22  extends Application {

	@Override
	public void start(Stage primaryStage) {
		Label lb = new Label("Type of Event");
		Label lb2 = new Label("O botão do Mouse foi pressionado");
		Circle circle = new Circle(100,300,75);	
		circle.setFill(Color.YELLOW);
		circle.setStrokeWidth(5);
		BorderPane bp = new BorderPane();
		bp.setCenter(circle);
		bp.setTop(lb);
		bp.setBottom(lb2);
		bp.setCenter(circle);
		// Add this layout to the scene		
	   Scene scene = new Scene(bp,500,400);							
	   primaryStage.setTitle("Botão Interativo com Java - Aula 50");
	   primaryStage.setScene(scene);
	   primaryStage.show();
	   
	   circle.setOnMouseEntered(new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent arg0) {
			lb.setText("Type of Event: Mouse Entered");	
			
		} 
		 		  
	   });
	   circle.setOnMouseExited(new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent arg0) {
			lb.setText("Type of Event: Mouse Exited");	
			
		}
		   
	   });
	   
	   circle.setOnMousePressed(new EventHandler<MouseEvent>() {

		@Override
		public void handle(MouseEvent arg0) {
			lb.setText("Type of Event: Mouse Pressed");
			lb2.setText("Adicionado um evento:");
		}
		   
		   
	   });
	   
	}
	public static void main(String[] args) {
		launch(args);
	}
}