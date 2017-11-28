package app.Controller;

import java.io.IOException;
import java.sql.SQLException;

import app.Database.DBConnector;
import app.Database.DBConnectorMW;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class PotwPytanieController {

    @FXML
    private Label lbl_pyt;

    @FXML
    private Label lbl_poprawna;

    @FXML
    private Label lbl_bledna1;

    @FXML
    private Label lbl_bledna2;

    @FXML
    private Label lbl_bledna3;

    @FXML
    private Button btn_zatwierdz;

    @FXML
    private Button btn_anuluj;

    @FXML
    void anuluj(MouseEvent event) {

    }

    @FXML
    void zatwierdz(MouseEvent event) {
    	DBConnectorMW baza = new DBConnectorMW();
		baza.insert("Insert into Pytania (zakres, pytanie, odp_1, odp_2, odp_3, odp_poprawna) values ('"
				+ zakres + "', '" + ta_pytanie.getText().trim() + "', '" + ta_bledna1.getText().trim() + "', '"
				+ ta_bledna2.getText().trim() + "', '" + ta_bledna3.getText().trim() + "', '"
				+ ta_popr_odp.getText().trim()+"')");
    }
    
    
    public void initialize() {
	}


}