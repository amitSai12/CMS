package com.java.ejb;

public class CustomerPolicy {
	
	private int policyId;
	private int custId;
	private String insuranceId;
	private double insuranceAmount;
	private String payMode;
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getInsuranceId() {
		return insuranceId;
	}
	public void setInsuranceId(String insuranceId) {
		this.insuranceId = insuranceId;
	}
	public double getInsuranceAmount() {
		return insuranceAmount;
	}
	public void setInsuranceAmount(double insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}
	public String getPayMode() {
		return payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}
	public CustomerPolicy(int policyId, int custId, String insuranceId, double insuranceAmount, String payMode) {
		super();
		this.policyId = policyId;
		this.custId = custId;
		this.insuranceId = insuranceId;
		this.insuranceAmount = insuranceAmount;
		this.payMode = payMode;
	}
	public CustomerPolicy() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CustomerPolicy [policyId=" + policyId + ", custId=" + custId + ", insuranceId=" + insuranceId
				+ ", insuranceAmount=" + insuranceAmount + ", payMode=" + payMode + "]";
	}
	
	

}
