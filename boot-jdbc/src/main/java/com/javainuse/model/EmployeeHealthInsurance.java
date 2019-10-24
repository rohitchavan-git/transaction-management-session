package com.javainuse.model;

public class EmployeeHealthInsurance {
	
	private String empId;
	private String healthInsuranceSchemeName;
	private int coverageAmount;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getHealthInsuranceSchemeName() {
		return healthInsuranceSchemeName;
	}
	public void setHealthInsuranceSchemeName(String healthInsuranceSchemeName) {
		this.healthInsuranceSchemeName = healthInsuranceSchemeName;
	}
	public int getCoverageAmount() {
		return coverageAmount;
	}
	public void setCoverageAmount(int coverageAmount) {
		this.coverageAmount = coverageAmount;
	}

}
