package Streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Filter {

    static ArrayList<Double> prices = new ArrayList<>();

    public static void main(String[] args) {
        prices.add(1.99);
        prices.add(4.99);
        prices.add(10.99);
        prices.add(15.99);

        ArrayList<Double> lowPrices = new ArrayList<>();

        lowPrices.addAll(prices.stream()
                .filter((price) -> price < 5)
//                .forEach((price) -> System.out.println(price));
        .collect(Collectors.toList()));


        System.out.println(lowPrices);

        filterLowPrices();

    }

    private static void filterLowPrices() {
        System.out.println("\n\nLOW PRICES");
        for (int i = 0; i < prices.size(); i++) {
            if (prices.get(i) < 5) {
                System.out.println(prices.get(i));
            }
        }
    }
}
