import java.util.Arrays;

public class ExpandableArray {
    private int[] _arr;

    public ExpandableArray() {
        this._arr = new int[0];
    }

    public String toString() {
        return Arrays.toString(this._arr);
    }

    public int[] toArr() {
        int[] arrCopy = new int[this._arr.length];
        this._copyNumbersToNewArray(arrCopy);
        return arrCopy;
    }

    public void push(int n) {
        int[] newArr = this._generateNewArray();
        this._copyNumbersToNewArray(newArr);

        newArr[newArr.length - 1] = n;
        this._arr = newArr;
    }

    private int[] _generateNewArray() {
        int newArrayLength = this._arr.length + 1;
        int[] newArray = new int[newArrayLength];
        return newArray;
    }

    private void _copyNumbersToNewArray(int[] newArr) {
        for (int i = 0; i < this._arr.length; i++) {
            newArr[i] = this._arr[i];
        }
    }
}
