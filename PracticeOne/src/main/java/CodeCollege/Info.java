/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeCollege;

/**
 *
 * @author User
 */
public class Info {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Students stud1 = new Students("T","Mav","Java Bootcamp","tba");
        Students stud2 = new Students("John","Cena","Java Bootcamp","tba");
        Students stud3 = new Students("Emtee","dehustler","Java Bootcamp","tba");
        Students stud4 = new Students("Pusha","T","Java Bootcamp","tba");
        
        System.out.println("Below are 4 students and their information:\n");
        
        Students [] studs = {stud1,stud2,stud3,stud4};
        
        for(Students stud:studs){
            System.out.println(stud.getFirstname() + " " + stud.getLastname() +
                    " is currently doing the " + stud.getCourse() + " course. " + 
                    "You can check their progress at the following link: " + stud.getGithub() + "\n");
        }
        
    }
    
}
