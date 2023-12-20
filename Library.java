import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class Library {
    private List<Item> items;
    private List<User> users;

    public Library() {
        items = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addItem(Item item) {
        // Optional: Check if the item already exists to avoid duplicates
        if (!items.contains(item)) {
            items.add(item);
        }
    }

    public void addUser(User user) {
        // Optional: Check if the user already exists to avoid duplicates
        if (!users.contains(user)) {
            users.add(user);
        }
    }

    public boolean checkOut(Item item, User user) {
        if (item instanceof Borrowable && item.isAvailable()) {
            ((Borrowable) item).borrowItem(user, LocalDate.now().plusDays(30)); // Assuming a 30-day borrowing period
            user.addBorrowedItem(item);
            return true;
        }
        return false;
    }

    public boolean returnItem(Item item, User user) {
        if (item instanceof Borrowable) {
            ((Borrowable) item).returnItem();
            user.removeBorrowedItem(item);
            return true;
        }
        return false;
    }
}