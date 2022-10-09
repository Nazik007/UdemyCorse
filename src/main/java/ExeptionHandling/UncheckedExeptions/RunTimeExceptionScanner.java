package ExeptionHandling.UncheckedExeptions;

import java.util.Scanner;

public class RunTimeExceptionScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Please, print a number: ");
            if (scan.hasNextInt()) {
                System.out.println(scan.hasNextInt());
                break;
            } else {
                System.out.println("It's not a number");
                scan.nextLine();
            }
        }
    }
}
