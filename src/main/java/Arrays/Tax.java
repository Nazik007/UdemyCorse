package Arrays;

import java.util.Arrays;

public class Tax {
    /** Task 1:
     *
     *  Create a new array afterTax with the same length as price
     *
     */

    /** Task 2:
     *
     *  Update each element in afterTax to be: price + 13% * price.
     *
     */

    /** Task 3:
     *
     * Print the following messages:
     *     The original prices are: <original prices>
     *     The prices after tax are: <after tax prices>
     *
     */
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] afterTax = new double[4];

        for (int i = 0; i < afterTax.length; i++) {
           afterTax[i] = price[i] * 1.13;
        }
        System.out.println(Arrays.toString(price));
        System.out.println(Arrays.toString(afterTax));
    }
}
