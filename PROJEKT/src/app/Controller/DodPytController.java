package app.Controller;

import java.io.IOException;

import app.Database.DBConnectorMW;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

public class DodPytController {

	@FXML
	private TextArea ta_pytanie;

	@FXML
	private TextArea ta_popr_odp;

	@FXML
	private TextArea ta_bledna1;

	@FXML
	private TextArea ta_bledna2;

	@FXML
	private TextArea ta_bledna3;

	@FXML
	private Button btn_wstecz;

	@FXML
	private Button btn_zatwierdz;

	@FXML
	private Button btn_wyjdz;

	@FXML
	private ToggleGroup ra_zakres;

	@FXML
	void wsteczAdminView(MouseEvent event) throws IOException {
		Pomocnicze przejdz = new Pomocnicze();
		przejdz.okno("/app/View/AdminView.fxml", "Administrator", event);
		
	}

	@FXML
	void wyjscie(MouseEvent event) {
		System.exit(0);
	}

	@FXML
	void zatwierdz(MouseEvent event) {
		
		System.out.println(ra_zakres.getSelectedToggle());
		
		
		
		if (ta_pytanie.getText().isEmpty() || ta_popr_odp.getText().isEmpty() || ta_bledna1.getText().isEmpty()
				|| ta_bledna2.getText().isEmpty() || ta_bledna3.getText().isEmpty()
				|| ra_zakres.getSelectedToggle() == null) {
			
			Alert ostrz = new Alert(AlertType.WARNING); 
			ostrz.setContentText("Nie zosta³y wype³nione wszystkie wymagane pola"); 
			ostrz.setHeaderText("Wype³nij wszystkie pola"); 
			ostrz.setTitle("Ostrze¿enie!"); 
			ostrz.showAndWait(); 
		}
		//}else
			DBConnectorMW baza = new DBConnectorMW();
			String zakres = ra_zakres.selectedToggleProperty().toString();
			//baza.insert("Insert into Pytania (zakres, pytania, odp_1, odp_2, odp_3, odp_poprawna) values ('"+Trim(ta_bledna1.getText())");

	}

}
