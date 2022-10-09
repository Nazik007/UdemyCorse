package ExeptionHandling.Dealership;

public class Car {

    private String make;
    private double price;

    public Car(String make, double price) {
        if (price < 0 ) {
            throw new IllegalArgumentException("Price can not be less then zero!");
        }
        if (make == null || make.isBlank()) {
            throw new IllegalArgumentException("make field can not be bull or empty!");
        }
        this.make = make;
        this.price = price;
    }

    public Car (Car source) {
        this.make = source.make;
        this.price = source.price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make == null || make.isBlank()) {
            throw new IllegalArgumentException("ake can not be null/blank");
        }
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0 ) {
            throw new IllegalArgumentException("price can not be less than 0");
        }
        this.price = price;
    }

    public void drive () {
        System.out.println("\nYou bought the beautiful " + this.make + " for " + this.price + ".");
        System.out.println("Please, drive your car to the nearest exist.\n");
    }

    @Override
    public String toString() {
        return "\tMake:" + make + ".\n" +
                "\tPrice: " + price + ".\n";
    }
}
