import CollectionsWorkers.ArrayListWorker;

public class Program {
    public static void main(String[] args) {
        ArrayListWorker listWorker = new ArrayListWorker(10);
        listWorker.fillWithRandomValues(5, 20);

        System.out.println(listWorker.getList());

        listWorker.excludeEvenNumbers();

        System.out.println(listWorker.getList());
        System.out.println(listWorker.getMaxValue());
        System.out.println(listWorker.getMinValue());
        System.out.println(listWorker.getAverage());
    }
}
