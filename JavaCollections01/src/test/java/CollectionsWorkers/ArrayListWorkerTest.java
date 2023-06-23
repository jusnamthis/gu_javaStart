package CollectionsWorkers;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListWorkerTest {

    @org.junit.jupiter.api.Test
    void excludeEvenNumbers() {
        ArrayListWorker worker = new ArrayListWorker(10);
        ArrayList<Integer> expected = new ArrayList<Integer>();

        for (int i = -10; i <= 11; i++) {
            worker.pushValue(i);

            if (i % 2 != 0) {
                expected.add(i);
            }
        }

        worker.excludeEvenNumbers();

        assertArrayEquals(expected.toArray(), worker.toArray());
    }

    @org.junit.jupiter.api.Test
    void getMinValue() {
        ArrayListWorker worker = new ArrayListWorker(10);
        worker.pushValue(-100);
        worker.pushValue(-19993);
        worker.pushValue(112);
        worker.pushValue(990);

        assertEquals(-19993, worker.getMinValue());
    }

    @org.junit.jupiter.api.Test
    void getMaxValue() {
        ArrayListWorker worker = new ArrayListWorker(10);
        worker.pushValue(100);
        worker.pushValue(19993);
        worker.pushValue(112);
        worker.pushValue(990);

        assertEquals(19993, worker.getMaxValue());
    }

    @org.junit.jupiter.api.Test
    void getAverage() {
        ArrayListWorker worker = new ArrayListWorker(10);
        worker.pushValue(100);
        worker.pushValue(19993);
        worker.pushValue(112);
        worker.pushValue(990);

        assertEquals(5298.75, worker.getAverage());
    }
}