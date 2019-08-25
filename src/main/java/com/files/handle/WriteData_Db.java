package com.files.handle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class WriteData_Db {

	public static void main(String[] args) {
		
		// Database URL.
		// "company" Is database name. You can change It as per your database name.
		String sqldb_url = "jdbc:mysql://localhost:3307/company";
		// Use your database username here. It Is "root" for root account.
		String sqldb_uname = "root";
		String sqldb_pass = "admin";
		// To Create database connection.
		try {
			Connection connect = DriverManager.getConnection(sqldb_url, sqldb_uname, sqldb_pass);
			
			Statement st = connect.createStatement();
			st.execute("create/update query");
			
			
			connect.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
