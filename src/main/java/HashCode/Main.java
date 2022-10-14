package HashCode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 2016);
        System.out.println("Nissan: " + nissan.hashCode());

        Car dodge = new Car("Dodge", 2018);
        System.out.println("Dodge: " + dodge.hashCode());

        Car toyota = new Car("Toyota", 2017);
        System.out.println("Toyota: " + toyota.hashCode());

        Car nissan2 = new Car(nissan);
        System.out.println("Nissan 2: " + nissan2.hashCode());

        HashMap<Car, Double> prices = new HashMap<>();
        prices.put(nissan, 10000.0);
        prices.put(dodge, 12000.0);
        prices.put(toyota, 14000.0);

        nissan.equals(nissan2);
        System.out.println(prices.get(nissan2));
    }
}
