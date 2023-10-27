package com.java.hib2;

import java.util.Scanner;

import com.java.hib2.Employ;
import com.java.hib2.Gender;

public class EmployAddMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employ employ  = new Employ();
		
		System.out.println("Enter Employ Number ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Employ Name ");
		employ.setName(sc.next());
		System.out.println("Enter Gender MALE/FEMALE ");
		employ.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter Department ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic ");
		employ.setBasic(sc.nextDouble());
		
		EmployDAO dao = new EmployDAOImpl();
		System.out.println(dao.addEmployDao(employ));
	}
}
