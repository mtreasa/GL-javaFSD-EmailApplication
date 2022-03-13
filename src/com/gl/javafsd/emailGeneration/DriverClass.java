package com.gl.javafsd.emailGeneration;
 
import com.gl.emailGeneration.service.CredentialGenerator;
import com.gl.javafsd.emailGeneration.Employee;
import com.gl.javafsd.ui.EmailApplicationUi;
//import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailApplicationUi objApp = new EmailApplicationUi();
		Employee employee = objApp.DepartmentInput(); 
					CredentialGenerator objCredGenerator = new CredentialGenerator(employee); 
			String EmailId =  objCredGenerator.generateEmailId(employee);
			char[] password = new char[8];
			password = objCredGenerator.generatePassword();
			objCredGenerator.showCredentials(EmailId, password);
	}

}
