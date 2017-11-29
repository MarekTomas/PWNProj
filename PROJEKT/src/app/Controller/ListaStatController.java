package app.Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import app.Database.DBConnector;
import app.Model.Stat;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class ListaStatController {

	public DBConnector db;
	public ObservableList<Stat> data;

	@FXML
	private TableView<Stat> table_view;

	@FXML
	private TableColumn<Stat, String> col_imie;

	@FXML
	private TableColumn<Stat, String> col_nazwisko;

	@FXML
	private TableColumn<Stat, String> col_grupa;

	@FXML
	private TableColumn<Stat, Integer> col_liczbaTest;

	@FXML
	private TableColumn<Stat, Integer> col_sredni;

	@FXML
	private Button btn_wyjdz;

	@FXML
	private Button btn_wstecz;

	@FXML
	private TextField tf_filter;

	@FXML
	public void filter(KeyEvent event) throws ClassNotFoundException, SQLException {
		// TODO: tu mi wywala na po³aczeniu z baz¹ 

		Connection conn = db.Connection();
		data = FXCollections.observableArrayList();
		String szukaj = tf_filter.getText();
		ResultSet rs = conn.createStatement().executeQuery("\"select kursant.imie, kursant.nazwisko, kursant.edycja, count(statystyki.id), round(sum(statystyki.procent_poprawnych)/count(statystyki.id)) from statystyki join kursant on kursant.login = statystyki.login where locate('" + szukaj
				+ "',kursant.imie)!=0 or locate('" + szukaj + "',kursant.nazwisko)!=0");

		while (rs.next()) {
			data.add(new Stat(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5)));

		}

		col_imie.setCellValueFactory(new PropertyValueFactory<Stat, String>("name"));
		col_nazwisko.setCellValueFactory(new PropertyValueFactory<Stat, String>("last"));
		col_grupa.setCellValueFactory(new PropertyValueFactory<Stat, String>("grupa"));
		col_liczbaTest.setCellValueFactory(new PropertyValueFactory<Stat, Integer>("ilosc"));
		col_sredni.setCellValueFactory(new PropertyValueFactory<Stat, Integer>("procent_poprawnych"));
		table_view.setItems(null);
		table_view.setItems(data);

	}

	@FXML
	void wstecz(MouseEvent event) throws IOException {
		// TODO: trzeba wstawiæ poprawn¹ œcie¿ke i nag³ówek okna do którego ma
		// przechodziæ
		Pomocnicze przejdz = new Pomocnicze();
		przejdz.okno("/app/View/DodPytView.fxml", "xxxx");
	}

	@FXML
	void wyjdz(MouseEvent event) {
		System.exit(0);
	}

	public void initialize() throws SQLException, ClassNotFoundException {
		// TODO: tu mi wywala na po³aczeniu z baz¹ 
/*		Connection con = db.Connection();
		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("select kursant.imie, kursant.nazwisko, kursant.edycja, count(statystyki.id), round(sum(statystyki.procent_poprawnych)/count(statystyki.id)) from statystyki join kursant on kursant.login = statystyki.login");
		while (rs.next()) {
			data.add(new Stat(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5)));
		}
		col_imie.setCellValueFactory(new PropertyValueFactory<Stat, String>("name"));
		col_nazwisko.setCellValueFactory(new PropertyValueFactory<Stat, String>("last"));
		col_grupa.setCellValueFactory(new PropertyValueFactory<Stat, String>("grupa"));
		col_liczbaTest.setCellValueFactory(new PropertyValueFactory<Stat, Integer>("ilosc"));
		col_sredni.setCellValueFactory(new PropertyValueFactory<Stat, Integer>("procent_poprawnych"));
		table_view.setItems(null);
		table_view.setItems(data);*/
	}

}