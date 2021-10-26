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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Highlighted code is for the class that is not encapsulated
        
//        Player player = new Player();
//        player.name = "Thoni";
//        player.health = 20;
//        player.weapon = "Sword";
        
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health: " + player.healthRemaining());

EnhancedPlayer player = new EnhancedPlayer("Thoni", 200, "Dagger");
System.out.println("Initial health is " + player.getHealth());
    }
    
}
