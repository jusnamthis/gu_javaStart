public class TaskLogger {
    public static void logRandomNumber(RandomNumber number) {
        System.out.println("The random number is: " + number);
    }

    public static void logNumberMostSignificantBit(RandomNumber number, int bit) {
        System.out.println("The most significant bit of the number " + number + " is: " + bit);
    }

    public static void logMultiplesForNumber(int n, ExpandableArray arr) {
        System.out.println("The multiples for number " + n + " is:");
        System.out.println("\t" + arr);
    }

    public static void logNotMultiplesForNumber(int n, ExpandableArray arr) {
        System.out.println("The not multiples for number " + n + " is:");
        System.out.println("\t" + arr);
    }
}
