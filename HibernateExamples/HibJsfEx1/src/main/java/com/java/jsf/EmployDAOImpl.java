package com.java.jsf;

import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class EmployDAOImpl{

	SessionFactory sf;
	Session session;
	
	private String localCode;
	
	public String getLocalCode() {
		return localCode;
	}

	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}

	public void employLocalecodeChanged(ValueChangeEvent e) {
		//assign new value to local code
		this.localCode = e.getNewValue().toString();
		
	}
	
// method to print the name only i.e. List of Strings ----------------------------------------------------------------
	
		public List<String> getNames(){
			sf = SessionHelper.getIntance();
			//sf = SessionHelper.getConnection(); // act as connection helper
			session = sf.openSession();
			Criteria cr = session.createCriteria(Employ.class);
			Projection projection = Projections.property("name");  // no sql required = jst to get the name
			cr.setProjection(projection);
			List<String> list = cr.list();
			return list;	
		}
		
//method to print the Department only i.e. List of Strings ----------------------------------------------------------------

		public List<String> getDepartments(){
			sf = SessionHelper.getIntance();
		//	sf = SessionHelper.getConnection(); // act as connection helper
			session = sf.openSession();
			Criteria cr = session.createCriteria(Employ.class);
			Projection projection = Projections.distinct(Projections.property("dept")); // to remove duplicate departments distinct is used
			cr.setProjection(projection);
			List<String> list = cr.list();
			return list;	
			
		}


//method to find employ info in the particular Department i.e. List of Employ----------------------------------------------------------------

		public List<Employ> getEmployListByDept(String dept){
			sf = SessionHelper.getIntance();
		//	sf = SessionHelper.getConnection(); // act as connection helper
			session = sf.openSession();
			Criteria cr = session.createCriteria(Employ.class);
			cr.add(Restrictions.eq("dept",dept));
			List<Employ> employList = cr.list();
			return employList;
		}
		
		public List<Employ> showEmployDao(){
			sf = SessionHelper.getIntance();
		//	sf = SessionHelper.getConnection(); // act as connection helper
			session = sf.openSession();
			Criteria cr = session.createCriteria(Employ.class);
			return cr.list();
			
		}
		
		public String validateMe(Login login) {
			sf = SessionHelper.getIntance();
			String encr = EncryptPassword.getCode(login.getPassWord());
			Map<String,Object> sessionMap = 
					
					FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		//	sf = SessionHelper.getConnection(); // act as connection helper
			session = sf.openSession();
			Criteria cr = session.createCriteria(Login.class);
			cr.add(Restrictions.eq("userName",login.getUserName()));
			cr.add(Restrictions.eq("passWord",encr.trim()));
			cr.setProjection(Projections.rowCount());
			
			long count = (Long)cr.uniqueResult();
			if(count==1) {
				session.close();
				//session = sf.openSession();
				return "ShowDept.xhtml?faces-redirect=true";
			}else {
				sessionMap.put("errorMessage","Invalid Credentials");
				return "Login.xhtml?faces-redirect=true";
			}
		}
}