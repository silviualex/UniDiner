package diner.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private final String URL = "jdbc:mysql://localhost:3306/unidiner?verifyServerCertificate=false&useSSL=false";
	private final String USERNAME = "root";
	private final String PASSWORD = "123456";
	private static Connection connection = null;
	
	
	private DBConnection() {
		
		try {
			
			DBConnection.connection = DriverManager.getConnection(URL, USERNAME, PASSWORD); 
			
		} catch (Exception e) {
			System.err.println("Got an exception! ");
			System.err.println(e.getMessage());
		}
	}
	
	public static Connection getConnctionToDB() throws SQLException {
		
		if (connection.isClosed() || connection == null) {
			new DBConnection();
			return connection;
		}
		
		return connection;
	}
}
