package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployDelete {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employ number ");
		int empno = sc.nextInt() ;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection  =
					DriverManager.getConnection("jdbc:mysql://localhost:3306/infinite_august23","root","Amitsai@123");
			String cmd = "Delete from Employ where empno = ?";
			PreparedStatement pst  = connection.prepareStatement(cmd);
			pst.setInt(1, empno);
			pst.executeUpdate();
			System.out.println("***Record Deleted***");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
