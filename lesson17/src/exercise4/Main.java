package exercise4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input here - ");
        try {
            //input file path
            String fileName = input.next(); //   readFile.txt from GitHub
            //open the file for reading line by line
            File fileIn = new File(fileName);
            Files.lines(fileIn.toPath())
                    .map(s -> s.trim())
                    .filter(s -> !s.isEmpty())
                    .forEach(System.out::println);
        }catch (IOException ex){
            System.out.println("Check that the path is entered correctly");
        }finally {
            input.close();
            System.out.println("Cleanup completed");
        }
    }
}
