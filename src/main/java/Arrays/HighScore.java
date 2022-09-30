package Arrays;

public class HighScore {
    /** Task 1
     * Function name – randomNumber
     * @return random number (int)
     *
     * Inside the function
     *  - returns a random number between 0 and 50000
     */

    /** Task 2
     *
     *    1. Create an array that stores 10 random numbers
     *    2. Using a for loop, print the array elements on the same line.
     *         Example – Here are the scores: 14775 48328 7928 27102 21787 21063 38096 42711 32863 23707
     */

    /** Task 3
     *
     *   1. Using a for loop, find the highest score in the array and update the highScore.
     *   2. println("\n\nThe highest score is: <>. Give that man a cookie!");
     */

    /** Task 4 – Find the person with the highest score
     *
     *   • After obtaining the highest score, print: The highest score is:  <highScore>. Impressive!
     *   • It's the gentleman in seat: <index>. Give that man a cookie!
     *
     */

    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = randomNumber();
        numbers[1] = randomNumber();
        numbers[2] = randomNumber();
        numbers[3] = randomNumber();
        numbers[4] = randomNumber();
        numbers[5] = randomNumber();
        numbers[6] = randomNumber();
        numbers[7] = randomNumber();
        numbers[8] = randomNumber();
        numbers[9] = randomNumber();

        System.out.println("Here are the scores: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        int highestScore = 0;
        int seat = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > highestScore){
                highestScore = numbers[i];
                seat = i;
            }
        }
        System.out.println("\nThe highest score is: " + highestScore + ".Give that man a cookie!");

        System.out.println("The highest score is:" + highestScore + ". Impressive!");
        System.out.println("It's the gentleman in seat: " +seat + ". Give that man a cookie!");

    }

    public static int randomNumber() {
        double number = Math.random() * 50000;
        number +=1;
        return (int) number;
    }
}
