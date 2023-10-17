package com.java.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class MenuDAO {
	
SessionFactory sf ;
Session session;


public List<Restaurant> showRestaurantDao(){
	SessionFactory sf = SessionHelper.getConnection();
	Session session = sf.openSession();
	Criteria cr = session.createCriteria(Restaurant.class);
	return cr.list();
}

public List<String> getMenu(){
	sf = SessionHelper.getConnection();
	session = sf.openSession();
	Criteria cr = session.createCriteria(Restaurant.class);
	Projection projection = Projections.distinct(Projections.property("restaurantName"));
	cr.setProjection(projection);
	List<String> list = cr.list();
	return list;
	}
}
