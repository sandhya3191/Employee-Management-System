package com.springex.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer employeeId;
	
	private String employeeName; 
	
	private String employeeContactNumber;
	
	private String employeeAddress;
	
	private String employeeSkills;
	
	private String employeeGender;
	
	private String employeeDepartment;
	
	public Employee() {
		
	}
	
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	
	
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeContactNumber() {
		return employeeContactNumber;
	}
	
	
	public void setEmployeeContactNumber(String employeeContactNumber) {
		this.employeeContactNumber = employeeContactNumber;
	}
	
	
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	
	
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	
	
	public String getEmployeeSkills() {
		return employeeSkills;
	}
	
	
	public void setEmployeeSkills(String employeeSkills) {
		this.employeeSkills = employeeSkills;
	}
	
	
	public String getEmployeeGender() {
		return employeeGender;
	}
	
	
	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}
	
	
	public String getEmployeeDepartment() {
		
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	

}
