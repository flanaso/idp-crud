package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class LoginController {
	
	private static List<String> users;
	
	@FXML
	private void initialize() {
		users = new ArrayList<>();
		users.add("pastor");
		users.add("tesorero");
	}
	
	@FXML
	private void login() throws Exception{
		String user = txtUsuario.getText().toLowerCase();
		String pass = txtContraseña.getText().toLowerCase();
		
		if (users.contains(user) && users.contains(pass)) {
			loadTesoreroView();
			((Stage)txtUsuario.getScene().getWindow()).close();
		}
	}
	
	@FXML
	private void exit() {
		
	}
	
	void loadTesoreroView() throws Exception {
			Parent parent = FXMLLoader.load(getClass().getResource("/view/Tesorero.fxml"));
			Scene scene = new Scene(parent);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setTitle("Tesorero");
			stage.show();
	}
	
	@FXML
	JFXTextField txtUsuario;
	@FXML
	JFXPasswordField txtContraseña;
	
}
