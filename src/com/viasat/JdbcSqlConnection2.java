package com.viasat;

//add Microsoft jdbc driver .jar file
/*important!!!
before run this please past this line (-Djava.library.path=\"d:\\Users\\Saif\\Downloads\\sqljdbc_6.0.8112.100_enu\\sqljdbc_6.0\\enu\\auth\\x64\")
under Run menu /Run configurations /Arguments /VM Arguments.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JdbcSqlConnection2 {
@SuppressWarnings("resource")
public static void main(String[] args) throws Exception {
	

	String connectionUrl = "jdbc:sqlserver://127.0.0.1:1433;" + "databaseName=Practice;integratedSecurity=True;";
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;


			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(connectionUrl);
			System.out.println("Connection Established for Employees!!!");

			String SQL ="select * from employees where lname = 'islam'";
			
			st = con.createStatement();
			rs = st.executeQuery(SQL);
			while (rs.next()) {
				System.out.println(
						rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
				
			
			System.out.println("Connection Established for Customers!!!");
			String SQL1= " select * from employees where LName like '%u'";
			st = con.createStatement();
			rs = st.executeQuery(SQL1);
			
			while (rs.next()) {
				System.out.println(
						rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}		}
		}
	}
