package AppController;


import Persons.Persons;
import Persons.Person;
import UserCommunicator.UserCommunicator;

public class AppController {

    private UserCommunicator userCommunicator;
    private Persons persons;

    public void runAPP() {
        userCommunicator = new UserCommunicator();
        persons = new Persons();

        this._performRequest();
    }

    private void _performRequest() {
        int actionId = userCommunicator.getNextAction();

        switch (actionId) {
            case 2:
                System.out.println(persons.getPersons());
                this._performRequest();
                break;
            case 3:
                this._addPerson();
                break;
            case 4:
                this._showPersonsSortedByAge();
                break;
            case 5:
                this._showPersonsSortedByAgeAndGender();
                break;
        }
    }

    private void _addPerson() {
        String[] personData = userCommunicator.requestPersonData();
        persons.addPerson(new Person(personData));
        this._performRequest();
    }

    private void _showPersonsSortedByAge() {
        System.out.println(persons.getSortedByAgePersons());
        this._performRequest();
    }

    private void _showPersonsSortedByAgeAndGender() {
        System.out.println(persons.getSortedByAgeAndGenderPersons());
        this._performRequest();
    }
}
