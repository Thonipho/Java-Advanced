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
public class DealingWithArrays {

    private static Scanner scanner = new Scanner(System.in);
    
    public static int[] getIntegers(int number) {
        //creating and populating array
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        
        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        
        return values;
    }
    
    public static double getAverage(int[] array) {
        //calculating average
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        return (double) sum/(double)array.length;
    }
    
    public static void main(String[] args) {
        
        int[] myIntegers = getIntegers(5);
        
        for(int i=0; i<myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        
        System.out.println("Average = " + getAverage(myIntegers));
    }
    
    
}
