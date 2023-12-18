public class Book extends Item {
    private String author; // Attribute to store the author's name

    // Update the constructor to include the author
    public Book(String id, String title, String author) {
        super(id, title); // Calls the constructor of the superclass Item
        this.author = author; // Initializes the author attribute
    }

    // Method to get the author's name
    public String getAuthor() {
        return author;
    }

    // Other methods and attributes of the Book class...
    // Make sure to include any other necessary methods like setters or additional getters
}