package com.bridgelabz.address_book10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AddresBook addresBook = new AddresBook();
        System.out.println("Welcome to Address Book Program ");
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        // While loop for showing the menu until user not want to exit
        while(!exit) {
        System.out.println("\nEnter 1. Add new Contact \nEnter 2. Edit Contact " +
                "\nEnter 3. Show Contacts \nEnter 4. Delete Contact \nEnter 5. Exit");
        int num = sc.nextInt();

        // writing the switch case
            switch (num) {

                case 1:
                    addresBook.addNewContacts();
                    break;

                case 2:
                    addresBook.editContact();
                    break;
                case 3:
                    addresBook.showContacts();
                    break;
                case 4:
                    addresBook.deleteContact();
                    break;

                case 5:
                    System.out.println("Exit !");
                    exit = true;
                    break;

                default:
                    System.out.println("Enter the correct number !");
                    break;
            }
        }
    }
}

    
