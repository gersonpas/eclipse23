package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CustomMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuExample13 extends Application {

	@Override
	public void start(Stage primaryStage) {
		MenuBar menuBar = new MenuBar();
		Menu menu = new Menu("File");
		MenuItem item1 = new MenuItem("New");
		MenuItem item2 = new MenuItem("Save");
		SeparatorMenuItem item3 = new SeparatorMenuItem();
		MenuItem item4 = new MenuItem("Exit");
		CustomMenuItem item5 = new CustomMenuItem(new Slider());
		
		// Add items to the menu
		menu.getItems().addAll(item1, item2,item3,item4,item5);
		
		/// Add items to the menuBar 
		menuBar.getMenus().add(menu);
		
		// Add menubar to the layout pane
		BorderPane bp = new BorderPane();
		bp.setTop(menuBar);
		
		// Add to the stage
		Scene scene = new Scene(bp, 400,400);
		primaryStage.setTitle("Menu Bar Slide Exemple - Aula 36");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
