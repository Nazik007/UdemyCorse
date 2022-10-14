package HashCode;

import java.util.Objects;

public class Car {
    String name;
    int year;

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public Car (Car source) {
        this.name = source.name;
        this.year = source.year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }
}
