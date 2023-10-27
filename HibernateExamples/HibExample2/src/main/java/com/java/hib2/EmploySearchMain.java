package com.java.hib2;

import java.util.Scanner;

public class EmploySearchMain {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee Number");
		int empno = sc.nextInt();
		
		EmployDAO dao = new EmployDAOImpl();
		Employ employ  = dao.searchEmployDao(empno);
		
		if(employ!=null) {
			System.out.println(employ);
		}
		
	}
}
