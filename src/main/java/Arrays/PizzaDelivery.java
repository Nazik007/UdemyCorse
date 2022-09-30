package Arrays;

import java.util.Scanner;

public class PizzaDelivery {
    /**  Task 1:
     *   1. Ask the user: How many pizza toppings do you want?.
     *   2. Then, pick up the result using Scanner.
     */

    // Task 2 – Create the array here

    /** Task 3
     *  print Great, enter each topping!
     *  Create a for loop that runs through the length of the array.
     *
     */

    /** Task 4 – Pick up the user's toppings and store them in the array.
     *
     *  See the workbook article for more detail
     *
     */

    /** Task 5 –  Loop through the length of the array and print each topping
     *
     *  See the workbook article for more detail
     *
     */

    /** Task 6 –  Confirm the order
     *
     *  See the workbook article for more detail
     *
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pizza toppings do you want?");
        int pizza = scan.nextInt();scan.nextLine();
        String[] numPizza = new String[pizza];

        System.out.println("Great, enter each toppping!");
        for (int i = 0; i < numPizza.length; i++) {
            System.out.print(i + ". ");
            numPizza[i] = scan.nextLine();
        }

        System.out.println("\nThank you! Here are the toppings your ordered");
        for (int i = 0; i < numPizza.length; i++) {
            System.out.println(i + ". " + numPizza[i]);
        }
        System.out.println("\nPress anything to confirm your order.");
        scan.nextLine();
        System.out.println("Great, a driver is on the way!");

        scan.close();
    }
}
