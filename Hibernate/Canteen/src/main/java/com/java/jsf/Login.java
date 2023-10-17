package com.java.jsf;

public class Login {
	
	private String userName;
	private String passWord;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}
	@Override
	public String toString() {
		return "Login [userName=" + userName + ", passWord=" + passWord + "]";
	}
	
	

}
