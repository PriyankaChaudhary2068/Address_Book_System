package com.bridgelabz.addressBookSystem;

import java.util.Scanner;


public class AddressBookSystem {
	
	 public static void main(String[] args) {
	        AddressBook addressBook = new AddressBook();
	        Scanner scanner = new Scanner(System.in);
	        int flag = 1 ;
	        while(flag == 1)
	        {
	            System.out.println(" Welcome to address book program ");
	            System.out.println(" \n Enter : 1.For Adding a Contact Details 2.Edit Existing Contact Details  3. Exit");
	            int choice = scanner.nextInt();
	            switch(choice)
	            {
	                case 1 : AddressBook.addContact();
	                         break;
	                case 2 : if (AddressBook.contactList.isEmpty())
	                       {
	                         System.out.println(" Address Book Is Empty ");
	                         break;
	                       }
	                         addressBook.editContact();
	                         break;
	                case 3 : flag = 0 ;
	                         break;
	                default:
	                	   System.out.println(" Enter A Valid Choice");
	                       break;
	            }
	        }
	        
	        System.out.println(AddressBook.contactList);
	        scanner.close();
	    }
	}


