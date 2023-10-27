package com.java.login;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class LoginController {
	
	private Login login;
	
	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}




	public String validate() {
		
		FacesContext context = FacesContext.getCurrentInstance();
		if(login.getUserName().length() <= 5) {
			context.addMessage(null, new FacesMessage(
					FacesMessage.SEVERITY_ERROR,
					"UserName contains min 6 characters",null));
		}else if(login.getPassCode().length() <= 5) {
			context.addMessage(null, new FacesMessage(
					FacesMessage.SEVERITY_ERROR,
					"Password contains min 6 characters",null));
		}else {
			LoginValidate logV = new LoginValidate();
			return logV.validate(login);
		}
		return null;
	}
}
