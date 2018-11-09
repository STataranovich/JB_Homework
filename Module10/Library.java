package Module10;

public class Library {
    public static void main (String[] args) {

        Action books = new Action();

        Book book1 = new Book ("Jane Air", "Charlotte Bronte", 1847, 36);
        books.add(book1);
        Book book2 = new Book ("Harry Potter", "J. K. Rowling", 1997, 51);
        books.add(book2);
        Book book3 = new Book ("The Lord of the Rings", "J. R. R. Tolkien", 1954, 48);
        books.add(book3);

        System.out.println("Search by Author name ( = Charlotte Bronte)");
        books.findByAuthor("Charlotte Bronte");
        System.out.println(" ");
        books.printTable1("Charlotte Bronte");
        System.out.println(" ");

        System.out.println("Search by Title ( = Harry Potter)");
        books.findByTitle("Harry Potter");
        System.out.println(" ");
        books.printTable2("Harry Potter");
        System.out.println(" ");

        System.out.println ("Search by Year ( = 1954)");
        books.findByYear (1954);
        System.out.println(" ");
        books.printTable3 (1954);
        System.out.println(" ");

        books.delete(book2);
        System.out.println ("Results:");
        books.printTable4();

    }
}
