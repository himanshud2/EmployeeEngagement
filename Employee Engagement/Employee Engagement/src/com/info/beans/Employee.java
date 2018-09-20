package com.info.beans;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Employee {
	
	int empId;
	String fullName;
	double phoneNumber;
	String loginId;
	String password;
	String managerName;
	String projectName;
	Date dob;
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", loginId="
				+ loginId + ", password=" + password + ", managerName=" + managerName + ", projectName=" + projectName
				+ ", dob=" + dob + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public double getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Employee(int empId, String fullName, double phoneNumber, String loginId, String password, String managerName,
			String projectName, Date dob) {
		super();
		this.empId = empId;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.loginId = loginId;
		this.password = password;
		this.managerName = managerName;
		this.projectName = projectName;
		this.dob = dob;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	

}
