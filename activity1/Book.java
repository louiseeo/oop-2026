package activity1;

public class Book {
    String title; // title
    String author; // author
    String isbn; // isbn
    String publicationDate; // pub date

    // parameterless constructor
    public Book(){}

    // parameterized constructor 
    public Book(String title, String author, String isbn, String publicationDate){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
    }

    // print the book information
    void printBookInfo() {
        System.out.println("\nTitle: " + title);
        System.out.println("Author: " + author);
        System.out.println("isbn: " + isbn);
        System.out.println("Publication Date: " + publicationDate);
        System.out.println("-----------------------------------");

    }
}
