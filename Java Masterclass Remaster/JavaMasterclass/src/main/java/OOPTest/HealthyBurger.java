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
public class HealthyBurger {
    
    private String roll;
    private String meat;
    private Additions add;
    
    public HealthyBurger(String roll, String meat, Additions add){
        if(roll == "brown" || roll == "white") this.roll = roll;
        if(meat == "chicken" || roll == "beef") this.meat = meat;
        this.add = add;
    }
    
    public void getPrice(){
        double total = 60 + add.getTotal();
        System.out.println("Healthy base: R60.00\n+\nAdditions: R" 
                + add.getTotal() + "\n" + "Total:   R" + total); 
    }

}
