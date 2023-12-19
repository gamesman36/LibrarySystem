import java.util.ArrayList;

public class Main {
    public static void showMenu() {
        System.out.println("LibrarySystem v. 1.0");
        System.out.println("© 2023 Daniel A. Wang");
        System.out.println();
    }

    public static ArrayList<Book> generateBooks() {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("1", "1984", "George Orwell"));
        return books;
    }

    public static void listBooks() {
        var books = generateBooks();
        for(int i=0; i<books.size(); i++) {
            var bookString = books.get(i).getId() + " " + books.get(i).getTitle() + " " + books.get(i).getAuthor();
            System.out.println(bookString);
        }
    }

    public static void main(String[] args) {
        showMenu();
        listBooks();
    }
}