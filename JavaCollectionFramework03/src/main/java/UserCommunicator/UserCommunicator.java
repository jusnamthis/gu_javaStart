package UserCommunicator;

import PhoneBook.PhoneBook;

import java.util.Scanner;

public class UserCommunicator {
    private PhoneBook phoneBook;

    public UserCommunicator() {
        phoneBook = new PhoneBook();
    }

    private int getAction() {
        System.out.println("0.EXIT\n1. ADD NEW PHONE NUMBER.\n2. REMOVE PHONE NUMBER.\n3. SHOW CONTACTS.");
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter action [0-3]: ");
        int actionType = Integer.parseInt(scn.next());
        return actionType;
    }

    public void startNextCommunication() {
        int actionId = this.getAction();

        switch (actionId) {
            case 0:
                return;
            case 1:
                var numberData = this.getNewNumber();
                phoneBook.addContact(numberData[0], numberData[1], numberData[2]);
                break;
            case 2:
                phoneBook.removeContact(this.getSomeData("name"));
                break;
            default:
                phoneBook.showContacts();
        }

        this.startNextCommunication();
    }

    private String[] getNewNumber() {
        String name = this.getSomeData("name");
        String number = this.getSomeData("number");
        String additionalInfo = this.getSomeData("additional info");

        var data = new String[] {name, number, additionalInfo};
        return data;
    }

    private String getSomeData(String message) {
        var scanner = new Scanner(System.in);
        System.out.printf("Enter %s: ", message);
        return scanner.next();
    }
}
