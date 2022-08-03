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
		    
		    public static void main(String[] args)
		    {
		        System.out.println(" Welcome To The Address Book Program ");
		        {
		            Scanner scanner = new Scanner(System.in);
		            int flag = 1;
		            while (flag == 1)
		            {
		                System.out.println("\n Enter : 1.For Adding a Contact Details 2.Exit ");
		                int choice = scanner.nextInt();
		                switch (choice) {
		                    case 1:
		                        addContact();
		                        break;
		                    case 2:
		                        flag = 0;
		                        break;
		                    default:
		                        System.out.println("Enter a valid choice");
		                        break;
		                }
		            }
		            scanner.close();

		            System.out.println(contactList);
		        }
		    }
        }