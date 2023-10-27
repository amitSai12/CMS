package com.java.hib2;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class EmployDAOImpl implements EmployDAO{

	SessionFactory sf;
	Session session;
	
	
	public List<Employ> showEmployCr(){
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		
		cr.addOrder(Order.asc("basic"));
		List<Employ> employList = cr.list();
		return employList;
		
	}
	public Employ searchEmployCr(int empno){
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		
		cr.add(Restrictions.eq("empno",empno));
		List<Employ> employList = cr.list();
		Employ employ = (Employ)cr.uniqueResult();
		return employ;
		
	}
	
	
	@Override
	public List<Employ> showEmployDao() {
		
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Query query = session.createQuery("from Employ");
		List<Employ> employList = query.list();
		return employList;
	}
	
	
	@Override
	public Employ searchEmployDao(int empno) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		
		cr.add(Restrictions.eq("empno",empno));
		List<Employ> employList = cr.list();
		Employ employ = (Employ)cr.uniqueResult();
		return employ;
	}


	@Override
	public String addEmployDao(Employ employ) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction trans =session.beginTransaction();
		session.save(employ);
		trans.commit();
		
		return "Employ Record Inserted...";
	}


	@Override
	public String deleteEmployDao(int empno) {
		Employ employFound = searchEmployDao(empno);
		System.out.println(employFound);
		sf = SessionHelper.getConnection();
		if(employFound!=null) {
		session = sf.openSession();
		Transaction trans =session.beginTransaction();
		session.delete(employFound);
		trans.commit();
		return "Employ Record Deleted ...";
		}
		return "Record not Found...";
	}
	

}
