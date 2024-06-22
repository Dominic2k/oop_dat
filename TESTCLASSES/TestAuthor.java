package TESTCLASSES;
import CLASSES.Author;

public class TestAuthor {
    public static void main(String[]arges){
        Author a1 = new Author("Pham Duc Dat", "pddat2602@gmail.com", 'm');

        System.out.println(a1);

        a1.setEmail("tramhuynh0101@gmail.com");

        System.out.println(a1);
    }
}
