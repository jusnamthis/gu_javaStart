public class PersonJSONHandler extends JSONHandler{
    PersonJSONHandler(String filename) {
        super(filename);
    }

    public Person[] getPersons(String[][] personsData) {
        Person[] persons = new Person[personsData.length];

        for (int i = 0; i < personsData.length; i++) {
            String name = personsData[i][0];
            String country = personsData[i][1];
            String city = personsData[i][2];
            String age = personsData[i][3];

            persons[i] = new Person(name, country, city, age);
        }

        return persons;
    }
}
