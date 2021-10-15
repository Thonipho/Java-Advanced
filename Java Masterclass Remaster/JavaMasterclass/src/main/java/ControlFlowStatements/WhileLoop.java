/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlFlowStatements;

/**
 *
 * @author User
 */
public class WhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int count = 0;
        
        //counting using a while loop
        while(count !=6) {
            System.out.println("Count value is: " + count);
            count++;
        }
        
        System.out.println("*********************");
        
        //counting using a for loop
        for(int i=0; i<=6; i++){
            System.out.println("Count value is: " +i);
        }
        
        count = 1;
        //counting using a do while loop
        do{
            System.out.println("Count value was: " + count);
            count++;
        } while (count !=0);
    }
    
}
