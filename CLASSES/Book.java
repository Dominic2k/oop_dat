package CLASSES;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock = 0;

    public Book(String name, Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock ++;
    }
    public Book(String name, Author author, double price, int qtyInStock){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock += qtyInStock;
    }

    // public Book getBook(){
    //     return this;
    // }

    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public int getQtyInStock(){
        return qtyInStock;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAuthors(Author author){
        this.author = author;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setQtyInStock(int qtyInStock){
        this.qtyInStock += qtyInStock;
    }


    //"'book-name' by author-name (gender) at email".

    public String toString(){
        return this.name + " by " + this.author.getName() + " (" + this.author.getGender() +") at email: " + this.author.getEmail();
        
    }

    // public String[] getAuthorName(){
    //     String[] nameAuthors = new String[this.authors.length];
    //     for (int i = 0; i < this.authors.length; i++) {
    //         nameAuthors[i] = this.authors[i].getName();
    //     }
    //     return nameAuthors;
    // }

    // public String getAuthorEmail(){
    //     return this.getAuthor().getEmail();
    // }
}
