/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlFlowStatements;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ReadingUserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); //handle next line character (enter key)
        
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2021 - yearOfBirth;
        
        System.out.println("Your name is " + name + ", and you are " + age + " years old");
        
        scanner.close();
    }
    
}
