package PhoneBook;

import Contact.Contact;
import PhoneNumber.PhoneNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class PhoneBook {
    /** Хранит данные в формате имя контакта - объект контакта.
     * Выбор такой структуры хранения данных обсуловлен тем, что современные смартфоны часто хранят не только
     * ФИО и номер телефона, а также могут хранить адрес(а) электронной почты, адрес(а) фактического проживания,
     * место работы и множество другой информации о контакте.
     * Таким образом класс Contact можно расширять, не прибегая к изменению структуры хранения данных.
     * */
    private HashMap<String, Contact> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String contactName, String phoneNumber, String additionalInfo) {
        Contact contact = this.getContactData(contactName);
        PhoneNumber number = new PhoneNumber(phoneNumber, additionalInfo);
        contact.addNumber(number);
    }

    public void removeContact(String contactName) {
        this.contacts.remove(contactName);
    }

    public void showContacts() {
        ArrayList<Contact> contactsByNumbersAmount = new ArrayList<>(this.contacts.values());

        contactsByNumbersAmount.sort((prev, next) -> next.getNumbersAmount() - prev.getNumbersAmount());

        for (var contact: contactsByNumbersAmount) {
            System.out.println(contact);
        }
    }

    private Contact getContactData(String contactName) {
        if (this.contacts.containsKey(contactName)) {
            return this.contacts.get(contactName);
        }

        Contact newContact = new Contact(contactName);
        this.contacts.put(contactName, newContact);

        return newContact;
    }
}
