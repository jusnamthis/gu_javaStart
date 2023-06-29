package Contact;

import PhoneNumber.PhoneNumber;

import java.util.ArrayList;

public class Contact {
    private String contactName;
    private ArrayList<PhoneNumber> numbers;

    public Contact(String contactName) {
        this.contactName = contactName;
        this.numbers = new ArrayList<PhoneNumber>();
    }

    public void addNumber(PhoneNumber number) {
        this.numbers.add(number);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (PhoneNumber number : numbers) {
            builder.append("\t");
            builder.append(number.getPhoneNumber());
            builder.append("-");
            builder.append(number.getNumberInfo());
            builder.append("\n");
        }

        return builder.toString();
    }
}
