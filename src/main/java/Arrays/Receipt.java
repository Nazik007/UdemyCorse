package Arrays;

public class Receipt {
    //Task 1: Create two arrays (see Workbook article)

        /* Task 2
            Use a for loop to print each apple and the corresponding price.

            for {
                println(\t<apple i >: $<price i >)
            }
        */

    public static void main(String[] args) {
        String[] apples = {"Gala", "Granny Smith", "Macintosh"};
        double[] price = {1.99, 1.49, 1.29};

        for (int i = 0; i < apples.length; i++) {
            System.out.println(apples[i] + ": $" + price[i]);
        }
    }
}
