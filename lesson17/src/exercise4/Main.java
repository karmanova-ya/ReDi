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
            String fileName = input.next(); //   /Users/yanakarmanova/Desktop/Dev/ReDi/readFile.txt
            Files.lines(new File(fileName).toPath())
                    .map(s -> s.trim())
                    .filter(s -> !s.isEmpty())
                    .forEach(System.out::println);
        }catch (IOException ex){
            System.out.println("Check that the path is entered correctly");
        }
    }
}
