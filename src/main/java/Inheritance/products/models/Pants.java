package Inheritance.products.models;

public class Pants extends Product implements Discountable {

    private int waist;

    public Pants(int waist, double price, String color, String brand) {
        super(price, color, brand);
        this.waist = waist;
    }

    public Pants(Pants source) {
        super(source);
        this.waist = source.waist;
    }

    public int getWaist() {
        return waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    @Override
    public void fold() {
        System.out.println();
    }

    @Override
    public void discount() {
        super.setPrice(getPrice() / 2);
    }

    @Override
    public String toString() {
        return "Pants: " +
                "wais =" + waist +
                "price = " + super.getPrice() +
                "color = " + super.getColor() +
                "brand = " + super.getBrand();
    }


}
