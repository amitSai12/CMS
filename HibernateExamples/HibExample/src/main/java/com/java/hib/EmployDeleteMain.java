package com.java.hib;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployDeleteMain {

	public static void main(String[] args) {
		
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee number");
		empno = sc.nextInt();
		
		
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session  = sf.openSession();
		
		Query query  = session.createQuery("from Employ where empno="+empno);
		List<Employ> employList = query.list();
		
		if(employList.size()>0) {
			Employ employ = employList.get(0);
			Transaction transaction = session.beginTransaction();
			session.delete(employ);
			transaction.commit();
			System.out.println("****Record Deleted****");
		}else {
			System.out.println("****Employ not Found!****");
		}
	}
}
