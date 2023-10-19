package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LineChartExemple17  extends Application {

	@Override
	public void start(Stage primaryStage) {
		NumberAxis xAxis = new NumberAxis();
		xAxis.setLabel("No of Employees");
		
		NumberAxis yAxis = new NumberAxis();
		yAxis.setLabel("Revenue per Employees");
		
		// Create our line chart using the xAxis and yAxis
		// Create data series
		// Add data series to the line chart
		// Add line chart to the layout pane
		// Add the pane tp the scene
		// Add the scene to the stage
		
		LineChart lineChart = new LineChart(xAxis, yAxis);
		XYChart.Series dataSeries1 = new XYChart.Series();
		dataSeries1.setName("Employee Revenue Chart");
		dataSeries1.getData().add(new XYChart.Data(1,500));
		dataSeries1.getData().add(new XYChart.Data(5,200));
		dataSeries1.getData().add(new XYChart.Data(15,400));
		dataSeries1.getData().add(new XYChart.Data(20,450));
		dataSeries1.getData().add(new XYChart.Data(35,400));
		
		lineChart.getData().add(dataSeries1);
		VBox vbox = new VBox(lineChart);
		Scene scene = new Scene(vbox,400,500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Line Chart Exemplo18 Aula 40");
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
