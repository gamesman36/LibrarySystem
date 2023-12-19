import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void showMenu() {
        System.out.println("LibrarySystem v. 1.0");
        System.out.println("© 2023 Daniel A. Wang\n");
    }

    public static ArrayList<Book> generateBooks() {
        ArrayList<Book> books = new ArrayList<>(Arrays.asList(
                new Book("1", "1984", "George Orwell"),
                new Book("2", "Brave New World", "Aldous Huxley"),
                new Book("3", "The C Programming Language", "Brian Kernighan, Dennis Ritchie")
        ));

        return books;
    }

    public static ArrayList<User> generateUsers() {
        ArrayList<User> users = new ArrayList<>(Arrays.asList(
                new User("1", "Daniel Andreas Wang"),
                new User("2", "Ola Nordmann")
        ));

        return users;
    }

    public static void listBooks() {
        var books = generateBooks();
        for(Book book : books) {
            var bookString = book.getId() + " \"" + book.getTitle() + "\" by " + book.getAuthor();
            System.out.println(bookString);
        }
        System.out.println();
    }

    public static void listUsers() {
        var users = generateUsers();
        for(User user : users) {
            var userString = user.getUserId() + " " + user.getName();
            System.out.println(userString);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        var books = generateBooks();
        var users = generateUsers();

        Library library = new Library();

        for(Book book : books) {
            library.addItem(book);
        }

        for(User user : users) {
            library.addUser(user);
        }
    }
}