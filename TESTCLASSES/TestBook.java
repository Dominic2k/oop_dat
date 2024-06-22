package TESTCLASSES;
import CLASSES.Author;
// import CLASSES.Author;
import CLASSES.Book;

public class TestBook {
    public static void main(String[] args) {

        // Book[] books = new Book[10000];
        // Author author1 = new Author("PDucDat", "pdda@gmail,com", 'm');

        // books[0] = new Book("Java Basic1", author1, 1000);
        // books[1] = new Book("Java Basic2", author1, 2000);
        // books[2] = new Book("Java Basic3", author1, 3000);
        // books[3] = new Book("Java Basic4", author1, 4000);

        // int qtyInStockAll = 0;
        // for (int i = 0; i < books.length; i++) {
        //     if (books[i] == null) {
        //         qtyInStockAll = i;
        //         break;
        //     }
        // }
        // System.out.println(qtyInStockAll);

        Author a1 = new Author("Vinh Tran", "pdd", 'f');
        Book b1 = new Book("JAVAS", a1, 1000);

        System.out.println(b1.getAuthor().getName());

    }
}
