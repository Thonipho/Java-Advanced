/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composition;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", 240, dimensions);
        Monitor theMonitor = new Monitor("27inch beast", "Acer", 27, new Resolution(240, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2-64");
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        
        thePC.powerUp();
        thePC.drawLogo();
    }
    
}
