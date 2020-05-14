package exercise1_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input here - ");
        try {
            int data = input.nextInt();
            System.out.println(data);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}
