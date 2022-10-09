package ArrayList;

import java.util.ArrayList;

public class ResizableArrays {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Joe");
        names.add("Jim");
        names.add("John");

        System.out.println("names size = " + names.size());
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        names.set(0, "Joe Fresh");
        names.add(3,"Katie");
        names.remove(2);

        System.out.println("names size = " + names.size());
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        names.clear();

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
