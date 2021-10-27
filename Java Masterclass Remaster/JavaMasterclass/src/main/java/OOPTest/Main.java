/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPTest;

/**
 *
 * @author T maV
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Hamburger burger = new Hamburger("brown", "chicken", new Additions("cheese", "lettuce"));
        DeluxeBurger burger2 = new DeluxeBurger("brown", "chicken");
        HealthyBurger burger3 = new HealthyBurger("brown", "chicken", new Additions("tomato", "lettuce"));
        
        burger.getPrice();
        System.out.println("........................");
        burger2.getPrice();
        System.out.println("........................");
        burger3.getPrice();
    }
    
}
