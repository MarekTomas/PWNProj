package app.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ListaStatController {

    @FXML
    private TableView<?> table_view;

    @FXML
    private TableColumn<?, ?> col_imie;

    @FXML
    private TableColumn<?, ?> col_nazwisko;

    @FXML
    private TableColumn<?, ?> col_grupa;

    @FXML
    private TableColumn<?, ?> col_liczbaTest;

    @FXML
    private TableColumn<?, ?> col_sredni;

    @FXML
    private Button btn_wyjdz;

    @FXML
    private Button btn_wstecz;

    @FXML
    private TextField tf_filter;

    @FXML
    void filter(KeyEvent event) {

    }

    @FXML
    void wstecz(MouseEvent event) {

    }

    @FXML
    void wyjdz(MouseEvent event) {
    	System.exit(0);
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
	@FXML
	public void filter(KeyEvent event) throws ClassNotFoundException, SQLException {
		Connection conn = db.Connection();
		data = FXCollections.observableArrayList();
		String szukaj = tf_filter.getText();
		ResultSet rs = conn.createStatement().executeQuery("Select * from users where locate('" + szukaj
				+ "',name)!=0 or locate('" + szukaj + "',last)!=0 or locate('" + szukaj + "',position)!=0;");

		while (rs.next()) {
			data.add(new Users(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5)));

		}
		name.setCellValueFactory(new PropertyValueFactory<Statystyki, String>("name"));
		last.setCellValueFactory(new PropertyValueFactory<Statystyki, String>("last"));
		group.setCellValueFactory(new PropertyValueFactory<Statystyki, String>("salary"));
		.setCellValueFactory(new PropertyValueFactory<Statystyki, String>("position"));
		table_view.setItems(null);
		table_view.setItems(data);

	}
	
	public void initialize() {
		
	}
	

}