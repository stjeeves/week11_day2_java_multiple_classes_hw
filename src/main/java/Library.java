import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity){
        this.capacity = capacity;
        this.collection = new ArrayList<Book>();
    }

    public int collectionCount() {
        return collection.size();
    }

    public void addBook(Book book) {
        if (this.collectionCount() <= this.capacity) {
            this.collection.add(book);
        }
    }

}
