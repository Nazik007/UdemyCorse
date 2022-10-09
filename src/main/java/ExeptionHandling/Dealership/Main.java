package ExeptionHandling.Dealership;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Car [] cars = new Car[] {
                new Car("Nissan", 5000),
                new Car("Toyota", 12000)
        };

        Dealership dealership = new Dealership(cars);
        System.out.println("\n************* JAVA DEALERSHIP *************");
        while (true) {
            System.out.println(dealership);
            if (dealership.isEmpty()) {
                System.out.println("We're all sold out!");
                break;
            }
            System.out.println("Enter the spot number of the car you want to buy:");
            if (!scan.hasNextLine()) {
                scan.nextLine();
                System.out.println("INVALID INPUT!");
                continue;
            }
            int spot = scan.nextInt();
            scan.nextLine();
            if (spot < 0 || spot > dealership.getLength() - 1) {
                System.out.println("INVALID INDEX!");
                continue;
            } else if (dealership.getCar(spot) == null) {
                System.out.println("EMPTY SPOT");
                continue;
            }
            dealership.sell(spot);
            System.out.println("Type 'yes' to continue shopping: ");
            if (!scan.nextLine().equalsIgnoreCase("yes")) {
                break;
            }
        }

        scan.close();
    }
}
