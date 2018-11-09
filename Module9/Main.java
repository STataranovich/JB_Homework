package Module9;

public class Main {
    public static void main(String[] args) {
        Book anyBook = new Fiction("Jane Air", 1990, 36);
        System.out.println (anyBook.toString());
        Ebook anyebook = new Ebook("Java for beginners","150MB", 15);
        System.out.println (anyebook.toString());
        History anyhistory = new History ("Rech Pospolitaja", "Belarus", "46MB", 9);
        System.out.println (anyhistory.toString());
        Magazine anymagazine = new Magazine("Cosmopolitan", 7, "October");
        System.out.println(anymagazine.toString());
    }
}
