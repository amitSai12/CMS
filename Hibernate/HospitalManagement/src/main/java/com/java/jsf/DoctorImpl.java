package com.java.jsf;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.java.jsf.DoctorMaster;
import com.java.jsf.SessionHelper;

public class DoctorImpl implements DoctorDAO{

	SessionFactory sf;
	Session session;
	
	@Override
	public List<DoctorMaster> showDoctorDao() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria criteria = session.createCriteria(DoctorMaster.class);
		List<DoctorMaster> doctorsList = criteria.list();
		return doctorsList;
	}

}
