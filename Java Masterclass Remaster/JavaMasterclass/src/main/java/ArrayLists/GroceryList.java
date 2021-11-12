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

    public void addGroceryItem(String item) {

        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(i + ". " + groceryList.get(i));
        }
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
