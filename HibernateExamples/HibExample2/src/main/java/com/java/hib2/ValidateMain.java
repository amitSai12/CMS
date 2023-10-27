package com.java.hib2;

public class ValidateMain {

	public static void main(String[] args) {
		Login log = new Login();
		log.setUserName("ariz");
		log.setPassCode("mg");
		
		long count = new LoginDAOImpl().loginValidate(log);
		if(count==1) {
			System.out.println("Correct");
		}else {
			System.out.println("Incorrect");
		}
		
	}
}
		
//		Login log = new Login();
//		log.setUserName("ariz");
//		log.setPassCode("mg");
//		
//		Login login = new LoginDAOImpl().autheinticate(log);
//		if(login!=null) {
//			System.out.println("Correct");
//		}else {
//			System.out.println("Invalid");
//		}
//	}

