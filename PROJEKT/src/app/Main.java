package app;

import java.io.IOException;

import app.Controller.Pomocnicze;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {
		Pomocnicze przejdz = new Pomocnicze();
		przejdz.okno("/app/View/AdminView.fxml", "Logowanie");

		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
