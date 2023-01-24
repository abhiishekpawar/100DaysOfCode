package jdbc_demo.loadApp;

import java.util.*;
import java.sql.*;

public class LoginValidation {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		java.sql.ResultSet rs = null;
		String sQuery = "select * from pentagon.student1 where id=? and name  = ?";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int uid = sc.nextInt();
		System.out.println("Enter name");
		String uname = sc.next();
		sc.close();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			pstmt = con.prepareStatement(sQuery);
			//System.out.println("query  pre compiled");
			//before executing set ph values
			pstmt.setInt(1, uid);
			pstmt.setString(2, uname);
			//System.out.println("setted value before execution");
			rs = pstmt.executeQuery();
			//System.out.println("query executed ");
			if(rs.next())
			{
				String username = rs.getString(3);
				System.out.println("the user name is "+" "+username);
			}else {
				System.out.println("invalid id/name");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally{
			if(con != null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
