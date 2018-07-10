package controller;


import com.jfoenix.controls.JFXTextField;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Miembro;
import model.MiembrosModel;

public class MiembrosController {
	MiembrosModel miembrosModel = new MiembrosModel();
	private ObservableList<Miembro> listaMiembros;
	
	@FXML
	private void initialize() {
		listaMiembros = miembrosModel.obtenerMiembros();
		tblColumnNo.setCellValueFactory(new PropertyValueFactory<>("no"));
		tblColumnNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
		tblColumnDireccion.setCellValueFactory(new PropertyValueFactory<>("direccion"));
		tblColumnNacimiento.setCellValueFactory(new PropertyValueFactory<>("fechaNacimiento"));
		tblColumnConversion.setCellValueFactory(new PropertyValueFactory<>("fechaConversion"));
		tblColumnBautizo.setCellValueFactory(new PropertyValueFactory<>("fechaBautizo"));
		tblColumnPacto.setCellValueFactory(new PropertyValueFactory<>("fechaPacto"));
		tblColumnServicio.setCellValueFactory(new PropertyValueFactory<>("areaServicio"));
		tblViewMiembros.setItems(listaMiembros);
	}
	
	@FXML
	private void agregarMiembro() {
		String nombre = txtNombre.getText(),
			   direccion = txtDireccion.getText(),
			   nacimiento = txtNacimiento.getText(),
			   conversion = txtConversion.getText(),
			   bautizo = txtBautizo.getText(),
			   pacto = txtPacto.getText(),
			   servicio = txtServicio.getText();
		
		Miembro nuevoMiembro = new Miembro(nombre,direccion,nacimiento,conversion,bautizo,pacto,servicio);
		boolean miembroInsertado = miembrosModel.agregarMiembro(nuevoMiembro);
		if (miembroInsertado){
			listaMiembros.add(nuevoMiembro);
		} else {
			System.out.println("Error");
		}
			   
	}
	
	@FXML
	private void close() {
		
	}
	
	@FXML private TableView<Miembro> tblViewMiembros;
	@FXML private TableColumn<Miembro,Integer> tblColumnNo;
	@FXML private TableColumn<Miembro,String> tblColumnNombre;
	@FXML private TableColumn<Miembro,String> tblColumnDireccion;
	@FXML private TableColumn<Miembro,String> tblColumnNacimiento;
	@FXML private TableColumn<Miembro,String> tblColumnConversion;
	@FXML private TableColumn<Miembro,String> tblColumnBautizo;
	@FXML private TableColumn<Miembro,String> tblColumnPacto;
	@FXML private TableColumn<Miembro,String> tblColumnServicio;
	@FXML private JFXTextField txtNombre;
	@FXML private JFXTextField txtDireccion;
	@FXML private JFXTextField txtNacimiento;
	@FXML private JFXTextField txtConversion;
	@FXML private JFXTextField txtBautizo;
	@FXML private JFXTextField txtPacto;
	@FXML private JFXTextField txtServicio;
}
