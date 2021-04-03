package com.github.ismailopatola.learningjava.aptech;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallOutProc {

	Connection connection;
	String url;
	String serverName;
	String instanceName;
	String dbName;
	String username;
	String pwd;
	String sql;
	
	public CallOutProc() {
		url = "jdbc:sqlservers://";
		serverName = "10.2.1.61"; // localhost // DESKTOP-EG49PRD
		instanceName = "martin"; // DESKTOP-EG49PRD
		dbName = "DevApp"; // FooDB
		username = "sa"; // DESKTOP-EG49PRD\Ismail
		pwd = "playware";
	}
	
	private String getConnectionUrl() {
		return url + serverName + ";instanceName = " + instanceName + ";DatabaseName = " + dbName;
	}
	
	public Connection getConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(getConnectionUrl(),username,pwd);
			
			if(connection != null) {
				System.out.println("connection successful");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error Trace in getComnnection" + e.getMessage());
		}
		return connection;
	}
	
	public void display() {
		try {
			connection = getConnection();
			CallableStatement cstmt = connection.prepareCall("{callrecalculatetotal(?,?)}");
			cstmt.setInt(1, 2500);
			cstmt.registerOutParameter(2, java.sql.Types.INTEGER);
			cstmt.execute();
			int maxSalary = cstmt.getInt(2);
			System.out.println(maxSalary);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		CallOutProc proObj = new CallOutProc();
		proObj.display();
	}

}
