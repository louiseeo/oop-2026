package activity1;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "The Hunger Games";
        book1.author = "Suzanne Collins";
        book1.isbn = "9780439023481";
        book1.publicationDate = "September 14 2008";

        Book book2 = new Book();
        book2.title = "The Subtle Art of Not Giving a Fuck";
        book2.author = "Mark Manson";
        book2.isbn = "9780062457714";
        book2.publicationDate = "September 13 2016";

        book1.printBookInfo();
        book2.printBookInfo();

        Book book3 = new Book("Romancing Mister Bridgerton", "Julia Quinn", "9783365010785", "July 1 2002");
        Book book4 = new Book("The Duke and I", "Julia Quinn", "9780063142121", "January 5 2000");

        book3.printBookInfo();
        book4.printBookInfo();
    }

}
