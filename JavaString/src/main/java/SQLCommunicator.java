public class SQLCommunicator {
    private static String personTemplate = "select * from students where ";

    public static void printPersonsSQLResponses(Person[] persons){
        for (int i = 0; i < persons.length; i++) {
            StringBuilder builder = new StringBuilder(personTemplate);

            Person person = persons[i];

            if (!person.getName().equals("null")) {
                builder.append("name = " + person.getName());
            }

            if (!person.getCountry().equals("null")) {
                builder.append(" AND ");
                builder.append("country = " + person.getCountry());
            }

            if (!person.getCity().equals("null")) {
                builder.append(" AND ");
                builder.append("city = " + person.getCity());
            }

            if (!person.getAge().equals("null")) {
                builder.append(" AND ");
                builder.append("age = " + person.getAge());
            }

            System.out.println(builder);
        }
    }
}
