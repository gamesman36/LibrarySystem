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

    // Method to borrow an item
    public void borrowItem(Item item) {
        if (item.isAvailable()) {
            item.setAvailable(false);
            borrowedItems.add(item);
        }
    }

    // Method to return an item
    public void returnItem(Item item) {
        item.setAvailable(true);
        borrowedItems.remove(item);
    }

    // Getters and setters
    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public List<Item> getBorrowedItems() {
        return borrowedItems;
    }

    // Additional methods can be added here
}