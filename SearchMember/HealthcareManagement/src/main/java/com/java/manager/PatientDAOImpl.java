package com.java.manager;

import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class PatientDAOImpl implements PatientDAO{

	SessionFactory sf;
	Session session;
	
private String localCode;
	
	public String getLocalCode() {
		return localCode;
	}
	public void setLocalCode(String localCode) {
		this.localCode = localCode;
	}
	
	public void employLocalCodeChanged(ValueChangeEvent e) {
		this.localCode = e.getNewValue().toString();
	}
	
	@Override
	public List<Patient_Enrollment> showPatient() {
		
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria cr = session.createCriteria(Patient_Enrollment.class);
		return cr.list();
	}
	@Override
	public List<Patient_Enrollment> searchPatient(String uhId, String firstName, String userName) {
		System.out.println("Uhid  " +uhId);
		System.out.println("First Name  " +firstName);
		System.out.println("User Name  " +userName);
		 sf = SessionHelper.getConnection();
         session = sf.openSession();
        Map<String,Object> sessionMap = 
        		FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
        
        Criteria criteria = session.createCriteria(Patient_Enrollment.class);
       
        if (uhId.length() > 0) {
        	System.out.println("Hi");
        	criteria.add(Restrictions.ilike("uhId", "%" + uhId + "%")); 
            sessionMap.put("uhId",uhId );
        }
        if (firstName.length() > 0) {
        	System.out.println("Hello");
        	criteria.add(Restrictions.ilike("firstName", "%" + firstName + "%")); 	
            sessionMap.put("firstName",firstName);
        }
        if (userName.length() > 0) {
        	System.out.println("Test");
        	criteria.add(Restrictions.ilike("userName", "%" + userName + "%")); 
        	sessionMap.put("userName",userName);
        }
       
        List<Patient_Enrollment> patientList = criteria.list();
        return patientList;
//        System.out.println(patientList);
//        sessionMap.put("patientList ", patientList);
//        return "PatientSearchShow.jsp?faces-redirect=true";
	}
	
	
	
	
// UserName---------------------------------------------------------------------------------
	/*
	 * public List<Patient_Enrollment> getUserNameLists(String userName){
	 * Map<String, Object> sessionMap =
	 * FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
	 * SessionFactory sf = SessionHelper.getConnection(); Session session =
	 * sf.openSession(); Criteria cr =
	 * session.createCriteria(Patient_Enrollment.class);
	 * 
	 * if (userName != null && !userName.isEmpty()) { // Use the "like" operator to
	 * match any character in the firstName cr.add(Restrictions.ilike("userName",
	 * "%" + userName + "%")); }
	 * 
	 * 
	 * System.out.println("userName: "+userName); List<Patient_Enrollment>
	 * patientList = cr.list(); sessionMap.put("patientList",patientList);
	 * System.out.println(patientList); return patientList; }
	 * 
	 * //---------------------------------------------------------------------------
	 * ----------------
	 * 
	 * //
	 * FirstName--------------------------------------------------------------------
	 * -------------
	 * 
	 * 
	 * public List<Patient_Enrollment> getFirstNameLists(String firstName){
	 * Map<String, Object> sessionMap =
	 * FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
	 * SessionFactory sf = SessionHelper.getConnection(); Session session =
	 * sf.openSession(); Criteria cr =
	 * session.createCriteria(Patient_Enrollment.class);
	 * 
	 * if (firstName != null && !firstName.isEmpty()) { // Use the "like" operator
	 * to match any character in the firstName
	 * cr.add(Restrictions.ilike("firstName", "%" + firstName + "%")); }
	 * 
	 * 
	 * System.out.println("firstName: "+firstName); List<Patient_Enrollment>
	 * patientList = cr.list(); sessionMap.put("patientList",patientList);
	 * System.out.println(patientList); return patientList; }
	 * 
	 * //---------------------------------------------------------------------------
	 * -----------
	 * 
	 * //
	 * UhId-------------------------------------------------------------------------
	 * --------
	 * 
	 * public List<Patient_Enrollment> getUhIdLists(String uhId){ Map<String,
	 * Object> sessionMap =
	 * FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
	 * SessionFactory sf = SessionHelper.getConnection(); Session session =
	 * sf.openSession(); Criteria cr =
	 * session.createCriteria(Patient_Enrollment.class);
	 * 
	 * if (uhId != null && !uhId.isEmpty()) { // Use the "like" operator to match
	 * any character in the firstName cr.add(Restrictions.ilike("uhId", "%" + uhId +
	 * "%")); }
	 * 
	 * 
	 * System.out.println("uhId: "+uhId); List<Patient_Enrollment> patientList =
	 * cr.list(); sessionMap.put("patientList",patientList);
	 * System.out.println(patientList); return patientList; }
	 */
	
//--------------------------------------------------------------------------------------
	
}