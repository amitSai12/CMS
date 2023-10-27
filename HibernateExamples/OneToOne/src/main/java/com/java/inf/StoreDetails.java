package com.java.inf;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class StoreDetails {
	
	public static void main(String[] args) {
		
		SessionFactory factory = 
				new AnnotationConfiguration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setEmployeeId(100);
		e1.setName("Prasanna");
		e1.setEmail("prasanna.trainer@gmail.com");
		session.save(e1);
		
		Address a1 = new Address();
		a1.setAddressLine1("37-115/3,Shree Colony");
		a1.setCity("Hyderabad");
		a1.setState("TS");
		a1.setCountry("India");
		a1.setPincode("500046");
		
		e1.setAddress(a1);
		
		a1.setEmployee(e1);
		session.save(a1);
		t.commit();
		
		session.close();
		System.out.println("Success");
		
		
		
	}

}
