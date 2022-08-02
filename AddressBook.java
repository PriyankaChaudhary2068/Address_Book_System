package com.bridgelabz.addressBookSystem;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class AddressBook {

	        static List<Contact> contactList = new ArrayList<>();
		    static Scanner scanner = new Scanner(System.in);
		    
		    
		    public static void addContact() {
		        System.out.println(" Enter your first name :");
		        String firstName = scanner.nextLine();
		        System.out.println(" Enter your last name : ");
		        String lastName = scanner.nextLine();
		        System.out.println(" Enter your city name : ");
		        String city = scanner.nextLine();
		        System.out.println("Enter your state  : ");
		        String state = scanner.nextLine();
		        System.out.println(" Enter your zip code : ");
		        long zip = scanner.nextLong();
		        System.out.println(" Enter your phone number : ");
		        long phoneNumber = scanner.nextLong();
		        System.out.println(" Enter your email : ");
		        String email = scanner.nextLine();

		        Contact addressBook = new Contact(firstName, lastName, email, city, state, phoneNumber, zip);
		        contactList.add(addressBook);
		    }
		    
		    public static void main(String[] args)
		    {
		        System.out.println(" Welcome To The Address Book Program ");
		        addContact();
		        System.out.println(contactList);
		    }
		}

	


