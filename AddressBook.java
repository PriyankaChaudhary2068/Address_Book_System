package com.bridgelabz.addressBookSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AddressBook {
	

	        static List<Contact> contactList = new ArrayList<Contact>();
		    static Scanner scanner = new Scanner(System.in);
		    
		    public static void addContact() {
		        System.out.println(" Enter your first name :");
		        String firstName = scanner.nextLine();
		        System.out.println(" Enter your last name : ");
		        String lastName = scanner.nextLine();
		        System.out.println(" Enter your city name : ");
		        String city = scanner.nextLine();
		        System.out.println("Enter your state : ");
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
		    
		     // method for editing existing contact
		     public void editContact()
		     {
		        Scanner nameInput = new Scanner(System.in);
		        System.out.println(" Enter The First Name ");
		        String fName = nameInput.nextLine();
		        for (int index = 0; index < contactList.size(); index++)
		        {
		            if (contactList.get(index).getFirstName().equals(fName))
		            {
		                contactList.remove(index);
		                AddressBook addressBook = new AddressBook();
		                AddressBook.addContact();
		            }   
		            else
		            {
		                System.out.println(" There is no contact ");
		            }
		        }

            }
         }    