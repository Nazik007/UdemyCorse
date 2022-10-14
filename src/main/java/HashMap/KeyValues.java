package HashMap;

import java.util.HashMap;

public class KeyValues {
    public static void main(String[] args) {
        String[] vegetables = new String[] {"Cauliflower", "Spaghetti Squash", "Parsley"};
        double[] prices = new double[] {4.99, 1.99, 6.99};

        HashMap<String, Double> items = new HashMap<>();
        items.put("Cauliflower", 4.99);
        items.put("Spaghetti Squash", 1.99);
        items.put("Parsley", 6.99);

        items.put("Parsley", 3.99);  // updates the value if you use the KEY that already exists

//        System.out.println("Cauliflower = " + items.get("Cauliflower"));
//        System.out.println("Spaghetti Squash = " + items.get("Spaghetti Squash"));
//        System.out.println("Parsley = " + items.get("Parsley"));

        items.forEach((key, value) -> {
            System.out.println(key + " = " + value);
        });
    }
}
