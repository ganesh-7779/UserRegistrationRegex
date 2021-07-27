/********************************************************************
 * Purpose : User Registration System needs to ensure all validations
 * are in place during the User Entry Using regex method.
 * @author Ganesh Gavhad
 * @version 1.0
 * Date : 28.7.2021
 ********************************************************************/
package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationRegex {
	//user1 is object userDetails Class 
	static UserDetails user1 = new UserDetails();
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * @getFirstNama is a method for validation user First name
	 * by using regex pattern matches method .
	 */
	public static void getFirstNama() {
		System.out.println("Enter First Name");
		String firstName = sc.next();
		boolean check = Pattern.matches("[A-Z]{1}+[a-z]{2,}", firstName);
		if(check) {
			user1.setFirstName(firstName);	// if check become true
										   //user first name will get added in user1 object
		}
		else {							// else user get instruction to type first name as per pattern
			System.out.println("First name start with Cap and has minimum 3 characters");
		}
	}

	public static void main(String[] args) {
		getFirstNama();
	}

}
