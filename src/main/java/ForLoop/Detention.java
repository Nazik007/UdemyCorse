package ForLoop;

import java.util.Scanner;

public class Detention {
    //Task 1 – Scan for the nextLine(), and print it 99 times.

    public static void main(String[] args) {
        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        for (int i = 0; i <= 99; i++) {
            System.out.println(i + ". " + input);
        }
    }
}
