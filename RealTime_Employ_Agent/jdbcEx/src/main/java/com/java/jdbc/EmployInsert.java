package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployInsert {

	public static void main(String[] args) {
		int empno;
		double basic;
		String name, gender, dept, desig;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employ Number ");
		empno = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Name ");
		name = sc.nextLine();
		System.out.println("Enter gender MALE/FEMALE");
		gender = sc.nextLine();
		System.out.println("Enter Department");
		dept = sc.nextLine();
		System.out.println("Enter Designation");
		desig = sc.nextLine();
		System.out.println("Enter Basic");
		basic = Double.parseDouble(sc.nextLine());
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection  =
					DriverManager.getConnection("jdbc:mysql://localhost:3306/infinite_august23","root","Amitsai@123");
			String cmd = "Insert into Employ(Empno, name, gender, dept, desig,basic)"+"values(?,?,?,?,?,?)";
			PreparedStatement pst = connection.prepareStatement(cmd);
			pst.setInt(1,empno);
			pst.setString(2,name);
			pst.setString(3,gender);
			pst.setString(4, dept);
			pst.setString(5,desig );
			pst.setDouble(6, basic);
			pst.executeUpdate();
			System.out.println("***Record Inserted***");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
