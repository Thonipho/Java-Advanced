/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SortingArrays {

    private static Scanner scanners = new Scanner(System.in);
    
    public static int[] getInteger(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int [] values = new int[number];
        
        for(int i=0; i<values.length; i++) {
            values[i] = scanners.nextInt();
        }
        
        return values;
    }
    
    public static void printArray( int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + ", typed value was " + array[i]);
        }
    }
    
    public static void main(String[] args) {
        
        int[] myInteger = getInteger(5);
        
    }
    
}
