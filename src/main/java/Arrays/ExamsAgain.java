package Arrays;

public class ExamsAgain {
    //Task 1: Create an array that stores 5 students: "Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"

    /**Task 2: Using a for loop, assign each student a seat according to their index in the array.

     for  ( ...) {
     <student at index i>, you will take seat i
     }

     */
    //
    public static void main(String[] args) {
        String[] seats  = {"Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"};

        for (int i = 0; i < seats.length; i++) {
            System.out.println(seats[i] + ", you will take seat " + i);

        }

}
}
