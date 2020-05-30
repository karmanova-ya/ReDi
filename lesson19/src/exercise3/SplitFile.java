package exercise3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SplitFile {
    File story;
    static String path = "/Users/yanakarmanova/Desktop/Dev/ReDi/sherlock.txt";
    static String newPath = "/Users/yanakarmanova/Desktop/Dev/ReDi/The Adventures/";

    // Method to split the file
    public static void splitAdventure() throws IOException {
        FileWriter writer = null;
        try {
            int i = 0;
            List<String> strings = Files.readAllLines(Paths.get(path));
            for (String line : strings) {
                if (line.startsWith("ADVENTURE") || line.equals("The Project Gutenberg EBook of The Adventures of Sherlock Holmes")) {
                    System.out.println(line);
                    if (writer != null) {
                        writer.close();
                    }
                    // Save each part to a different file
                    writer = new FileWriter(newPath + "Adventure" + i + ".txt");
                    i++;
                }
                if (writer != null) {
                    writer.append(line);
                    System.out.println(line);
                    writer.append(System.lineSeparator());
                }
            }
        } catch (IOException ioe) {
            System.out.println("File problem");
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }

    public static void main(String[] args) {
        try {
            splitAdventure();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
