/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author User
 */
public class Player {
    // this class is not encapsulated
    
    public String fullName;
    public int health;
    public String weapon;
    
    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) System.out.println("Player knocked out");
    }
    
    public int healthRemaining(){
        return this.health;
    }
}
