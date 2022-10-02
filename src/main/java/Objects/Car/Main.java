package Objects.Car;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] parts = {"tires", "keys"};
        Car nissan = new Car("Nissan", 5000.0, 2022, "Red", parts);
        Car dodge = new Car("Dodge", 12000, 2019, "Blue", parts);

//        System.out.println("This " + nissan.make + " is worth " + nissan.price + "\n");
//        System.out.println("This " + dodge.make + " is worth " + dodge.price + "\n");


        nissan.setColor("Jet Black");
        nissan.setPrice(nissan.getPrice() / 2);

        System.out.println("The car name: " + nissan.getMake() + ", color - " + nissan.getColor() + ", the price is - " +
                nissan.getPrice());


        nissan.setParts(new String[]{"tires", "filter"});
        System.out.println(Arrays.toString(nissan.getParts()));
        nissan.drive();
        dodge.drive();

        System.out.println(nissan);
    }
}
