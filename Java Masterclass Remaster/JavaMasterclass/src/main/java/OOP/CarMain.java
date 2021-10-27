/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author User
 */
public class CarMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Car porsche = new Car();
        porsche.setModel("cayenne");
        
        System.out.println("Model is " + porsche.getModel());
    }
    
}
