package Persons;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Persons {
    private ArrayList<Person> _persons;

    public Persons() {
        this._persons = new ArrayList<Person>();
    }

    public void addPerson(Person person) {
        this._persons.add(person);
    }

    public String getPersons() {
        return this._getPersonsStringRepr(this._persons);
    }

    public String getSortedByAgePersons() {
        return this._getPersonsStringRepr(this._getSortedByAgePersons(new ArrayList<Person>(this._persons)));
    }

    public String getSortedByAgeAndGenderPersons() {
        return this._getPersonsStringRepr(this._getSortedByAgeAndGenderPersons());
    }

    private String _getPersonsStringRepr(ArrayList<Person> persons) {
        StringBuilder builder = new StringBuilder();
        for (Person person : persons) {
            builder.append(person);
            builder.append('\n');
        }
        return builder.toString();
    }

    private ArrayList<Person> _getSortedByAgePersons(ArrayList<Person> personsCopy) {
        for (int i = 0; i < personsCopy.size(); i++) {
            int minPersonAge = personsCopy.get(i).getAge();
            int minPersonAgeIndex = i;
            for (int j = i + 1; j < personsCopy.size(); j++) {
                int nextPersonAge = personsCopy.get(j).getAge();

                if (minPersonAge > nextPersonAge) {
                    minPersonAgeIndex = j;
                    minPersonAge = nextPersonAge;
                }
            }

            if (minPersonAge != personsCopy.get(i).getAge()) {
                Person bufPerson = personsCopy.get(i);
                personsCopy.set(i, personsCopy.get(minPersonAgeIndex));
                personsCopy.set(minPersonAgeIndex, bufPerson);
            }
        }

        return personsCopy;
    }

    private ArrayList<Person> _getSortedByAgeAndGenderPersons() {
        ArrayList<Person> womenPersons = new ArrayList<Person>();
        ArrayList<Person> menPersons = new ArrayList<Person>();

        for (int i = 0; i < this._persons.size(); i++) {
            if (this._persons.get(i).getGender() == Gender.FEMALE) {
                womenPersons.add(this._persons.get(i));
            } else {
                menPersons.add(this._persons.get(i));
            }
        }

        ArrayList<Person> womenSorted = this._getSortedByAgePersons(womenPersons);
        ArrayList<Person> menSorted = this._getSortedByAgePersons(menPersons);

        ArrayList<Person> sortedByAgeAndGenderPersons = new ArrayList<Person>();
        sortedByAgeAndGenderPersons.addAll(womenSorted);
        sortedByAgeAndGenderPersons.addAll(menSorted);

        return sortedByAgeAndGenderPersons;
    }
}
