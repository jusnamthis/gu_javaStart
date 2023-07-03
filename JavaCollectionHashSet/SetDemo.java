import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class SetDemo<E> {
    private HashMap<E, Object> set;
    private final Object VALUE;

    private ArrayList<E> addingOrder;

    public SetDemo() {
        set = new HashMap<E, Object>();
        VALUE = new Object();
        addingOrder = new ArrayList<E>();
    }

    public void add(E elem) {
        this.set.put(elem, VALUE);
        addingOrder.add(elem);
    }

    public E getElemByIndex(int index) {
        return this.addingOrder.get(index);
    }

    public boolean remove(E key) {
        return this.set.remove(key) == VALUE;
    }

    public int size() {
        return this.set.size();
    }

    public boolean isEmpty() {
        return this.set.isEmpty();
    }

    public Iterator<E> iterator() {
        return this.set.keySet().iterator();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Iterator<E> setIter = this.iterator();

        while (setIter.hasNext()) {
            builder.append(String.format("%d ", setIter.next()));
        }

        return builder.toString();
    }

}
