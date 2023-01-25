/*
  Code to insert multiple data into the data base server using PreparedStatement interface 
along with place holder:
 */


package org.load.step;

import java.util.*;
import java.sql.*;

public class pstmt {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String iSqry = "insert into pentagon.student values(?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			pstmt = con.prepareStatement(iSqry);
			//before executing PH set values for it
			pstmt.setInt(1,1);
			pstmt.setString(2, "Abhishek");
			pstmt.setDouble(3, 45.32);
			pstmt.executeUpdate();
			System.out.println("first record done");
			
			pstmt.setInt(1,2);
			pstmt.setString(2, "Aakash");
			pstmt.setDouble(3, 55.78);
			pstmt.executeUpdate();
			System.out.println("second record done");
			
			pstmt.setInt(1,3);
			pstmt.setString(2, "Adil");
			pstmt.setDouble(3, 40.89);
			pstmt.executeUpdate();
			System.out.println("third record done");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(con != null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("closed all the costly resources");
		
	}
	

}
