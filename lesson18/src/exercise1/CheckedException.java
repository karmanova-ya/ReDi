package exercise1;

import java.util.Scanner;

public class CheckedException {

    boolean checkPhoneNumber(String phone) throws InvalidPhoneNumberException {
        if (phone.length() == 15) {
            if (phone.charAt(0) == '+') {
                String str = phone.substring(1, phone.length() - 1);
                Long.parseLong(str);
                return true;
            }
        }
        throw new InvalidPhoneNumberException("Invalid phone number");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        CheckedException ce = new CheckedException();
        try {
            System.out.println(ce.checkPhoneNumber(userInput));
        } catch (InvalidPhoneNumberException ipne) {
            System.out.println(ipne.getMessage());
        }
    }

}
