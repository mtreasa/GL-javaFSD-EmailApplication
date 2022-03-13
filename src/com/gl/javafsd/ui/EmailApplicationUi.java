package com.gl.javafsd.ui;

import java.util.Scanner;

//import org.w3c.dom.css.CSSImportRule;

import com.gl.javafsd.emailGeneration.Employee;


public class EmailApplicationUi {

//Employee employee = DepartmentInput();
	public Employee DepartmentInput() {
			String firstname;
		String lastname;
		// First name 		
		System.out.println("Please enter your first name");
		Scanner sc1 = new Scanner(System.in);
		firstname = sc1.nextLine();
		
		// last name 
		System.out.println("Please enter your last name");
		lastname = sc1.nextLine();
	
		// Department
		System.out.println("Please enter the department(1/2/3/4) from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

			    int department = sc1.nextInt();
			sc1.close();
					
		Employee employee = new Employee(firstname, lastname, department);
		return employee;
	}
}
