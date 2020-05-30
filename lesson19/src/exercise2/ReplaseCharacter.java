package exercise2;

import java.io.*;
import java.util.Scanner;

public class ReplaseCharacter {
    static String path = "/Users/yanakarmanova/Desktop/Dev/ReDi/sherlock.txt";
    static String newPath = "/Users/yanakarmanova/Desktop/Dev/ReDi/The Adventures of Yana Karmanova.txt";

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

// Save the data to a new file
            writer.write(newContent);
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            createNewFile();
            System.out.println("You created your story " + "<<" + newPath.substring(38) + ">>");
        } catch (
                FileNotFoundException var3) {
            System.out.println("File is not there");
            System.exit(-1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException npe) {
            System.out.println("Empty line");
        }
    }
}
