/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

class Movie{
    private String name;
    
    public Movie(String name){
        this.name = name;
    }
    public String plot(){
        return "No plot here";
    }
}

class Jaws extends Movie {
    
    public Jaws(){
        super("Jaws");
    }
    @Override
    public String plot(){
        return "A shark eats a lot of people";
    }
}

class IndependenceDay extends Movie{
    
    public IndependenceDay(){
        super("IndependenceDay");
    }
    @Override
    public String plot(){
        return "Aliens plan to take over planet earth";
    }
}

class MazeRunner extends Movie{
    
    public MazeRunner(){
        super("MazeRunner");
    }
    @Override
    public String plot(){
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie{
    
    public StarWars(){
        super("StarWars");
    }
    @Override
    public String plot(){
        return "Superior force try take over universe";
    }
}

class Forgetable extends Movie{
    
    public Forgetable(){
        super("Forgetable");
    }
    
}

public class Main {

    public static void main(String[] args) {
        
    }
    
}
