package com.java.manager;

import java.util.List;

public interface PatientDAO {
	
	List<Patient_Enrollment> showPatient();
	
	
	List<Patient_Enrollment> searchPatient(String uhId, String firstName, String userName);

}