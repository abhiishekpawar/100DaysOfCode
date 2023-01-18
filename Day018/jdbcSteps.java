package org.load.step;

import java.sql.*;

public class load {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		String iquery = "insert into pentagon.student values(69,'amol',69)";
		try { 
			Class.forName("com.mysql.jdbc.Driver");//step 1
			System.out.println("class loaded and registered");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");//s2
			System.out.println("connected with db ");
			stmt = con.createStatement();//s3
			System.out.println("platform created sucessfully");
			stmt.execute(iquery);//s4
			System.out.println("query executed sucessfully");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	

}
