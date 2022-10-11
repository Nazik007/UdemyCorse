package Streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Map {

    static ArrayList<Double> prices = new ArrayList<>();

    public static void main(String[] args) {
        prices.add(1.99);
        prices.add(4.99);
        prices.add(10.99);
        prices.add(15.99);

        ArrayList<Double> updatePrice = new ArrayList<Double>();
        updatePrice.addAll(prices.stream()
                .filter((price) -> price < 5)
                .map((price) -> price * 1.13)
                .collect(Collectors.toList()));

        System.out.println(updatePrice);
    }


}
