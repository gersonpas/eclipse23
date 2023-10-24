package application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PieChartExample14 extends Application {

	@Override
	public void start(Stage primaryStage) {	
			
		// Criata a piechart
		// create the data
		// Add the data
		// Add the piechart to the scenegraph
		// Add to the scene
		// Add the scene to the stage
		PieChart pieChart = new PieChart();
		PieChart.Data slice1 = new PieChart.Data("Desktop", 213);
		PieChart.Data slice2 = new PieChart.Data("Phone", 60);
		PieChart.Data slice3 = new PieChart.Data("Tablet", 36);
		
		pieChart.getData().addAll(slice1, slice2, slice3);
		//pieChart.getData().add(slice2);
		//pieChart.getData().add(slice3);
		
		VBox vbox = new VBox(pieChart);
		Scene scene = new Scene(vbox,300,400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("PieChar Exemple Aula 37");
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
