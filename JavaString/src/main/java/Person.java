public class Person {
    private String name;
    private String country;
    private String city;
    private String age;

    public String getAge() {
        return this.age;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getName() {
        return this.name;
    }

    Person(String name, String country, String city, String age) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.age = age;
    }
}