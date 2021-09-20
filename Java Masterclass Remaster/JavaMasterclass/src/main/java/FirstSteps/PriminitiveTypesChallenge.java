/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstSteps;

/**
 *
 * @author User
 */
public class PriminitiveTypesChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        byte byteValue = 10;
        short shortValue = 2;
        int intValue = 50;
        
        long longTotal = 50000L + 10L * (byteValue+shortValue+intValue);
        System.out.println(longTotal);
        
        short shortTotal = (short) (1000 + 10 * (byteValue+shortValue+intValue));
    }
    
}
