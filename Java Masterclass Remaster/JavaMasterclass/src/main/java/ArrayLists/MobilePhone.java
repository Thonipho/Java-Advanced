/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MobilePhone {

    private static ArrayList<Contacts> contactsBook = new ArrayList<Contacts>();
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (quit != true) {

            choice = s.nextInt();
            s.nextLine();

            if (choice == 0) {
                printInstructions();

            } else if (choice == 2) {
                addContact();
                printInstructions();

            } else if (choice == 1) {
                printContact();
                printInstructions();
            } else if (choice == 3) {

            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress: ");
        System.out.println("\t1 To print contacts");
        System.out.println("\t2 To add contact");
        System.out.println("\t3 To update existing contact");
        System.out.println("\t4 To remove contact");
        System.out.println("\t5 To search for contact");
        System.out.println("\t6 To quit");
    }

    public static void printContact() {
        if (contactsBook.size() > 0) {
            System.out.println(contactsBook.toString());
        } else {
            System.out.println("Your contact list is empty");
        }
    }

    public static void addContact() {
        System.out.println("Please enter name: \n");
        String name = s.next();
        s.nextLine();
        System.out.println("Please enter phone number: \n");
        Long phone = s.nextLong();
        contactsBook.add(new Contacts(phone, name));
    }

    public static void updateContact() {

        if (contactsBook.size() > 0) {
            System.out.println(contactsBook.toString());
            System.out.println(".............\n" + "Please enter the position of "
                    + "the number you would like to update");
        } else {
            System.out.println("Your contact list is empty");
        }
    }
}
