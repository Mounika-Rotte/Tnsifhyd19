package net.java;

import java.sql.*;

public class UsersManager {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "Mounika@12345";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL,username, password);
		 
		    if (conn != null) {
		        System.out.println("Connected to the database");
		        conn.close();
		    }
		} catch (SQLException ex) {
			ex.printStackTrace();
		    		

		}
	} 

}
