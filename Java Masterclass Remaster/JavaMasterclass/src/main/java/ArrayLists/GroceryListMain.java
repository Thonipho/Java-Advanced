/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayLists;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class GroceryListMain {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    
    public static void main(String[] args) {
        
        boolean quit = false;
        int choice = 0;
        printInstructions();
        
        while(!quit){
            
            System.out.println("Enter your choice: ");
            choice = scanner .nextInt();
            scanner.nextLine();
            
            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6: 
                    quite = true;
                    break;
            }
        }
    }
    
    public static void printInstructions(){
        System.out.println("\nPress: ");
        System.out.println("\t To print choice options");
        System.out.println("\t To add item");
        System.out.println("\t To modify item in the list");
        System.out.println("\t To remove item");
        System.out.println("\t To search for item");
        System.out.println("\t To quit app");
    }
    
}
