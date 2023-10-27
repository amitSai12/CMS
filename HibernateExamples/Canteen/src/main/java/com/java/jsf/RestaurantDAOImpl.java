package com.java.jsf;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

//import org.hibernate.Criteria;
//import org.hibernate.Query;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//
//import com.java.jsf.Restaurant;
//import com.java.jsf.SessionHelper;

public class RestaurantDAOImpl {
	
	SessionFactory sf;
	Session session;
	 
	public List<Restaurant> showRestaurantDao(){
		sf= SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Restaurant.class);
		return cr.list();		
	}
	

}
