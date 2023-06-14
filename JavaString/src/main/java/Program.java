public class Program {
    public static void main(String[] args) {
        JSONHandler jsh = new JSONHandler("/home/gege/code/gb/java/gu_javaStart/JavaString/src/main/resources/person_example.json");
        String[][] objs = jsh.parseJSON();
    }
}
