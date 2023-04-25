package com.emp.data.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Emplyoee")
public class Employee {
	
	@Id
	private int employeeId;
	private String employeeName;
	private int salary;
	private int experience;
	
	public Employee(int employeeId, String employeeName, int salary, int experience) {
	
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.experience = experience;
	}
	public Employee() {
		
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public  String getEmployeeName() {
		
			return employeeName;
		
		
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", experience=" + experience + "]";
	}

	/*
	 * public static String getId() {
	 * 
	 * return null; }
	 */
	
	
	


}
