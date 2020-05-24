package exercise2;

import java.util.Scanner;

public class Main {

    public static void checkUser(User user) throws InvalidUserEcxeption {
        if (user.getFirstName().length() >= 10 && user.getFirstName().length() <= 20 && !user.getFirstName().contains(" ")) {
            if (user.getLastName().length() >= 10 && user.getLastName().length() <= 20 && !user.getLastName().contains(" ")) {
                if (user.getDay() % 2 == 0) {
                    if (user.getMonth() % 2 != 0) {
                        if (user.getYear() >= 1300 && user.getYear() < 1400) {
                            System.out.println(user.printUser());
                        }
                    }
                }
            }
        } else {
            throw new InvalidUserEcxeption("The user " + user.getFirstName() + " is not valid");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Please, enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Please, enter a day of your birth: ");
        Integer dayOfBirth = scanner.nextInt();
        System.out.print("Please, enter a month of your birth: ");
        Integer monthOfBirth = scanner.nextInt();
        System.out.print("Please, enter a year of your birth: ");
        Integer yaerOfBirth = scanner.nextInt();

        User user = new User(firstName, lastName, dayOfBirth, monthOfBirth, yaerOfBirth);
        try {
            checkUser(user);
        } catch (InvalidUserEcxeption iue) {
            System.out.println(iue.getMessage());
        }
    }
}