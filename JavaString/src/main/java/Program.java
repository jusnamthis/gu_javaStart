public class Program {
    public static void main(String[] args) {
        doMainTask();
        doFirstAdditionalTask();
        doSecondAdditionalTask();
        doThirdAdditionalTask();
    }

    public static void doMainTask() {
        PersonJSONHandler pHandler = new PersonJSONHandler("/home/gege/code/gb/java/gu_javaStart/JavaString/src/main/resources/person_example.json");
        Person[] persons = pHandler.getPersons(pHandler.parseJSON());
        SQLCommunicator.printPersonsSQLResponses(persons);
    }

    public static void doFirstAdditionalTask() {
        MarkJSONHandler mHandler = new MarkJSONHandler("/home/gege/code/gb/java/gu_javaStart/JavaString/src/main/resources/marks_example.json");
        Mark[] marks = mHandler.getMarks(mHandler.parseJSON());

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }

    public static void doThirdAdditionalTask() {
        String example = ".3 + 1.56 = ";
        String[] splittedExample = example.split(" ");
        float firstNumber = Float.parseFloat(splittedExample[0]);
        float secondNumber = Float.parseFloat(splittedExample[2]);

        System.out.println(example + (firstNumber + secondNumber));
    }

    public static void doSecondAdditionalTask() {
        String example = "BaMS";
        example = example.repeat(10000);

        printStringReplacementTime(example);
        printBuilderReplacementTime(new StringBuilder(example));
    }

    public static void printStringReplacementTime(String example) {
        long start = System.currentTimeMillis();
        example = example.replace('a', 'A');

        System.out.println("Replacing time for STRING: " + (System.currentTimeMillis() - start));
    }

    public static void printBuilderReplacementTime(StringBuilder example) {
        long start = System.currentTimeMillis();
        //example = example.replace('a', 'A');

        int index = example.indexOf("a");

        while (index != -1) {
            example.replace(index, index + 1, "A");
            index = example.indexOf("a");
        }

        System.out.println("Replacing time for STRINGBUILDER: " + (System.currentTimeMillis() - start));
    }
}
