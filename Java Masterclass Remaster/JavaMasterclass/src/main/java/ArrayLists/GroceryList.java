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
public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();
    
    public void printGroceryList(){
        if(groceryList.size()>0)
            System.out.println(groceryList.toString());
        else
            System.out.println("Your grocery list is empty");
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void modifyGroceryList(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + "has been modified");
    }

    public void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    public String findItem(String item) {
        int position = groceryList.indexOf(item);

        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }

   

}
