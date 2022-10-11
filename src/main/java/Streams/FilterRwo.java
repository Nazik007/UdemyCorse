package Streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FilterRwo {

    static ArrayList<Double> prices = new ArrayList<>();

    public static void main(String[] args) {
        prices.add(1.99);
        prices.add(4.99);
        prices.add(10.99);
        prices.add(15.99);

        ArrayList<Double> withTax = new ArrayList<>();

       withTax.addAll(prices.stream()
                        .map((price) ->price * 1.13)
                        .collect(Collectors.toList()));

        System.out.println(withTax);

        filterLowPrices(withTax);
    }

    public static void filterLowPrices(ArrayList<Double> withTax) {
        for (int i = 0; i < prices.size(); i++) {
            if (prices.get(i) < 5) {
                System.out.println(prices.get(i));
            }
        }
    }
}
