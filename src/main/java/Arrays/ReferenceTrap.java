package Arrays;

import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
        //String[] staffThisYear = new String[3];
       // staffThisYear[1] = "Abby";  updates both arrays not only the new one!!!!MAKE NEW ARRAY

//        for (int i = 0; i < staffThisYear.length; i++) {
//            staffThisYear[i] = staffLastYear[i];
//        }

        staffThisYear[1] = "Abby";



        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
    }
}
