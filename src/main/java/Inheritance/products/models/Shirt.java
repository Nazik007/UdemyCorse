package Inheritance.products.models;

import java.util.Objects;

public class Shirt extends Product {


    @Override
    public void fold() {
        System.out.println("Lay the shirt on the flat surface");
    }


    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    private Size size;


    public Shirt(Size size, double price, String color, String brand) {
        super(price, color, brand);
        this.size = size;

    }

    public Shirt(Shirt source) {
        super(source);
        this.size = size;

    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shirt shirt = (Shirt) o;
        return Objects.equals(size, shirt.size) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "size='" + size + '\'' +
                '}';
    }
}
