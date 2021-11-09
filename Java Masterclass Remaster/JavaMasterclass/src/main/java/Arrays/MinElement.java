/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Arrays;
import java.util.Scanner;


public class MinElement {
    
    private static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(int count) {
        
        System.out.println("Enter " + count + " integer values.\r");
        int[] values = new int[count];
        
        for (int i=0; i<count; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }
    
    public static int findMin( int [] array) {
        
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<array.length; i++) {
            int value = array[i];
            
            if(value < min) {
                min = value;
            }
        }
        return min;
    }
    
    public static void main(String[] args) {
        
        int[] myArray = readIntegers(5);
        int min = findMin(myArray);
        System.out.println("Min value is " + min );
    }
    
}
