package exercise1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    static String path = "/Users/yanakarmanova/Desktop/Dev/ReDi/sherlock.txt";
    static String newPath = "/Users/yanakarmanova/Desktop/Dev/ReDi/Adventures of Yana Karmanova.txt";

//Exercise 2
    public static boolean createNewFile() throws IOException {
        FileReader readFile = new FileReader(path);
        File fileToBeModified = new File(newPath);
        FileWriter writer = new FileWriter(fileToBeModified);
        Scanner input = new Scanner(readFile);
// Replace all occurrences of "Sherlock" and "Sherlock Holmes" with your own name
        while (input.hasNext()) {
            String newContent = input.nextLine()
                    .replaceAll("Mr. Holmes", "Mrs. Karmanova")
                    .replaceAll("Mr. Sherlock Holmes", "Mrs. Yana Karmanova")
                    .replaceAll("Sherlock", "Yana")
                    .replaceAll("Holmes", "Karmanova") + System.lineSeparator();

// Let your program save the data to a new file with the name "Adventures of your name"
            writer.write(newContent);
        }
        return true;
    }

    public static void main(String[] args) {
//Exercise 1
        try {
            FileReader readFile = new FileReader("/Users/yanakarmanova/Desktop/Dev/ReDi/sherlock.txt");
// Read the file with a Scanner
            System.out.println("**********************************************************");
            Scanner input = new Scanner(readFile);
            int count = 0;
            while (input.hasNext()) {

                System.out.println(input.nextLine());
                count++;
            }
            System.out.println(count);
// Read the file with the readAllLines utility from Files
            System.out.println("**********************************************************");
            System.out.println(Files.readAllLines(Paths.get(path)));

            System.out.println("**********************************************************");
            createNewFile();


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
