import java.util.Iterator;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        SetDemo<Integer> set = new SetDemo<>();

        Random rnd = new Random(0);
        for (int i = 0; i < 10; i++) {
            int rndVal = rnd.nextInt(50);
            System.out.println(rndVal);
            set.add(rndVal);
        }

        System.out.printf("Initial set: [ %s ]\n", set);
        System.out.printf("Initial set size: %d\n", set.size());

        System.out.printf("Fifth elem: %d\n", set.getElemByIndex(5));
        System.out.printf("Remove 0's elem: %b\n", set.remove(0));

        System.out.printf("Set after removing 0's elem: %s\n", set);
        System.out.printf("Set size after removin 0's elem: %d\n", set.size());

        System.out.printf("Is set empty: %b\n", set.isEmpty());

        // set iterator
        Iterator<Integer> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            System.out.printf("%d ", setIterator.next());
        }
    }
}