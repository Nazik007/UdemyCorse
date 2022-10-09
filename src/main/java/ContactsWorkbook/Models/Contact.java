package ContactsWorkbook.Models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Contact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact(String name, String phoneNumber, String birthDate) throws ParseException {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name can not be null/blank");
        }
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("phone number can not be null/blank");
        }
        if (phoneNumber.length() < 5) {
            throw new IllegalArgumentException("phone number can not be less than 10 characters");
        }
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = toAge(birthDate);
    }

    public Contact(Contact source) {
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name can not be blank/null");
        }
        this.name = name;
    }

    public String getPhoneNumber() {
        if (phoneNumber == null || phoneNumber.isBlank()) {
            throw new IllegalArgumentException("phone number can not be null/blank");
        }
        if (phoneNumber.length() < 5) {
            throw new IllegalArgumentException("phone number can not be less than 10 characters");
        }
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) throws ParseException {
        this.birthDate = birthDate;
        setAge(toAge(birthDate));
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public int toAge (String birthDate) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        formatter.setLenient(false);
        Date toDate = formatter.parse(birthDate); //coverts String to a date
        long toMilli = toDate.getTime(); // converts Date to milliseconds since 1970
        long diff = new Date().getTime() - toMilli; // age in milliseconds
        return  (int) TimeUnit.MILLISECONDS.toDays(diff) / 365;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +

                "Phone number: " + phoneNumber + "\n" +

                "Birth Date: " + birthDate + "\n" +

                "Age: " + age + " year old\n";
    }
}
