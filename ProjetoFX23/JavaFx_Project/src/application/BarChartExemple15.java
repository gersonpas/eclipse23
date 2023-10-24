package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BarChartExemple15<Y, X>  extends Application {

	@Override
	public void start(Stage primaryStage) {
		// Step1 :
		// Create x-axis and y-axis
		// Creating a Bar Chart
		// Set up the data
		// Add the data to the barchart
		// add the barchart to the scenegraph
		// scene
		// Stage
		
		
		CategoryAxis xAxis = new CategoryAxis();
		xAxis.setLabel("Devices Type");

		NumberAxis yAxis = new NumberAxis();
		yAxis.setLabel("No of Visits");
		
		BarChart barChart = new BarChart(xAxis, yAxis);
		
		// Step2 : BarChart Data Series
		
		XYChart.Series dataSeries = new XYChart.Series();
		dataSeries.setName("2023");
		
		XYChart.Data d1 = new XYChart.Data("Desktop",500);
		XYChart.Data d2 = new XYChart.Data("Phone",100);
		XYChart.Data d3 = new XYChart.Data("Tablet",250);
		XYChart.Data d4 = new XYChart.Data("Kindle",400);
		dataSeries.getData().addAll(d1,d2,d3,d4);
		barChart.getData().add(dataSeries);			
				
				
		// Step3 : Adding a BarChart to the Scene Graph
		
		VBox vbox = new VBox(barChart);
		Scene scene = new Scene(vbox, 400,400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("BarChar Exemple Aula 38");
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
