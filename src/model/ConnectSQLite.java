package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectSQLite {
	public static Connection connection() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:idp.db");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
