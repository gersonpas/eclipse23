package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ScatterChartExemple16  extends Application {

	@Override
	public void start(Stage primaryStage) {
		NumberAxis xAxis = new NumberAxis( );
		xAxis.setLabel("No of Employes");
		NumberAxis yAxis = new NumberAxis();
		yAxis.setLabel("Revenue per Employes");
		
		ScatterChart scatterChart = new ScatterChart(xAxis,yAxis );
		// Create data series
		// set up data points to the chart
		// add the series to the chart
		
		XYChart.Series dataSeries1 = new XYChart.Series();
		dataSeries1.setName("2023");
		dataSeries1.getData().add(new XYChart.Data(1, 500));
		dataSeries1.getData().add(new XYChart.Data(5, 200));
		dataSeries1.getData().add(new XYChart.Data(10,300));
		dataSeries1.getData().add(new XYChart.Data(80,400));
		dataSeries1.getData().add(new XYChart.Data(50,100));
		dataSeries1.getData().add(new XYChart.Data(30,500));
		
		scatterChart.getData().add(dataSeries1);
		// add the chart to the scene graph layout pane		
		VBox vbox = new VBox(scatterChart);
		// Add the layout to the scene
		Scene scene = new Scene(vbox,500,600);
		// set the scene 		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Scatter Chart Exemplo16 - Aula 39");
		primaryStage.show();
			
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
