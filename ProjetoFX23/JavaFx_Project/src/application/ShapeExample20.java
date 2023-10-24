package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ShapeExample20  extends Application {

	@Override
	public void start(Stage primaryStage) {
		Group gp = new Group();
		for(int i=0; i<800;i+=10)
		{
			Line line1 = new Line(i,0,i,800); // Linhas verticais 
			line1.setStroke(Color.LIGHTGRAY);
			// new Line(startX, startY, endX, endY)
			Line line2 = new Line(0,i,800,i); // Linha Horizontais
			line2.setStroke(Color.LIGHTGRAY);
			gp.getChildren().addAll(line1,line2);
						
		}
		// Create a Retangle
		Rectangle r1 = new Rectangle(250,325,100,140);
		r1.setStroke(Color.BLACK);
		r1.setFill(Color.YELLOW);
		r1.setStrokeWidth(5);	
		gp.getChildren().add(r1);
		
		
		// Create a second Retangle 
				Rectangle r2 = new Rectangle(50,100,200,100);
				r2.setStroke(Color.RED);
				r2.setFill(Color.BLUE);				
				r2.setStrokeWidth(5);
				r2.setArcHeight(25);
				gp.getChildren().add(r2);
				
				
				
		// Create a circle
				Circle c1 = new Circle(120,300,75);
				c1.setStroke(Color.BLACK);
				c1.setFill(Color.CHOCOLATE);
				c1.setStrokeWidth(5);
				gp.getChildren().add(c1);
				
		// Create a Elipse		
				Ellipse  elip1 = new Ellipse(120,300,75, 25); // Ellipse(double centerX, double centerY 
				// , double radiusX , double radiusY )
				elip1.setStroke(Color.BLACK);
				elip1.setFill(Color.CHOCOLATE);
				elip1.setStrokeWidth(5);
				gp.getChildren().add(elip1);
				
		// Criando um Arco open, round, chord		
				Arc  a1 = new Arc(100,550,100,100,90,90); // Ellipse(double centerX, double centerY 
				// , double radiusX , double radiusY )
				a1.setStroke(Color.BLACK);
				a1.setFill(null);
				//a1.setStrokeWidth(5);
				a1.setType(ArcType.OPEN);
				
				
				Arc  a2 = new Arc(200,450,100,100,45,60); // Ellipse(double centerX, double centerY 
				// , double radiusX , double radiusY )
				a2.setStroke(Color.BLUE);
				a2.setFill(null);
				//a1.setStrokeWidth(5);
				a2.setType(ArcType.CHORD);
				
				
				Arc  a3 = new Arc(600,550,100,100,190,190); // Ellipse(double centerX, double centerY 
				// , double radiusX , double radiusY )
				a3.setStroke(Color.BLACK);
				a3.setFill(Color.YELLOW);
				a3.setStrokeWidth(5);
				a3.setType(ArcType.ROUND);		
				
				gp.getChildren().add(a3);								
				gp.getChildren().add(a2);
				gp.getChildren().add(a1);
		Scene scene = new Scene(gp,500,550);
		primaryStage.setTitle("Shape Exemple20 - Aula 41");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}