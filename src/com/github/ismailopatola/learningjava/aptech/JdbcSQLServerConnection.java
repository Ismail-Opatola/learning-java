package com.github.ismailopatola.learningjava.aptech;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcSQLServerConnection {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			/**
			 * refs
			 * ----
			 * https://stackoverflow.com/questions/6087819/jdbc-sqlserverexception-this-driver-is-not-configured-for-integrated-authentic
			 */
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");		
//			String dbURL = "jdbc:sqlserver://DESKTOP-EG49PRD;instaceName=DESKTOP-EG49PRD;DatabaseName=FooDB";
//			String dbURL = "jdbc:sqlserver://DESKTOP-EG49PRD;database=FooDB";
//			String dbURL = "jdbc:sqlserver://localhost:1433;database=FooDB"+";IntegratedSecurity=true;";
//			String dbURL = "jdbc:sqlserver://localhost:1433;instaceName=DESKTOP-EG49PRD;databaseName=FooDB";
//			
//			String dbURL = "jdbc:sqlserver://localhost;integratedSecurity=true;";
//			String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=FooDB;integratedSecurity=true;";
			String dbURL = "jdbc:sqlserver://localhost;databaseName=FooDB;integratedSecurity=true;";
			
			String user = "DESKTOP-EG49PRD\\Ismail";
			String pwd ="";
			
			conn = DriverManager.getConnection(dbURL,user,pwd); // works
//			conn = DriverManager.getConnection(dbURL); // works
			
			if(conn != null) {
				DatabaseMetaData db = (DatabaseMetaData) conn.getMetaData();
				System.out.println("connection successful");
				System.out.println(db.getDriverName());
				System.out.println(db.getDatabaseProductName());
			} else {
				System.out.println("connection failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			try {
				if(conn != null && !conn.isClosed()) {					
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
