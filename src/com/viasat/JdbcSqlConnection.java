package com.viasat;

//add Microsoft jdbc driver .jar file
/*important!!!
before run this please past this line (-Djava.library.path=\"d:\\Users\\Saif\\Downloads\\sqljdbc_6.0.8112.100_enu\\sqljdbc_6.0\\enu\\auth\\x64\")
under Run menu /Run configurations /Arguments /VM Arguments.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JdbcSqlConnection {
public static void main(String[] args) {
	

	String connectionUrl = "jdbc:sqlserver://127.0.0.1:1433;" + "databaseName=Practice;integratedSecurity=True;";
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(connectionUrl);
			System.out.println("Connection Established for Employees!!!");

			String SQL = "select * from Employees";
			
			st = con.createStatement();
			rs = st.executeQuery(SQL);
			
			
			System.out.println("Connection Established for Customers!!!");
			String SQL1= "select * from Customer";
			st = con.createStatement();
			rs = st.executeQuery(SQL1);
			
			while (rs.next()) {
				System.out.println(
						rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}