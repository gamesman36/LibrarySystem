import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryCatalogue implements Searchable {
    private List<Item> items; // Assuming Item is a class that represents items in the library

    public LibraryCatalogue() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    @Override
    public List<Item> searchByAuthor(String author) {
        return items.stream()
                .filter(item -> item.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    @Override
    public List<Item> searchByTitle(String title) {
        return items.stream()
                .filter(item -> item.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }

    // Additional search methods can be added here
}