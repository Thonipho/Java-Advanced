/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaTutorials;

/**
 *
 * @author User
 */
public class IfKeyWordAndCodeBlocks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//      if (score < 5000 && score >1000){
//        System.out.println("Your score is 5000");
//      }else if (score <1000){
//        System.out.println("Your score is less than 1000");
//      }else{
//        System.out.println("Got here");
//      }
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was = " + finalScore);
        }

//        boolean newGameOver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        if(newGameOver){
//            int finalScore =score + (levelCompleted*bonus);
//            System.out.println("Your final score was = " + finalScore);
//        }
        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was = " + finalScore);
        }

    }
}
