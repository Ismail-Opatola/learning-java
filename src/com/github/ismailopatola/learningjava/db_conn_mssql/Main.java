package com.github.ismailopatola.learningjava.db_conn_mssql;
import java.sql.*;

public class Main {

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager
					.getConnection("jdbc:sqlserver://localhost:1433"); 
			Statement statement = conn.createStatement();
			
			ResultSet rSet = statement.executeQuery("select * from  ");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
