package com.greatlearning.service;

import java.util.*;
import com.greatlearning.model.Employee;

public class DriverClass {
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
		Employee e1=new Employee("Suryansh", "Srivastava");
		String department="";
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			department="Technical";
			break;
		case 2:
			department="Admin";
			break;
		case 3:
			department="HumanResourse";
			break;
		case 4:
			department="Legal";
			break;
		default:
			System.out.println("Invalid Input");
		}
		
		CredentialService credService=new CredentialService();
		String genEmail=credService.generateEmailAddress(e1.getFirstName(),e1.getLastName(),department);
		char[] password=credService.generatePassword();
		credService.showCredentials(e1,genEmail, password);
	}
}
