package com.java.ejb;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class InsuranceDAOImpl implements InsuranceDAO {

	SessionFactory sf;
	Session session;
	
	@Override
	public List<InsuranceDetails> showInsurance() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(InsuranceDetails.class);
		return cr.list();
	}
	
	public List<InsurancePlans> showInsurancePlans() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(InsurancePlans.class);
		return cr.list();

}
	
	public List<InsuranceDetails> showInsuranceDao(int firstRow, int rowCount) {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(InsuranceDetails.class);
		cr.setFirstResult(firstRow);
		cr.setMaxResults(rowCount);
		System.out.println(firstRow);
		System.out.println(rowCount);
		System.out.println(cr.list());
		return cr.list();
	}
	
	public List<InsuranceDetails> getListOfInsurance(int firstRow, int rowCount) {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		List<Customer> cdList = null;
			session.beginTransaction();
			Criteria criteria = session.createCriteria(InsuranceDetails.class);
			criteria.setFirstResult(firstRow);
			criteria.setMaxResults(rowCount);
		return criteria.list();
	}

	public int countRows() {
		SessionFactory sf = SessionHelper.getConnection();
		Session session = sf.openSession();
		try {
			session.beginTransaction();
			Criteria criteria = session.createCriteria(InsuranceDetails.class);
			if (criteria != null) {
				return criteria.list().size();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
	
}
