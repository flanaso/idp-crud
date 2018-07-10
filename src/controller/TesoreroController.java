package controller;

import java.io.IOException;

import com.jfoenix.controls.JFXButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class TesoreroController {
	
	@FXML
	private void openMembersList() throws Exception{
			Parent parent = FXMLLoader.load(getClass().getResource("/view/Miembros.fxml"));
			Scene scene = new Scene(parent);
			Stage stage = new Stage();
			stage.setTitle("Lista de miembros");
			stage.setScene(scene);
			stage.show();
	}
	
	@FXML
	public void exit() {
		System.exit(0);
	}
}
