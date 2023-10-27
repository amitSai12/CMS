package com.java.hib2;

import java.util.Scanner;

public class EmployDeleteMain {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Employee Number");
			int empno = sc.nextInt();
			
			EmployDAO dao = new EmployDAOImpl();
			System.out.println(dao.deleteEmployDao(empno));
		}
}
