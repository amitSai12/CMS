package com.java.jsf;

public class Wallet {
		
	private int cusId;
	private int walId;
	private double walAmount;
	private String walSource;
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public int getWalId() {
		return walId;
	}
	public void setWalId(int walId) {
		this.walId = walId;
	}
	public double getWalAmount() {
		return walAmount;
	}
	public void setWalAmount(double walAmount) {
		this.walAmount = walAmount;
	}
	public String getWalSource() {
		return walSource;
	}
	public void setWalSource(String walSource) {
		this.walSource = walSource;
	}
	public Wallet(int cusId, int walId, double walAmount, String walSource) {
		super();
		this.cusId = cusId;
		this.walId = walId;
		this.walAmount = walAmount;
		this.walSource = walSource;
	}
	@Override
	public String toString() {
		return "Wallet [cusId=" + cusId + ", walId=" + walId + ", walAmount=" + walAmount + ", walSource=" + walSource
				+ "]";
	}
	public Wallet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
