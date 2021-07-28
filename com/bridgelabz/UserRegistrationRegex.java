package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationRegex {
    // user1 is object userDetails Class
    static UserDetails user1 = new UserDetails();
    static Scanner sc = new Scanner(System.in);

    /**
     * getFirstName is a method for validation user First name by using regex
     * pattern matches method.
     */
    public static void getFirstName() {
        System.out.println("Enter First Name");
        String firstName = sc.next();
        boolean check = Pattern.matches("[A-Z]{1}+[a-z]{2,}", firstName);
        if (check) {
            user1.setFirstName(firstName); // if check become true
            // user first name will get added in user1 object
        } else {
            // else user get instruction to type first name as per pattern
            System.out.println("First name start with Cap and has minimum 3 characters");
            getFirstName();
        }
    }

    /**
     * getLastName is a method for validation user Last name by using regex
     * pattern matches method .
     */
    public static void getLastName() {
        System.out.println("Enter Last Name");
        String lastName = sc.next();
        boolean check = Pattern.matches("[A-Z]{1}+[a-z]{2,}", lastName);
        if (check) {
            user1.setFirstName(lastName); 	// if check become true
            // user last name will get added in user1 object
        } else {
            // else user get instruction to type last name as per pattern
            System.out.println("Last name start with Cap and has minimum 3 characters");
            getLastName();
        }
    }
    /**
     * Gets the email address from console
     * Checks if it matches our regex pattern
     * If it matches set the email of object user1 to entered email address
     * If not tells user to enter email address again
     */
    public static void getGmail() {
        System.out.println("Enter Gmail");
        String gmail = sc.next();
        boolean check = Pattern.matches("^[a-z0-9.+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$", gmail);
        if (check) {
            user1.setFirstName(gmail); 	// if check become true
            // user last name will get added in user1 object
        } else {
            // else user get instruction to type last name as per pattern
            System.out.println("Email invalid , enter correct email");
            getGmail();
        }
    }
    /**
     * Checks for the correct phone number
     * If correct assigns it to mobileNumber of object User
     */
    public static void getPhoneNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your phone number");
        String phone= sc.next();
        boolean check = Pattern.matches("^[1-9][0-9][1-9]{10}$", phone);
        if(check) {
            user1.setMobile(phone);
        }
        else {
            System.out.println("Phone number invalid , enter correct number");
            getPhoneNumber();
        }
    }

    public static void main(String[] args) {
        getFirstName();
        getLastName();
        getGmail();
        getPhoneNumber();
    }
}
