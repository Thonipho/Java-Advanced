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
        
        System.out.println("*********************");
        
        count = 1;
        //counting using a do while loop
        do{
            System.out.println("Count value was: " + count);
            count++;
        } while (count !=6);
        
        System.out.println("*********************");
        
        //displaying even numbers using while loop and method
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound =0;
        
        while(number<=finishNumber){
            number++;
            
            if(!isEvenNumber(number)) {
                continue;
            }
            
            System.out.println("Even Number " + number);
            
            evenNumbersFound++;
            if(evenNumbersFound >=5) {
                break;
            }
        }
        
        System.out.println("Total even numbers found: " + evenNumbersFound);
    }
    
    public static boolean isEvenNumber(int number ) {
        if(number%2 == 0) return true;
        else return false;
    }
    
}
