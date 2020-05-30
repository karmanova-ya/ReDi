package exercise1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadFile {
    static String path = "/Users/yanakarmanova/Desktop/Dev/ReDi/sherlock.txt";

    public static void main(String[] args) {

        try {
            FileReader readFile = new FileReader("/Users/yanakarmanova/Desktop/Dev/ReDi/sherlock.txt");
            System.out.println("**********************************************************");
// Read the file with a Scanner
            Scanner input = new Scanner(readFile);
            int count = 0;
            while (input.hasNext()) {
                System.out.println(input.nextLine());
                count++;
            }
            System.out.println(count);
            System.out.println("**********************************************************");
// Read the file with the readAllLines utility from Files
            System.out.println(Files.readAllLines(Paths.get(path)));

        } catch (FileNotFoundException var3) {
            System.out.println("File is not there");
            System.exit(-1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException npe) {
            System.out.println("Empty line");
        }
    }
}
