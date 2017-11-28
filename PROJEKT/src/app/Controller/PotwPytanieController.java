package app.Controller;

import app.Database.DBConnectorMW;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
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
	private Label lbl_zakres;

	@FXML
	private Button btn_zatwierdz;

	@FXML
	private Button btn_anuluj;

	@FXML
	void anuluj(MouseEvent event) {

		((Node) (event.getSource())).getScene().getWindow().hide();
	}

	@FXML
	void zatwierdz(MouseEvent event) {
		DBConnectorMW baza = new DBConnectorMW();
		baza.insert("Insert into Pytania (zakres, pytanie, odp_1, odp_2, odp_3, odp_poprawna) values ('"
				+ DodPytController.zakres + "', '" + DodPytController.pyt + "', '" + DodPytController.bledna1 + "', '"
				+ DodPytController.bledna2 + "', '" + DodPytController.bledna3 + "', '" + DodPytController.poprawna
				+ "')");

		Alert ostrz = new Alert(AlertType.INFORMATION);
		ostrz.setHeaderText(
				"Do bazy zosta³o dodane pytanie odpowiadaj¹ce mu odpowiedzi.\nMo¿esz przejœc do wprowadzania kolejnego");
		ostrz.setTitle("Dodanie pytania");
		ostrz.showAndWait();

		((Node) (event.getSource())).getScene().getWindow().hide();

	}

	public void initialize() {
		lbl_pyt.setText(DodPytController.pyt);
		lbl_poprawna.setText(DodPytController.poprawna);
		lbl_bledna1.setText(DodPytController.bledna1);
		lbl_bledna2.setText(DodPytController.bledna2);
		lbl_bledna3.setText(DodPytController.bledna3);
		lbl_zakres.setText(DodPytController.zakres);
	}

}
