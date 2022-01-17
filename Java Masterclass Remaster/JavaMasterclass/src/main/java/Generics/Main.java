/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        
        Team<FootballPlayer> adelaideCrows = new Team<> ("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//      adelaideCrows.addPlayer(pat);
//      adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());
        
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);
        
        Team<FootballPlayer> Kansa = new Team<>("Kansa City");
        FootballPlayer Banks = new FootballPlayer("Banks");
        Kansa.addPlayer(Banks);
        
        Team<FootballPlayer> Hawthorns = new Team<>("Hawthorns");
        Team<FootballPlayer> Fremantle = new Team<>("Fremantle");
        
        Hawthorns.matchResult(Fremantle, 1, 0);
        Hawthorns.matchResult(adelaideCrows, 3, 8);
        adelaideCrows.matchResult(Fremantle, 1, 0);
//      adelaideCrows.matchResult(baseballTeam, 1, 0);
        
        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(Kansa.getName() + ": " + Kansa.ranking());
        System.out.println(Fremantle.getName() + ": " + Fremantle.ranking());
        System.out.println(Hawthorns.getName() + ": " + Hawthorns.ranking());
        
    }
}
