/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Arrays;
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
    
    public static int[] sortArray( int [] array) {
        
        int [] sortedArray = Arrays.copyOf(array, array.length);
        
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        
        return sortedArray;
    }
    
    public static void main(String[] args) {
        
        int[] myIntegers = getInteger(5);
        int[] sorted = sortArray(myIntegers);
        printArray(myIntegers);
        System.out.println(".......................");
        printArray(sorted);
    }
    
}
