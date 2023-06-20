package CollectionsWorkers;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListWorker {
    private ArrayList<Integer> _list;
    private int _capacity;

    public ArrayListWorker(int capacity) {
        this._list = new ArrayList<Integer>(capacity);
        this._capacity = capacity;
    }

    public ArrayList<Integer> getList() {
        return this._list;
    }

    public void fillWithRandomValues(int minVal, int maxVal) {
        Random rnd = new Random();

        for (int i = 0; i < this._capacity; i++) {
            this._pushValue(rnd.nextInt(minVal, maxVal + 1));
        }
    }

    public void pushValue(int value) {
        this._pushValue(value);
    }

    public void excludeEvenNumbers () {
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        for (int number : this._list) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        this._list.removeAll(evenNumbers);
    }

    public int getMinValue() {
        if (!this._checkIfListIsEmpty()) {
            return 0;
        }

        int currentMinValue = this._list.get(0);
        for (int number : this._list) {
            if (currentMinValue > number) {
                currentMinValue = number;
            }
        }

        return currentMinValue;
    }

    public int getMaxValue() {
        if (!this._checkIfListIsEmpty()) {
            return 0;
        }

        int currentMaxValue = this._list.get(0);
        for (int number : this._list) {
            if (currentMaxValue < number) {
                currentMaxValue = number;
            }
        }

        return currentMaxValue;
    }

    public double getAverage() {
        if (!this._checkIfListIsEmpty()) {
            return 0;
        }

        double sum = 0;

        for (int number : this._list) {
            sum += number;
        }

        return sum / this._list.size();
    }

    public Object[] toArray() {
//        int[] arr = new int[this._list.size()];
//
//        for (int i = 0; i < this._list.size(); i++) {
//            arr[i] = this._list.get(i);
//        }
//
//        return arr;

        return this._list.toArray();
    }

    private boolean _checkIfListIsEmpty() {
        return this._list.size() > 0;
    }

    private void _pushValue(int value) {
        this._list.add(value);
    }
}
