package com.java.jsf;

import javax.faces.event.ActionEvent;

public class Calculation {

	private int firstNo;
	private int secondNo;
	private int result;
	
	public int getFirstNo() {
		return firstNo;
	}
	public void setFirstNo(int firstNo) {
		this.firstNo = firstNo;
	}
	public int getSecondNo() {
		return secondNo;
	}
	public void setSecondNo(int secondNo) {
		this.secondNo = secondNo;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public Calculation(int firstNo, int secondNo, int result) {
		super();
		this.firstNo = firstNo;
		this.secondNo = secondNo;
		this.result = result;
	}
	public Calculation() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Calculation [firstNo=" + firstNo + ", secondNo=" + secondNo + ", result=" + result + "]";
	}
	
	public void addition(ActionEvent evt) {
		this.result = this.firstNo + this.secondNo;
	}
	public void substraction(ActionEvent evt) {
		this.result = this.firstNo - this.secondNo;
	}
	public void multiplication(ActionEvent evt) {
		this.result = this.firstNo * this.secondNo;
	}
}
