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
public class DeluxeBurger {
    
    private String roll;
    private String meat;
    private Additions add;
    
    public DeluxeBurger(String roll, String meat){
        if(roll == "brown" || roll == "white") this.roll = roll;
        if(meat == "chicken" || roll == "beef") this.meat = meat;
        this.add = add;
    }
    
    public void getPrice(){
        double total = 90;
        System.out.println("Hamburger base: R40.00\n+\nChips: R30" 
                + "\n" + "Drink: R20" + "\nTotal:   R" + total); 
    }

}
