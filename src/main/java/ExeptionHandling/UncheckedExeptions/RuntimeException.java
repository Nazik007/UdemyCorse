package ExeptionHandling.UncheckedExeptions;

public class RuntimeException {
    public static void main(String[] args) {
        String word = null;
        if (word == null) {
            System.out.println("The word is null, can't print something that doesn't exist!!!");
        } else {
            System.out.println(word);
        }
    }
}
