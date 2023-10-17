package com.java.jsf;

public class Customer {
	
	private int cusId;
	private String cudName;
	private String cusPhoneNo;
	private String cusUsername;
	private String cusPassword;
	private String cusEmail;
	
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCudName() {
		return cudName;
	}
	public void setCudName(String cudName) {
		this.cudName = cudName;
	}
	public String getCusPhoneNo() {
		return cusPhoneNo;
	}
	public void setCusPhoneNo(String cusPhoneNo) {
		this.cusPhoneNo = cusPhoneNo;
	}
	public String getCusUsername() {
		return cusUsername;
	}
	public void setCusUsername(String cusUsername) {
		this.cusUsername = cusUsername;
	}
	public String getCusPassword() {
		return cusPassword;
	}
	public void setCusPassword(String cusPassword) {
		this.cusPassword = cusPassword;
	}
	public String getCusEmail() {
		return cusEmail;
	}
	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}
	public Customer(int cusId, String cudName, String cusPhoneNo, String cusUsername, String cusPassword,
			String cusEmail) {
		super();
		this.cusId = cusId;
		this.cudName = cudName;
		this.cusPhoneNo = cusPhoneNo;
		this.cusUsername = cusUsername;
		this.cusPassword = cusPassword;
		this.cusEmail = cusEmail;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cudName=" + cudName + ", cusPhoneNo=" + cusPhoneNo + ", cusUsername="
				+ cusUsername + ", cusPassword=" + cusPassword + ", cusEmail=" + cusEmail + "]";
	}
	
	

}
