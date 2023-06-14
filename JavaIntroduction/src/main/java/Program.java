public class Program {
    public static void main(String[] args) {
        RandomNumber i = new RandomNumber(1, 100);
        TaskLogger.logRandomNumber(i);

        int n = i.getMostSignificantBit();
        TaskLogger.logNumberMostSignificantBit(i, n);

        ExpandableArray m1 = i.getMultiplesForNumber(n, Short.MAX_VALUE);
        TaskLogger.logMultiplesForNumber(n, m1);

        ExpandableArray m2 = i.getNotMultiplesForNumber(n, Short.MIN_VALUE);
        TaskLogger.logNotMultiplesForNumber(n, m2);
    }
}
