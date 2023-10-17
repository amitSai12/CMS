package com.java.hib2;

public interface LoginDAO {
	
	String addUser(Login login);
	
	Login autheinticate(Login login);
	
	long loginValidate(Login login);

}
