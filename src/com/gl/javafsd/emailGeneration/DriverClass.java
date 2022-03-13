package com.gl.javafsd.emailGeneration;
 
import com.gl.javafsd.emailGeneration.Employee;
import com.gl.javafsd.emailGeneration.service.CredentialGenerator;
import com.gl.javafsd.emailGeneration.ui.EmailApplicationUi;

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
