package Arrays;

public class ArraysAndLoops {
    public static void main(String[] args) {
        String [] kingdoms = {"Mercia", "Wessex", "Northumbria", "EA"};
        System.out.println("The number of elements is " + kingdoms.length);

        for (int i = 0; i < kingdoms.length; i++) {
            System.out.print(kingdoms[i] + " ");
        }
    }
}
