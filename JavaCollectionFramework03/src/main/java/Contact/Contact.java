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

    public int getNumbersAmount() {
        return this.numbers.size();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("*".repeat(10));
        builder.append(String.format("\n%s:\n", this.contactName));
        for (PhoneNumber number : numbers) {
            builder.append(String.format("\t%s - %s\n", number.getPhoneNumber(), number.getNumberInfo()));
        }
        builder.append("*".repeat(10));
        builder.append("\n");

        return builder.toString();
    }
}
