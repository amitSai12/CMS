package com.java.inf;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class StoreDataNew {

	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		Question question1 = new Question();
		question1.setId(1);
		question1.setQname("What is Java");
		
		Answer ans1 = new Answer();
		ans1.setId(1);
		ans1.setAnswername("Java is Object Oriented Programming Language...");
		ans1.setPostedBy("Jitendra");
		
		Answer ans2 = new Answer();
		ans2.setId(1);
		ans2.setAnswername("Java is Simple and Robust application Programming Language...");
		ans2.setPostedBy("Rohan");
		
		List<Answer> answerList1 = new ArrayList<Answer>();
		answerList1.add(ans1);
		answerList1.add(ans2);
		question1.setAnswers(answerList1);
	}
}
