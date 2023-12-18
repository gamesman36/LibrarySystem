import java.util.List;

public interface Searchable {
    /**
     * Search for items by title.
     * @param title The title to search for.
     * @return a list of items matching the title.
     */
    List<Item> searchByTitle(String title);

    /**
     * Search for items by author.
     * @param author The author to search for.
     * @return a list of items matching the author.
     */
    List<Item> searchByAuthor(String author);
}