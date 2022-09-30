package Loops.WhileLoop;

import java.util.Scanner;

public class SignIn {
    /* Task 1
            1. Pick up a username and password from the user.
       */

    /* Task 2
            1. Set up a loop that keeps running while the username OR password is incorrect.
               When they get it wrong:
                •  println: \nIncorrect, please try again!\n
                •  get them to enter their username and password again
            2. After they enter the correct information, print:
                   \nSign in successful. Welcome!
       */

    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";

        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.println("Username: ");
        String usernameInput = scan.nextLine();
        System.out.println("Password: ");
        String passwordInput = scan.nextLine();

        while ((!usernameInput.equals(username) && (!passwordInput.equals(password)))) {
            System.out.println("\nIncorrect, please try again!\n");
            System.out.println("Username: ");
            usernameInput = scan.nextLine();
            System.out.println("Password: ");
            passwordInput = scan.nextLine();
        }
        System.out.println("\nSign in successful. Welcome!");

        scan.close();
    }
}
