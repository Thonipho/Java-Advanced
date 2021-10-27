/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPTest;

//@author is T maV

class Roll{
    
    private String roll;

    public Roll(String roll) {
        this.roll = roll;
    }
    
    
            
}
public class Hamburger {
    
    private String roll;
    private String meat;
    private Additions add;
    
    public Hamburger(String roll, String meat, Additions add){
        if(roll == "brown" || roll == "white") this.roll = roll;
        if(meat == "chicken" || roll == "beef") this.meat = meat;
        this.add = add;
    }
    
    public void getPrice(){
        double total = 40 + add.getTotal();
        System.out.println("Hamburger base: R40.00\n+\nAdditions: R" 
                + add.getTotal() + "\n" + "Total:   R" + total); 
    }
}
