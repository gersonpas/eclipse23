package application;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RegistrationForm12 extends Application{

	@Override
	public void start(Stage telaPrincipal) throws Exception {
		Label nameLabel = new Label("Name");
		TextField nameText = new TextField();
		Label dobLabel = new Label("Date of Birth");
		DatePicker datePicker = new DatePicker();		
		Label genderLabel = new Label("Gender");
		ToggleGroup groupGender = new ToggleGroup();
		RadioButton maleRadio = new RadioButton("Male");
		RadioButton femaleRadio = new RadioButton("Female");
		Label technologiesLabel = new Label("Technology Known");
		CheckBox javaCheckBox = new CheckBox("Java");
		CheckBox dotNetCheckBox = new CheckBox("DotNet");
		Button registrerButton = new Button("Registrer");	
		
						
		maleRadio.setToggleGroup(groupGender);
		femaleRadio.setToggleGroup(groupGender);
		
		Label educationLabel = new Label("Education Qualification");		
		ListView<String> educationItens = new ListView<String>();
		
		educationItens.getItems().addAll("Engineering","MCA","MBA", "Graduation", "MTech", "FGV" );
		/*educationItens.getItems().add("Engineering");		
		educationItens.getItems().add("MCA");
		educationItens.getItems().add("MBA");
		educationItens.getItems().add("Graduation");
		educationItens.getItems().add("MTech");
		*/
		
		// Add the label for the lacation
		Label locationLabel = new Label("Location");
		ChoiceBox<String> locationChoiceBox = new ChoiceBox<String>();
		locationChoiceBox.getItems().addAll("BRASIL","RUSSIA ","INDIA","CHINA","AFRICA DO SUL");
		
		//, "UK", "BRASIL", "INDIA", "PORTUGUAL
		GridPane gridPane = new GridPane();
		gridPane.setMinSize(500,500);
		gridPane.setPadding(new Insets(10,10,15,15));
		gridPane.setVgap(10);
		gridPane.setHgap(10);
		// Add the controls to the grid
		gridPane.add(nameLabel, 0, 0);
		gridPane.add(nameText, 1, 0);
		gridPane.add(dobLabel, 0, 1);
		gridPane.add(datePicker, 1,1);
		// Add the label and the radio button to the grid
		gridPane.add(genderLabel, 0, 2);
		gridPane.add(maleRadio, 1, 2);
		gridPane.add(femaleRadio, 2, 2);
		//Add the technologies to the grid
		gridPane.add(javaCheckBox, 1, 3);
		gridPane.add(dotNetCheckBox, 2, 3);
		gridPane.add(technologiesLabel, 0, 3);
		
		//Add educationLabel and the list
		gridPane.add(educationLabel, 0, 4);
		gridPane.add(educationItens, 1, 4);
		
		//Add the label location and choiceLabel to the grid
		gridPane.add(locationLabel, 0, 5);
		gridPane.add(locationChoiceBox, 0, 6);
		
		//Add the Registrer button to the Grid
		gridPane.add(registrerButton, 4, 6);
		
		// Add the grid to the scene
		Scene scene = new Scene(gridPane, 600,600);
		telaPrincipal.setScene(scene);
		telaPrincipal.setTitle("Formulario de Registro");
		telaPrincipal.show();
							
		
		}
public static void main(String[]args) {
	launch(args);
	
}

}