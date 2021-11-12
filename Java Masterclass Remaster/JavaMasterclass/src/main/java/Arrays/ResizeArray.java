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
public class ResizeArray {

    private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[10];
    
    private static void resizeArray(int size) {
        int[] original = baseData;
        
        baseData = new int[size];
        
        for(int i=0; i<original.length; i++){
            baseData[i] = original[i];
        }
        
    }
    
    private static void printArray(int [] arr) {
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
    private static void getInput(){
        System.out.println("Enter integers: ");
        for(int i =0; i<baseData.length;i++){
            baseData[i]= s.nextInt();
        }
    }
    
    public static void main(String[] args) {
        
       getInput();
       printArray(baseData);
       resizeArray(12);
       getInput();
       printArray(baseData);
    }
    
}
