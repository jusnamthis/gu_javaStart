package UserCommunicator;

import java.util.Scanner;

public class UserCommunicator implements Requested{
    public static final String[] ACTIONS = {
            "EXIT",
            "SHOW PERSONS",
            "ADD PERSON",
            "SORT BY AGE",
            "SORT BY AGE & GENDER"
    };
    public UserCommunicator() {
    }

    @Override
    public String[] requestPersonData() {
        String[] personData = new String[5];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите фамилию: ");
        personData[0] = scanner.next();
        System.out.print("Введите имя: ");
        personData[1] = scanner.next();
        System.out.print("Введите отчество: ");
        personData[2] = scanner.next();
        System.out.print("Введите возраст: ");
        personData[3] = scanner.next();
        System.out.print("Введите пол [0 - Ж, 1 - М]: ");
        personData[4] = scanner.next();

        return personData;
    }

    @Override
    public void requstIsSortNeeded() {
        System.out.println("Реализовали 2");
    }

    public int getNextAction() {
        this._showPossibleActions();
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Выберите действие [1 - %d]: ", UserCommunicator.ACTIONS.length);
        return scanner.nextInt();
    }

    private boolean _checkIfExitRequired() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Хотите ли вы выйти [y/n]: ");
        String exitDecision = scanner.next();

        if (exitDecision.toLowerCase().equals("y")) {
            return true;
        }
        return false;
    }

    private void _showPossibleActions() {
       for (int i = 0; i < UserCommunicator.ACTIONS.length; i++) {
           System.out.printf("%d. %s.%n", i + 1, UserCommunicator.ACTIONS[i]);
       }
    }
}
