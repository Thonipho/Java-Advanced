/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class ReverseArray {

    public static void reverse(int [] array) {
        int maxIndex = array.length -1;
        int halfIndex = array.length/2;
        
        for(int i = 0; i<halfIndex; i++){
            int temp = array[i];
            array[i] = array[maxIndex -1];
            array[maxIndex - 1] = temp;
        }
                
    }
    
    public static void main(String[] args) {
        
        int[] array = {1, 5, 3, 7, 11, 9, 15};
        
        System.out.println("Array= " + Arrays.toString(array));
        
        reverse(array);
        
        System.out.println("Reverse Array= " + Arrays.toString(array));
        
        
    }
    
}
