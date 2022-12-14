package ExeptionHandling.VendingMachine;

import ExeptionHandling.VendingMachine.Models.Item;
import ExeptionHandling.VendingMachine.Models.Machine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");

        Item [][] items = new Item[][] {
                {new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2)},
                {new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3)},
                {new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1)}
        };

        Machine machine = new Machine(items);

        System.out.println(machine);

        while (true) {
            System.out.println("Pick a row: ");
            int row = scan.hasNextInt() ? scan.nextInt() : 404;
            scan.nextLine();
            System.out.println("Pick a spot in a row: ");
            int spot = scan.hasNextInt() ? scan.nextInt() : 404;
            scan.nextLine();

            if (row == 404 || spot == 404) {
                System.out.println("INVALID INPUT");
                continue;
            }
            else if (row < 0 || row > machine.getLength() - 1 || spot < 0 || spot > machine.getRowLength() -1) {
                System.out.println("INVALID INDEX");
                continue;
            }
            else if (machine.getIem(row, spot).getQuantity() == 0) {
                System.out.println("Empty slot");
                continue;
            }

            machine.dispense(row, spot);
            System.out.println("\n" + machine);
            System.out.println("\nEnjoy your drink! Press 1 to continue and purchase another drink: ");
            if (!scan.next().equalsIgnoreCase("1")) {
                System.out.println("Thanks for your purchase!");
                break;
            }
        }
    }
}
