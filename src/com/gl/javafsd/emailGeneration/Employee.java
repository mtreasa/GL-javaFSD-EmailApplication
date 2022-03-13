package com.gl.javafsd.emailGeneration;

public class Employee {
	
	private String firstname;
	private String lastname;
	private int department;
	

	public Employee(String firstname, String lastname, int department ){
	this.firstname = firstname;
    this.lastname = lastname;
	this.department = department; 	
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	
}
