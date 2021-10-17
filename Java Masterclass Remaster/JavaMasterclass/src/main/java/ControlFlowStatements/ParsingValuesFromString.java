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
public class ParsingValuesFromString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);
        
        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);
        
        numberAsString += 1;
        number += 1;
        
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }
    
}
