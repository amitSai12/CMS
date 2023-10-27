package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserAuth {
	
	public static void main(String[] args) {
		String user, pwd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		user = sc.next();
		System.out.println("Enter Password");
		pwd = sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection  = DriverManager.getConnection("jdbc:mysql://localhost:3306/infinite_august23","root","Amitsai@123");
			String cmd = "select count(*) cnt from Login where Username=?"+"AND Passcode=?";
			PreparedStatement pst = connection.prepareStatement(cmd);
			pst.setString(1, user);
			pst.setString(2, pwd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			
			int count = rs.getInt("cnt");
			if (count == 1) {
				System.out.println("Correct Credentials.....");
			}
			else {
				System.out.println("Invalid Credentials.....");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
