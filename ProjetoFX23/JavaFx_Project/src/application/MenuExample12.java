package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuExample12  extends Application {

	@Override
	public void start(Stage primaryStage) {
		// Menu bar
		// Create the menus -> File Web SQL
		// Add menu items to the above menus
		// Add menus to the menubar
		// Add menubar to the layout pane (border pane)
		// Add the layout pane to the scene
		// Set the scene on the stage
		// Display the stage
		MenuBar menuBar = new MenuBar();		
		
		Menu fileMenu = new Menu("Arquivo");
		Menu fileMenu2 = new Menu("Sobre");
		Menu webMenu = new Menu("Web");
		Menu sqlMenu = new Menu("SQL");
		
		
		CheckMenuItem htmlMenuItem = new CheckMenuItem("HTML");
		htmlMenuItem.setSelected(true);
		CheckMenuItem cssMenuItem = new CheckMenuItem("CSS");
		cssMenuItem.setSelected(true);
		webMenu.getItems().addAll(htmlMenuItem, cssMenuItem);
		
		RadioMenuItem mySqlItem = new RadioMenuItem("MySQL");
		RadioMenuItem oracleItem = new RadioMenuItem("Oracle");
		ToggleGroup tGroup = new ToggleGroup();
		mySqlItem.setToggleGroup(tGroup);
		oracleItem.setToggleGroup(tGroup);
		
		Menu tutorialMenu = new Menu("Tutorial");
		MenuItem m1 = new MenuItem("Java");
		MenuItem m2 = new MenuItem("JavaFx");
		MenuItem m3 = new MenuItem("Swing");
		tutorialMenu.getItems().addAll(m1,m2,m3);	
		
		
		MenuItem newMenuItem = new MenuItem("New");
		MenuItem saveMenuItem = new MenuItem("Save");
		MenuItem exitMenuItem = new MenuItem("Exit");
		
		//Add itens ao menu2
		MenuItem sobreAutor = new MenuItem("Autor");
		MenuItem sobrePrograma = new MenuItem("Programa");
		MenuItem sobreVersao = new MenuItem("Versão");
		
		//Add these menu items to the menu
		fileMenu.getItems().addAll(newMenuItem, saveMenuItem, exitMenuItem);
		fileMenu2.getItems().addAll(sobreAutor,sobrePrograma,sobreVersao);
		sqlMenu.getItems().addAll(mySqlItem, oracleItem, tutorialMenu);
		
		// Add the menu to the menuBar
		menuBar.getMenus().add(fileMenu);
		menuBar.getMenus().add(fileMenu2);
		menuBar.getMenus().add(webMenu);
		menuBar.getMenus().add(sqlMenu);
		BorderPane bp = new BorderPane();
		bp.setTop(menuBar);
		
		//Add the layout pane to the scene
		//Scene scene = new Scene(bp,300,400);
		Scene scene = new Scene(bp,350,400);
		primaryStage.setTitle("Exemplos de tipos de Menus");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}