package INTRO;

/**
 * Books
 */ 
class Books {
    String title;
    String author;
}
public class BookTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gataby";
        myBooks[2].title = "The Java cookbook";

        myBooks[0].author = "Bob";
        myBooks[1].author = "Aue";
        myBooks[2].author = "Lan";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x+=1;
        }
    }
}
