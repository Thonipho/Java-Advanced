/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaTutorials;

/**
 *
 * @author User
 */
public class SpeedConverterDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(100);
    }

}
