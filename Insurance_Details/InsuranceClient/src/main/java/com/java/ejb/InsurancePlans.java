package com.java.ejb;

import java.io.Serializable;

public class InsurancePlans implements Serializable {

	private int planId;
	private String insuranceId;
	private double premiumAmount;
	private double covAmount;
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public String getInsuranceId() {
		return insuranceId;
	}
	public void setInsuranceId(String insuranceId) {
		this.insuranceId = insuranceId;
	}
	public double getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public double getCovAmount() {
		return covAmount;
	}
	public void setCovAmount(double covAmount) {
		this.covAmount = covAmount;
	}
	
	
}
