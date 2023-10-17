package com.java.jsf;

import java.util.Map;

import javax.faces.context.FacesContext;

public class LoginValidate {
	
	public String validate(Login login) {
		
		Map<String,Object> sessionMap = 
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("error","");
		if(login.getUserName().equals("infinite") && login.getPassCode().equals("infinite")) {
		return "Menu.xhtml?faces-redirect=true";
			
		}else {
			sessionMap.put("error", "Invalid Credentials");
		return "Login.xhtml?faces-redirect=true";
		}
	}
}
