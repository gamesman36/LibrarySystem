public class Item {
    private String id;
    private String title;
    private boolean isAvailable;

    public Item(String id, String title) {
        this.id = id;
        this.title = title;
        this.isAvailable = true; // Items are available by default
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}