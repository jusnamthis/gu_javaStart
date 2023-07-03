package Persons;

public class Person {
    private String _lastName;
    private String _middlename;
    private String _firstName;
    private int _age;
    private Gender _gender;

    public Person(String[] personData) {
        this._lastName = personData[0];
        this._firstName = personData[1];
        this._middlename = personData[2];
        this._age = Integer.parseInt(personData[3]);
        this._gender = Gender.values()[Integer.parseInt(personData[4])];
    }

    public int getAge() {
        return this._age;
    }

    public Gender getGender() {
        return this._gender;
    }

    @Override
    public String toString() {
        return String.join(
                " ",
                this._lastName,
                this._firstName,
                this._middlename,
                Integer.toString(this._age),
                this._gender.toString());
    }
}

enum Gender {
    FEMALE {
        @Override
        public String toString() {
            return "(Женщина)";
        }
    },
    MALE {
        @Override
        public String toString() {
            return "(Мужчина)";
        }
    }
}
