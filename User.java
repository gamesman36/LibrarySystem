import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String name;
    private List<Item> borrowedItems;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.borrowedItems = new ArrayList<>();
    }

    // Existing methods...

    // New method to add a borrowed item
    public void addBorrowedItem(Item item) {
        borrowedItems.add(item);
    }

    // New method to remove a returned item
    public void removeBorrowedItem(Item item) {
        borrowedItems.remove(item);
    }

    // Getters and setters...
}