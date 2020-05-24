package exercise3;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        String options[] = {"r", "p", "s"};
        playGame(options);
    }

    public static String playGame(String[] options) {
        System.out.println("Please choose of these options: 'r', 'p' or 's'");
        System.out.println("NOTE: Enter 'e' for exit");
        Scanner scanner = new Scanner(System.in);
        String userOption = scanner.nextLine();

        int userWins = 0;
        int compWins = 0;
        int round = 0;
        String winner = null;
        int rnd = new Random().nextInt(options.length);
        String compOption = options[rnd];
        boolean isFinished = false;

        while (!isFinished) {
        try {
            validateUserInout(userOption);
        } catch (InvalidUserOptionEcxeption invalidUserOptionEcxeption) {
            invalidUserOptionEcxeption.printStackTrace();
            System.out.println("Try again: ");
            userOption = scanner.nextLine();
        }

            if (userOption.equals("r")) {
                if (compOption.equals("s")) {
                    userWins++;
                    round++;
                    winner = "You win";
                    System.out.println("Round #" + round + " - " + winner);
                    System.out.println("You: " + userWins);
                    System.out.println("Computer: " + compWins);
                } else if (compOption.equals("p")) {
                    compWins++;
                    round++;
                    winner = "Computer wins";
                    System.out.println("Round #" + round + " - " + winner);
                    System.out.println("You: " + userWins);
                    System.out.println("Computer: " + compWins);
                } else if (compOption.equals("r")) {
                    round++;
                    winner = "You have a tie";
                    System.out.println("Round #" + round + " - " + winner);
                    System.out.println("You: " + userWins);
                    System.out.println("Computer: " + compWins);
                }
            } else if (userOption.equals("s")) {
                if (compOption.equals("p")) {
                    userWins++;
                    round++;
                    winner = "You win";
                    System.out.println("Round #" + round + " - " + winner);
                    System.out.println("You: " + userWins);
                    System.out.println("Computer: " + compWins);
                } else if (compOption.equals("r")) {
                    compWins++;
                    round++;
                    winner = "Computer wins";
                    System.out.println("Round #" + round + " - " + winner);
                    System.out.println("You: " + userWins);
                    System.out.println("Computer: " + compWins);
                } else if (compOption.equals("s")) {
                    round++;
                    winner = "You have a tie";
                    System.out.println("Round #" + round + " - " + winner);
                    System.out.println("You: " + userWins);
                    System.out.println("Computer: " + compWins);
                }
            } else if (userOption.equals("p")) {
                if (compOption.equals("r")) {
                    userWins++;
                    round++;
                    winner = "You win";
                    System.out.println("Round #" + round + " - " + winner);
                    System.out.println("You: " + userWins);
                    System.out.println("Computer: " + compWins);
                } else if (compOption.equals("s")) {
                    compWins++;
                    round++;
                    winner = "Computer wins";
                    System.out.println("Round #" + round + " - " + winner);
                    System.out.println("You: " + userWins);
                    System.out.println("Computer: " + compWins);
                } else if (compOption.equals("p")) {
                    round++;
                    winner = "You have a tie";
                    System.out.println("Round #" + round + " - " + winner);
                    System.out.println("You: " + userWins);
                    System.out.println("Computer: " + compWins);
                }
            } else if (userOption.equals("e")) {
                isFinished = true;
                System.out.println("*******************************");
                System.out.println("* In this game " + winner + " *");
                System.out.println("*******************************");
            }

            if (userWins > compWins) {
                winner = "You win!";
            } else if (compWins > userWins) {
                winner = "Computer wins!";
            } else {
                winner = "You have a tie";
            }

            userOption = scanner.next();
            rnd = new Random().nextInt(options.length);
            compOption = options[rnd];
        }
        return winner;
    }

    private static void validateUserInout(String userOption) throws InvalidUserOptionEcxeption {
        if (userOption == null || userOption.equals("") || (!userOption.equals("r") && !userOption.equals("s") && !userOption.equals("p") && !userOption.equals("e"))) {
            throw new InvalidUserOptionEcxeption("Clarify your input");
        }
    }
}