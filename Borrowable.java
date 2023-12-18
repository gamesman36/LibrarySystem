import java.time.LocalDate;

public interface Borrowable {
    /**
     * Borrow an item.
     * @param user The user who is borrowing the item.
     * @param dueDate The date when the item is due to be returned.
     * @return true if the item is successfully borrowed, false otherwise.
     */
    boolean borrowItem(User user, LocalDate dueDate);

    /**
     * Return an item.
     * @return true if the item is successfully returned, false otherwise.
     */
    boolean returnItem();
}