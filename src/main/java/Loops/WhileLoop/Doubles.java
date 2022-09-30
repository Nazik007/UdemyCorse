package Loops.WhileLoop;

public class Doubles {
    /* Task 2
            1. Call the rollDice() function twice.
            2. Store the return values in dice1 and dice2.
        */

    /* Task 3
            1. Set up a loop that keeps running while the two dice aren't the same.
            2. During each run, re-roll the dice and print the two values.
         */
    // Task 4: After they roll doubles, print: You rolled doubles!

    public static void main(String[] args) {

        int dice1 = rollDice();
        int dice2 = rollDice();

        System.out.println("Dice 1: " + dice1 );
        System.out.println("Dice 2: " + dice2);

        while (dice1 != dice2) {
            dice1 = rollDice();
            dice2 = rollDice();

            System.out.println("Dice 1: " + dice1 );
            System.out.println("Dice 2: " + dice2 + "\n");
        }

        System.out.println("You rolled doubles");
    }

    public static int rollDice () {
        double randomNumber = Math.random() * 6;
        randomNumber +=1;
        return (int) randomNumber;
    }
}
