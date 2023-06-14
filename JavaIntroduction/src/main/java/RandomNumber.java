import java.util.Random;

public class RandomNumber {
    private int _number;

    public RandomNumber(int minVal, int maxVal) {
        Random rnd = new Random();
        this._number = rnd.nextInt(minVal, maxVal);
    }

    public int getMostSignificantBit() {
        int numberCopy = this._number;
        int divisionReminder = 0;

        while (numberCopy > 0) {
            divisionReminder = numberCopy % 10;
            numberCopy /= 10;
        }

        return divisionReminder;
    }

    public ExpandableArray getMultiplesForNumber(int number, int rightBound) {
        int counter = this._number;
        ExpandableArray multiplesNumbers = new ExpandableArray();

        while (counter <= rightBound) {
            if (counter % number == 0) {
                multiplesNumbers.push(counter);
            }
            ++counter;
        }

        return multiplesNumbers;
    }

    public ExpandableArray getNotMultiplesForNumber(int number, int leftBound) {
        int counter = leftBound;
        ExpandableArray notMultiplesNumbers = new ExpandableArray();

        while (counter <= this._number) {
            if (counter % number != 0) {
                notMultiplesNumbers.push(counter);
            }
            ++counter;
        }

        return notMultiplesNumbers;
    }

    public String toString() {
        return "<" + this._number + ">";
    }
}