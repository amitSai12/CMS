package com.java.jsf;

import java.util.HashMap;
import java.util.Map;

import org.apache.catalina.ha.session.SessionMessage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.java.jsf.SessionHelper;

public class PatientImpl implements PatientDAO{
	
	SessionFactory sf;
	Session session;

	@Override
	public String addPatientDao(PatientMaster patient) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(patient);
		trans.commit();
		
		return "Message.jsp?faces-redirect=true";
	}

}
