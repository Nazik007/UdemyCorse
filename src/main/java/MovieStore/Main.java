package MovieStore;

import MovieStore.Models.Movie;
import MovieStore.Models.Store;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    static Store store = new Store();
    public static final String RELATIVE_PATH = "/Users/nsovi/Desktop/JavaProjects/UdemyCorse/src/main/java/MovieStore/movies.txt";

    public static void main(String[] args) {
        System.out.println("\n********************JAVA VIDEO STORE********************\n");
        try {
            loadMovies(RELATIVE_PATH);
            System.out.println("MOIVIES LOADED\n\n");
            System.out.println(store);
            manageMovies();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

   public static void loadMovies (String file) throws FileNotFoundException {
       Scanner scanFile = new Scanner(new FileReader(file));

       while (scanFile.hasNextLine()) {
           String line = scanFile.nextLine();
           String[] words = line.split("--");
           store.addMovie(new Movie(words[0], words[1], Double.parseDouble(words[2])));
       }
       scanFile.close();
   }

   public static void manageMovies () {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Would you like to \na) purchase \nb) rent \nc) return a movie ");
            String response = scanner.nextLine();
            if (!(response.equals("a") || response.equals("b") || response.equals("c"))) {
                scanner.close();
                break;
            }
            System.out.println("Enter the name of the movie: ");
            String name = scanner.nextLine();
            if (store.getMovie(name) == null) {
                System.out.println("\nThe input you have provided is incorrect.Please, try again!");
                continue;
            }

            switch (response){
                case "a":
                    if (!(store.getMovie(name).isAvailable())) {
                        System.out.println("\n\n\n\nThe movie is not available for purchase. Please, try again");
                        continue;
                    }
                    store.action(name,"sell"); break;
                case "b": store.action(name, "rent"); break;
                case "c": store.action(name, "return"); break;

            }
            System.out.println("\n\nUPDATED MOVIES\n\n" + store);
        }
   }
}
