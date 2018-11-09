package Module10;

import java.util.ArrayList;
import java.util.List;


public class Action {

    private Book book;
    private List <Book> books = new ArrayList<Book>();

    public List<Book> getBooks() {
        return books;
    }

    public void add(Book book) {
        books.add(book);
    }

    public boolean delete(Book book){
        return books.remove(book);
    }

    public void findByAuthor(String author) {
        for(Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book);
            }
        }
    }

    public void findByTitle(String title) {
        for(Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println(book);
            }
        }
    }

    public void findByYear(int year) {
        for(Book book : books) {
            if (book.getYear()== year) {
                System.out.println(book);
            }
        }
    }

    public void printTable1(String author) {
        for(Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("|           Title           |     Author     |   Year  |  Price     |");
                System.out.println("-----------------------------------------------------------------");
                System.out.println("|   " + book.getTitle() +"   |   " + book.getAuthor() + "   |   " + book.getYear()+"   |   $" + book.getPrice()+"   |");
                System.out.println("-----------------------------------------------------------------");
            }
        }
    }


    public void printTable2(String title) {
        for(Book book : books) {
            if (book.getTitle().equals(title)) {
                System.out.println("|           Title                                         |     Author         |   Year  |  Price       |");
                System.out.println("-----------------------------------------------------------------------------------------------------------");
                System.out.println("|   " + book.getTitle() +"   |   " + book.getAuthor() + "   |   " + book.getYear()+"   |   BYN" + book.getPrice()+"   |");
                System.out.println("-----------------------------------------------------------------------------------------------------------");
            }
        }
    }

    public void printTable3(int year){
        for(Book book: books){
            if(book.getYear()==year){
                System.out.println("|       Title    |     Author   |   Year  |  Price    |");
                System.out.println("--------------------------------------------------------");
                System.out.println("|   " + book.getTitle() +"   |   " + book.getAuthor() + "   |   " + book.getYear()+"   |   BYN" + book.getPrice()+"   |");
                System.out.println("--------------------------------------------------------");
            }
        }
    }

    public void printTable4(){
        for(Book book: books){

            System.out.println("|       Title    |     Author   |   Year  |  Price    |");
            System.out.println("--------------------------------------------------------");
            System.out.println("|   " + book.getTitle() +"   |   " + book.getAuthor() + "   |   " + book.getYear()+"   |   BYN" + book.getPrice()+"   |");
            System.out.println("--------------------------------------------------------");
        }
    }
}