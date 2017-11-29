package app;

import java.io.IOException;

import app.Controller.Pomocnicze;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		Pomocnicze przejdz = new Pomocnicze();
//		przejdz.okno("/app/View/DodPytView.fxml", "Logowanie");
//		przejdz.okno("/app/View/PotwPytanieView.fxml", "Zatwierdzenie pytania");
//		przejdz.okno("/app/View/AdminView.fxml", "Aministrator");
		przejdz.okno("/app/View/ListaStatView.fxml", "xxxxx");

		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
