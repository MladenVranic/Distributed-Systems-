package sheet_one;

public class Book extends Publication{
    //attributes
    private final String author;
    private final long ISBN;

    //super needs to be implemented for attributes of super class
    public Book(String title, String language, double price,String author, long ISBN ){
        super(title, language, price);
        this.author = author;
        this.ISBN = ISBN;
    }

    //print method for values
    public void printValues(){
        System.out.println("title: " + super.title);
        System.out.println("language: " + super.language);
        System.out.println("Price: " + super.price);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.ISBN);


    }
}
