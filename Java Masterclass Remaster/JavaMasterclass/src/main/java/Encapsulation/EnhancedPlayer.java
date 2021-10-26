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
public class EnhancedPlayer {
    // this class is encapsulated
    
    private String name;
    private int hitpoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health >=0 && health <=100) this.hitpoints = health;
        this.weapon = weapon;
    }
    
    public void loseHealth(int damage) {
        this.hitpoints = this.hitpoints - damage;
        if(this.hitpoints <= 0) System.out.println("Player knocked out");
    }

    public int getHealth() {
        return hitpoints;
    }
    
    
}
