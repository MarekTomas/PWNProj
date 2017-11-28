package app.Controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class WyborController {
	

	@FXML 
    private CheckBox cb_bd;

    @FXML
    private CheckBox cb_git;

    @FXML
    private CheckBox cd_Python;

    @FXML
    private  CheckBox cd_fe;

    @FXML
    private CheckBox cd_java;

    @FXML
    private CheckBox cd_spring;

    @FXML
    private TextArea ta_liczba;
    
	static String l_pyt;
	
	static boolean bd;
	static boolean git;
	static boolean python;
	static boolean fe;
	static boolean java;
	static boolean spring;

    @FXML
    void ButtonPrzejdzDoTestu(MouseEvent event) throws IOException {
   
    	if((cb_bd.isSelected())||(cb_git.isSelected())||(cd_Python.isSelected())||// sprawdzanie czy przycisk jest w��czony
    		(cd_fe.isSelected())||(cd_java.isSelected())||(cd_spring.isSelected())) { 
 
    	l_pyt = ta_liczba.getText();//do zmiennej l_pyt pobieram wynik wpisany przez uzytkownika do textarea
    	
    	python = cd_Python.isSelected(); // przypisanie zmiennej, czy przyscisk jest w�aczony
    	java = cd_java.isSelected();
    	bd = cb_bd.isSelected();
    	git = cb_git.isSelected();
    	fe = cd_fe.isSelected();
    	spring = cd_spring.isSelected();
  
    	Stage stage = new Stage();
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/app/View/TestView.fxml"));
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.setTitle("Witaj");	
		stage.show();
		((Node) (event.getSource())).getScene().getWindow().hide();
			}else {
				Alert statement = new Alert(AlertType.INFORMATION);
				statement.setHeaderText("B��d");
				statement.setContentText("Nie podano zakresu testu");
				statement.showAndWait();
			}
    	
    }

}
    	
    


