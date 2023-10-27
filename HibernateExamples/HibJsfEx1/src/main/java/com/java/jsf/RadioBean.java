package com.java.jsf;

import javax.faces.event.ValueChangeEvent;

public class RadioBean {

	private String radioValues;
	private String radioText;
	private String gen;
	
	public String getRadioValues() {
		return radioValues;
	}
	public void setRadioValues(String radioValues) {
		this.radioValues = radioValues;
	}
	public String getRadioText() {
		return radioText;
	}
	public void setRadioText(String radioText) {
		this.radioText = radioText;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	
	
	public Gender[] getGender() {
		return Gender.values();
	}
	
	public void radioChanged(ValueChangeEvent e) {
		//assign new value to localCode
		this.gen = e.getNewValue().toString();
	}
}
