package Inheritance.products;

import Inheritance.products.models.Pants;
import Inheritance.products.models.Product;
import Inheritance.products.models.Shirt;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Product[] products = new Product[] {
                new Pants(32, 24.99, "Blue", "JAVA KLEIN"),
                new Pants(34, 104.99, "Red", "JANGLER"),
                new Pants(30, 119.99, "Grey", "FENDI"),
                new Pants(30, 129.99, "Red", "VERSACE"),
                new Pants(29, 99.99, "Dark", "JANGLER"),
                new Pants(26, 24.99, "Indigo", "BELSTAFF"),
                new Pants(34, 104.99, "Red", "JANGLER"),
        };

        Arrays.sort(products);
        printArray(products);

    }

    public static void printArray(Product[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
