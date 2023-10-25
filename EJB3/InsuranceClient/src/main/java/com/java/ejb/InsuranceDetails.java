package com.java.ejb;
import java.sql.Date;


public class InsuranceDetails{
	


private String insuranceId;

private String insuranceName;


private String insuranceType;


private String premiumStart;


private String premiumEnd;


private String minPeriod;


private String maxPeriod;


private Date launchDate;


private String status;

public String getInsuranceId() {
	return insuranceId;
}
public void setInsuranceId(String insuranceId) {
	this.insuranceId = insuranceId;
}
public String getInsuranceName() {
	return insuranceName;
}
public void setInsuranceName(String insuranceName) {
	this.insuranceName = insuranceName;
}
public String getInsuranceType() {
	return insuranceType;
}
public void setInsuranceType(String insuranceType) {
	this.insuranceType = insuranceType;
}
public String getPremiumStart() {
	return premiumStart;
}
public void setPremiumStart(String premiumStart) {
	this.premiumStart = premiumStart;
}
public String getPremiumEnd() {
	return premiumEnd;
}
public void setPremiumEnd(String premiumEnd) {
	this.premiumEnd = premiumEnd;
}
public String getMinPeriod() {
	return minPeriod;
}
public void setMinPeriod(String minPeriod) {
	this.minPeriod = minPeriod;
}
public String getMaxPeriod() {
	return maxPeriod;
}
public void setMaxPeriod(String maxPeriod) {
	this.maxPeriod = maxPeriod;
}
public Date getLaunchDate() {
	return launchDate;
}
public void setLaunchDate(Date launchDate) {
	this.launchDate = launchDate;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public InsuranceDetails(String insuranceId, String insuranceName, String insuranceType, String premiumStart,
		String premiumEnd, String minPeriod, String maxPeriod, Date launchDate, String status) {
	super();
	this.insuranceId = insuranceId;
	this.insuranceName = insuranceName;
	this.insuranceType = insuranceType;
	this.premiumStart = premiumStart;
	this.premiumEnd = premiumEnd;
	this.minPeriod = minPeriod;
	this.maxPeriod = maxPeriod;
	this.launchDate = launchDate;
	this.status = status;
}
public InsuranceDetails() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "InsuranceDetails [insuranceId=" + insuranceId + ", insuranceName=" + insuranceName + ", insuranceType="
			+ insuranceType + ", premiumStart=" + premiumStart + ", premiumEnd=" + premiumEnd + ", minPeriod="
			+ minPeriod + ", maxPeriod=" + maxPeriod + ", launchDate=" + launchDate + ", status=" + status + "]";
}



}
