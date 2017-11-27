package app.Controller;

import java.io.IOException;

import javafx.fxml.FXML;
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
		if (ta_pytanie.getText().isEmpty() || ta_popr_odp.getText().isEmpty() || ta_bledna1.getText().isEmpty()
				|| ta_bledna2.getText().isEmpty() || ta_bledna3.getText().isEmpty()
				|| ra_zakres.getSelectedToggle() == null);
		
		ta_pytanie.getText();
			
			
			
			//lacznie z baza danych update	
			//db	private String pytanie 
			
			System.out.println("dddddd");

	}

}
