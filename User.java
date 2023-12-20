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

    public void addBorrowedItem(Item item) {
        borrowedItems.add(item);
    }

    public void removeBorrowedItem(Item item) {
        borrowedItems.remove(item);
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}