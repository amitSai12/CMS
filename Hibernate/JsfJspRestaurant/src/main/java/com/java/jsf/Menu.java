package com.java.jsf;

public class Menu {
	
	private int menId;
	private String menItem;
	private String menPrice;
	private double menCalories;
	private String menSpeciality;
	
	
	@Override
	public String toString() {
		return "Menu [menId=" + menId + ", menItem=" + menItem + ", menPrice=" + menPrice + ", menCalories="
				+ menCalories + ", menSpeciality=" + menSpeciality + "]";
	}
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Menu(int menId, String menItem, String menPrice, double menCalories, String menSpeciality) {
		super();
		this.menId = menId;
		this.menItem = menItem;
		this.menPrice = menPrice;
		this.menCalories = menCalories;
		this.menSpeciality = menSpeciality;
	}
	public int getMenId() {
		return menId;
	}
	public void setMenId(int menId) {
		this.menId = menId;
	}
	public String getMenItem() {
		return menItem;
	}
	public void setMenItem(String menItem) {
		this.menItem = menItem;
	}
	public String getMenPrice() {
		return menPrice;
	}
	public void setMenPrice(String menPrice) {
		this.menPrice = menPrice;
	}
	public double getMenCalories() {
		return menCalories;
	}
	public void setMenCalories(double menCalories) {
		this.menCalories = menCalories;
	}
	public String getMenSpeciality() {
		return menSpeciality;
	}
	public void setMenSpeciality(String menSpeciality) {
		this.menSpeciality = menSpeciality;
	}
	

}
