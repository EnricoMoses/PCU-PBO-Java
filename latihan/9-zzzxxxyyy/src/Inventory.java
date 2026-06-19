import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Inventory<T extends Equipment> {
    private ArrayList<T> items = new ArrayList<>();

    public Inventory() {
    }

    public void addItem(T item) {
        items.add(item);
    }
    public void display(Comparator<T> comparator) {
        ArrayList<T> copyItems = new ArrayList<>(items);

        Collections.sort(copyItems, comparator);

        for (T item : copyItems) {
            System.out.println(item.getDescription());
        }
    }
}
