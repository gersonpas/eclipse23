package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorApp extends Application {

//Button btn;
TextField tfNum1;
TextField tfNum2;
Button btnDivide;
Button btnMultiply;
Button btnSubtraction;
Button btnAddition;
Button btnClear;
Label lblAnswer;

@Override
public void start(Stage primaryStage) {
	
		tfNum1 = new TextField();
		tfNum2 = new TextField();
		btnDivide = new Button("/");
		btnMultiply = new Button("X");
		btnSubtraction = new Button("-");
		btnAddition = new Button("+");
		btnClear = new Button("Clear");
		lblAnswer = new Label(" ? ");			
		GridPane root = new GridPane();
		root.setAlignment(Pos.CENTER);
		
		root.setHgap(10);
		root.setVgap(10);
		
		root.add(btnDivide, 0, 0);
		root.add(btnMultiply, 1, 0);
		root.add(btnAddition, 0, 1);
		root.add(btnSubtraction, 1, 1);
		root.add(tfNum1, 0, 2);
		root.add(tfNum2, 1, 2);		
		root.add(lblAnswer, 0, 3);
		root.add(btnClear, 0, 4);
		setWidths();		
		attachCode();
		Scene scene = new Scene(root,500,500);
		primaryStage.setTitle("Calculadora do Gerson - Criada em Java 8!");		
		primaryStage.setScene(scene);		
		primaryStage.show();
				
	
}

public void attachCode() {
	
	btnAddition.setOnAction(e-> btnCode(e));
	btnSubtraction.setOnAction(e->btnCode(e));
	btnMultiply.setOnAction(e->btnCode(e));
	btnDivide.setOnAction(e->btnCode(e));
	btnClear.setOnAction(e->btnCode(e));
	
} 

private void btnCode(ActionEvent e) {
	int num1, num2, answer;
	char symbol;
	if(e.getSource()==btnClear) 
	{
		//System.out.println("Clear!!!");
		tfNum1.setText("");
		tfNum2.setText("");
		lblAnswer.setText("");
		tfNum1.requestFocus();
		return;			
	}
	
	// Read numbers from textfields
	num1 = Integer.parseInt(tfNum1.getText());
	num2 = Integer.parseInt(tfNum2.getText());
	if(e.getSource()==btnAddition) {
		answer = num1 + num2;
		symbol = '+';		
	}
	else if(e.getSource()== btnSubtraction) {
		answer = num1 - num2;
		symbol = '-';	
	}
	else if(e.getSource()== btnMultiply) {
		answer = num1 * num2;
		symbol = 'X';	
	}
	else 
	{
		answer = num1 / num2;
		symbol = '/';	
	}
	
	lblAnswer.setText(""+ num1 + symbol+ num2 + "=" + answer);
	
}

private void setWidths() {
	tfNum1.setPrefWidth(70);
	tfNum2.setPrefWidth(70);
	btnDivide.setPrefWidth(70);
	btnMultiply.setPrefWidth(70);
	btnAddition.setPrefWidth(70);
	btnSubtraction.setPrefWidth(70);
	btnClear.setPrefWidth(250);
	lblAnswer.setPrefWidth(250);
	btnClear.setStyle("-fx-border-color:#0000FF;-fx-padding:6px");
	lblAnswer.setStyle("-fx-border-color:#0000FF;-fx-padding:8px");
}

public static void main(String[] args) {
	launch(args);
	}
}