import java.time.LocalDate;

public class Book extends Item implements Borrowable {
    private String author;

    public Book(String id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean borrowItem(User user, LocalDate dueDate) {
        if(this.isAvailable()) {
            this.setAvailable(false);
            user.addBorrowedItem(this);
        }
        return true;
    }

    @Override
    public boolean returnItem() {
        this.setAvailable(true);
        return true;
    }
}