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
public class ByteShortIntLong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int myMinIntValue = Integer.MIN_VALUE;
         int myMaxIntValue = Integer.MAX_VALUE;
         System.out.println("Integer Minimum Value = " + myMinIntValue);
         System.out.println("Integer Maximum Value = " + myMaxIntValue);
         System.out.println("Busted Maximum Value = " + (myMaxIntValue +1));
         System.out.println("Busted Minimum Value = " + (myMinIntValue +1));
         
         byte myMinByteValue = Byte.MIN_VALUE;
         byte myMaxByteValue = Byte.MAX_VALUE;
         System.out.println("Byte Minimum Value = " + myMinByteValue);
         System.out.println("Byte Maximum Value = " + myMaxByteValue);
         
         short myMinShortValue = Short.MIN_VALUE;
         short myMaxShortValue = Short.MAX_VALUE;
         System.out.println("Short Minimum Value = " + myMinShortValue);
         System.out.println("Short Maximum Value = " + myMaxShortValue);
         
         long myMinLongValue = Long.MIN_VALUE;
         long myMaxLongValue = Long.MAX_VALUE;
         System.out.println("Long Minimum Value = " + myMinLongValue);
         System.out.println("Long Maximum Value = " + myMaxLongValue);
         
         //casting
         byte myNewByteValue = (byte) (myMinByteValue/2);
         short myNewShortValue = (short) (myMinShortValue/2);
    }
    
}
