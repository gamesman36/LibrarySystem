public class Book extends Item implements Borrowable {
    private String title;
    private String author;
    private String ISBN;
    private User borrower;
    private LocalDate dueDate;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.borrower = null;
        this.dueDate = null;
    }

    @Override
    public void borrowItem(User user, LocalDate dueDate) {
        this.borrower = user;
        this.dueDate = dueDate;
    }

    @Override
    public void returnItem() {
        this.borrower = null;
        this.dueDate = null;
    }

    // Getters and setters for title, author, ISBN, borrower, dueDate

    public void printDetails() {
        // Implement method to print details of the book
    }
}