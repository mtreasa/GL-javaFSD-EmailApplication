package com.gl.emailGeneration.service;

import java.util.Random;

import com.gl.javafsd.emailGeneration.Employee;

public class CredentialGenerator{
	private Employee employee; 
	public CredentialGenerator(Employee employee) {
	this.employee = employee;
			}

	public String generateEmailId(Employee employee) {
		
		String dept =  getdepShortName(employee);
		
		String generatedEmailId =   employee.getFirstname().toLowerCase() +  "."
				           + employee.getLastname().toLowerCase() + "@"
				           + dept + ".gl.com";
		return generatedEmailId;
		
	}
	private String getdepShortName(Employee employee) {
	
		int department = employee.getDepartment();
		String depShort = null;
	switch(department){
	case 1:
	depShort = "tech";
	break;
	case 2:
	depShort = "admn";
	break;
	case 3:
	depShort = "hr";
	break;
	case 4:
	depShort = "lgl";
	break;
	}
		
	return depShort;
		
	}
	
	public void showCredentials(String generatedEmailId, char[] password) {
		System.out.println("Dear " + employee.getFirstname() + "," );
		System.out.println("Your Generated Credentials are as follows");
		System.out.println("Email id: " + generatedEmailId );
		System.out.println("password: "+ password);
		
	}
    public char[] generatePassword() {
    	String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		char[] password = new char[8];
		String allCharacters =  capitalLetters + smallLetters + 
				                numbers + specialCharacters; 
		Random objRandom = new Random();
		for(int i=0; i<8; i++) {
			int boundvalue = allCharacters.length();
			int randomIndex = objRandom.nextInt(boundvalue);
			char randomChar = allCharacters.charAt(randomIndex);
			password[i] = randomChar; 
				}
		
    	  	return password;
    }
}
		
	

