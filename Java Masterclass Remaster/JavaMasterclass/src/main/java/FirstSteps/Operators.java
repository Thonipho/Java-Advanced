/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstSteps;

/**
 *
 * @author User
 */
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int result = 1_2; // 1+2=3
        System.out.println("1+2=" + result);
        int previousResult = result;
        System.out.println("previousResult= " + previousResult);
        result = result - 1; // 3-1=2
        System.out.println("3-1= " + result);
        System.out.println("previousResult= " + previousResult);

        result = result * 10; // 2*10=20
        System.out.println("2*10= " + result);

        result = result / 5; // 20/5=4
        System.out.println("2/5= " + result);

        result = result % 3; // the remainder of 4/3 = 1
        System.out.println("4%3= " + result);

        //result = result +1
        result++;
        System.out.println("1+1= " + result);

        //result = result -1
        result--;
        System.out.println("2-1= " + result);

        //result = result +2
        result += 2;
        System.out.println("1+2= " + result);

        //result = result *10
        result *= 10;
        System.out.println("3*10= " + result);

        //result = result /3
        result /= 3;
        System.out.println("30/3= " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        // ternary operand
    }
}
