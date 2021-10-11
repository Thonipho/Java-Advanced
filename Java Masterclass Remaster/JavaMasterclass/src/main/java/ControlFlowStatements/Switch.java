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
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // using int
        
        int switchvalue = 6;
        
        switch(switchvalue) {
            case 1:
                System.out.println("Value was 1");
                break;
            
            case 2:
                System.out.println("Value was 2");
                break;
            
            case 3: case 4: case 5:
                System.out.println("Value was 3, or 4, or 5");
                System.out.println("Actually it was a " + switchvalue);
                break;
            
            default:
                System.out.println("Value was not 1, 2 ,3 ,4 or 5");
                break;
        }
        
        // using char
        
        char charvalue = 'A';
        
        switch(charvalue) {
            case 'A':
                System.out.println("Letter is A");
                break;
            
            case 'B':
                System.out.println("Letter is B");
                break;
            
            case 'C': case 'D': case 'E':
                System.out.println("Letter was C, or D, or E");
                System.out.println("Actually it was a " + charvalue);
                break;
            
            default:
                System.out.println("Value was not A, B ,C ,D or E");
                break;
        }
        
        // using strings
        
        String month = "January";
        
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            
            case "february":
                System.out.println("Feb");
                break;
            
            default:
                System.out.println("Not sure");
                break;
        }
    }
    
}
