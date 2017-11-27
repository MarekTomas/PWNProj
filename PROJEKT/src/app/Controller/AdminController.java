package app.Controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Tooltip;

public class AdminController {


	@FXML
	private Button btn_dodpyt;

	@FXML
	private Button btn_wyjdz;

	@FXML
	private Button btn_listakurs;

	@FXML Tooltip tt_wyjd;
	



	@FXML
	void przejdzBaza(MouseEvent event) throws IOException {
		Pomocnicze przejdz = new Pomocnicze();
		przejdz.okno("/app/View/DodPytView.fxml", "Dodanie pytania", event);

	}

	@FXML
	void przejdzKursanci(MouseEvent event) throws IOException {
		Pomocnicze przejdz = new Pomocnicze();
		przejdz.okno("/app/View/ListaKursView.fxml", "Lista kursant�w", event);

	}

	@FXML
	void wyjdz(MouseEvent event) {
		System.exit(0);
	}

}
