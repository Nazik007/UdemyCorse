package ExeptionHandling.UncheckedExeptions;


//NEVER CATCH UNCHECKED EXEPTIONS
public class RuntimeExeption {
    public static void main(String[] args) {
        int [] array = new int[3];
        try {
            System.out.println(array[6]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
