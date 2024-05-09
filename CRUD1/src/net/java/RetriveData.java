package net.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveData {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "Mounika@12345";
		 
		try(Connection conn = DriverManager.getConnection(dbURL, username, password)) {
		 
			String sql = "SELECT * FROM employee";
			 
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
			   
			    String employeename = result.getString("employeename");
			    String employeeaddress = result.getString("employeeaddress");
			 
			    String output = "User #%d:%s - %s";
			    System.out.println(String.format(output, ++count, employeename, employeeaddress));
			}
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}

}
