package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MiembrosModel {
	Connection connection;
	
	public MiembrosModel() {
			connection = ConnectSQLite.connection();
	}
	
	public boolean agregarMiembro(Miembro miembro) {
		String query = "INSERT INTO miembros('nombre','direccion','fecha de nacimiento','fecha de conversion','fecha de bautizo','fecha de pacto','area de servicio') VALUES (?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, miembro.getNombre());
			ps.setString(2, miembro.getDireccion());
			ps.setString(3, miembro.getFechaNacimiento());
			ps.setString(4, miembro.getFechaConversion());
			ps.setString(5, miembro.getFechaBautizo());
			ps.setString(6, miembro.getFechaPacto());
			ps.setString(7, miembro.getAreaServicio());
			
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return false;
	}
	
	public ObservableList<Miembro> obtenerMiembros() {
		ObservableList<Miembro> miembros = FXCollections.observableArrayList();
		String query = "SELECT * FROM miembros";
		try {
			Statement ps = connection.createStatement();
			ResultSet rs = ps.executeQuery(query);
			while (rs.next()) {
				String no = rs.getString(1),
					   nombre = rs.getString(2),
					   direccion = rs.getString(3),
					   nacimiento = rs.getString(4),
					   conversion = rs.getString(5),
					   bautizo = rs.getString(6),
					   pacto = rs.getString(7),
					   servicio = rs.getString(8);
				miembros.add(new Miembro(nombre,direccion,nacimiento,conversion,bautizo,pacto,servicio));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return miembros;
	}
	
	
}
