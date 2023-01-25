package org.load.step;

import java.util.*;
import java.sql.*;

public class InsertOneRecord {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		String iQry1 = "insert into pentagon.student values(100,'Yatish',99.09)";
		String iQry2 = "insert into pentagon.student values(101,'Yatish',99.09)";
		String iQry3 = "insert into pentagon.student values(102,'Yatish',99.09)";
		try {
			Class.forName("com.mysql.jdbc.Driver");// step1
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");// step2
			stmt = con.createStatement();// step3
			stmt.execute(iQry1);// step4
			stmt.execute(iQry2);
			stmt.execute(iQry3);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			System.out.println("all the costly resources are closed");
		}
	}
}
