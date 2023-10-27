package com.java.test;

public class Restaurant {

	private int restaurantId;
	private String restaurantName;
	private String Branch;
	private String city;
	private String mobileNo;
	private String email;
	private String varchar;
	
	
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getVarchar() {
		return varchar;
	}
	public void setVarchar(String varchar) {
		this.varchar = varchar;
	}
	public Restaurant(int restaurantId, String restaurantName, String branch, String city, String mobileNo,
			String email, String varchar) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		Branch = branch;
		this.city = city;
		this.mobileNo = mobileNo;
		this.email = email;
		this.varchar = varchar;
	}
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", Branch=" + Branch
				+ ", city=" + city + ", mobileNo=" + mobileNo + ", email=" + email + ", varchar=" + varchar + "]";
	}
	
	
}
