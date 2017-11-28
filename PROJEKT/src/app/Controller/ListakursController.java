package app.Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import app.Database.DBConnector;
import app.Model.Users;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.control.Button;

public class ListakursController {

	@FXML
	TableView<Users> table_view;

	// obiekt po³¹czenia z db
	public DBConnector db;

	// obiekt do przechowywania listy
	public ObservableList<Users> data;

	@FXML Button btn_select;

	public void initialize() throws IOException, SQLException {
		db = new DBConnector();
	}

	@FXML
	void btnSelectAction(ActionEvent event) throws IOException, SQLException {

		data = FXCollections.observableArrayList();

		Connection conn1 = db.Connection();
		Statement stmt = conn1.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM ankieta;");

		while (rs.next()) {
			// data.add(new Users(rs.getInt(1), rs.getString(2), rs.getString(3),
			// rs.getDouble(4)));
		}
		conn1.close();
		System.out.println(data);

		table_view.setItems(null);
		table_view.setItems(data);

	}
	
	//Filtrowanie
	/*@FXML
	public void filter(KeyEvent event) throws ClassNotFoundException, SQLException {
		Connection conn = db.Connection();
		data = FXCollections.observableArrayList();
		String szukaj = tf_filter.getText();
		ResultSet rs = conn.createStatement().executeQuery("Select * from users where locate('" + szukaj
				+ "',name)!=0 or locate('" + szukaj + "',last)!=0 or locate('" + szukaj + "',position)!=0;");

		while (rs.next()) {
			data.add(new Users(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5)));

		}
		id.setCellValueFactory(new PropertyValueFactory<Users, Integer>("id"));
		name.setCellValueFactory(new PropertyValueFactory<Users, String>("name"));
		last.setCellValueFactory(new PropertyValueFactory<Users, String>("last"));
		salary.setCellValueFactory(new PropertyValueFactory<Users, Double>("salary"));
		position.setCellValueFactory(new PropertyValueFactory<Users, String>("position"));
		table_view.setItems(null);
		table_view.setItems(data);

	}*/
	
	

}