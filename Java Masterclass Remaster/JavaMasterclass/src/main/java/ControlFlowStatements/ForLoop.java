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
public class ForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // use a for loop to prinnt the calculated interests 
        for(int i=1; i<9; i++){
            System.out.println("10 000 at " + i + "% interest:" + calculateInterest(10000,i));
        }
    }
    
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate/100));
    }
    
}
