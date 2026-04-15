import java.util.ArrayList;
import java.util.List;

/**
 * Generic repository for storing and managing items of any kind of type.
 * @param <T> : type of items stored in the repository
 */
public class Repository<T> {
    private List<T> items = new ArrayList<>();

    /**
     * Parameterized constructor with an initial list of items.
     * @param items : initial list of items
     */
    public Repository(List<T> items) {
        this.items = items;
    }

    /**
     * Adds an item to the list.
     * @param item  
     */
    public void add(T item) {
        items.add(item);
    }

    /**
     * Retrieves item at the specified index.
     * @param index : index of the item
     * @return the item at the specified index
     */
    public T get(int index) {
        return items.get(index);
    }

    /**
     * Method that returns the entire list.
     * @return the list
     */
    public List<T> getAll() {
        return items;
    }

    /**
     * Method that returns the number of items.
     * @return number of items
     */
    public int size() {
        return items.size();
    }
}
