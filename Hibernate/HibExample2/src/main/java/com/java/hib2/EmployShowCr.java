package com.java.hib2;

import java.util.List;

public class EmployShowCr {

	public static void main(String[] args) {
		EmployDAOImpl dao = new EmployDAOImpl();
		List<Employ> employList = dao.showEmployCr();
		System.out.println(employList);
	}
}
