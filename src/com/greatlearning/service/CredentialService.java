package com.greatlearning.service;

import java.util.Random;
import com.greatlearning.model.Employee;

public class CredentialService {
	public char[] generatePassword()
	{
            String upperCase= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String lowerCase= "abcdefghijklmnopqrstuvwxyz";
	    String specialChar= "!@#$";
	    String digits = "1234567890";
	    String comboVal=upperCase+lowerCase+specialChar+digits;
	    Random random = new Random();
	    char[] password = new char[8];
	    password[0] = lowerCase.charAt(random.nextInt(lowerCase.length()));
	    password[1] = upperCase.charAt(random.nextInt(upperCase.length()));
	    password[2] = specialChar.charAt(random.nextInt(specialChar.length()));
	    password[3] = digits.charAt(random.nextInt(digits.length())); 
	    for(int x = 4; x<8 ; x++) 
	    {
	       password[x] = comboVal.charAt(random.nextInt(comboVal.length()));
	    }
        return password;
	}
	public String generateEmailAddress(String firstName, String lastName, String department)
	{
		String email=firstName.toLowerCase()+lastName.toLowerCase()+"@"+department.toLowerCase()+".greatlearning.com";
		return email;
	}
	public void showCredentials(Employee employee,String email, char pass[])
	{
		System.out.println(employee.getFirstName()+" your generated credentials are as follows:");
		System.out.println("Email     ---> "+email);
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Password  ---> ");
		stringBuilder.append(pass);
		System.out.println(stringBuilder.toString());
	}
}
