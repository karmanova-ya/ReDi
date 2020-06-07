package exercise3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
//Exercise 3
//Write a program that creates a map of students and the country they are from. Add 10 students from our class to this map.
// - use HashMap
// - what are the data types for key and value?
//1. Print to the console where the whoAreYou.person next to you comes from (using apropriate Map method)
//2. Print each entry in a format name: country
//3. Print all unique country names

public class Students {
    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();
        students.put("Burak", "Turkey");
        students.put("Olumide", "Nigeria");
        students.put("Yana", "Ukraine");
        students.put("Irina", "Kazakhstan");
        students.put("Stefan", "Germany");
        students.put("Flo", "Germany");

        students.forEach(
                (key, value) -> System.out.println("name: " + key + " country: " + value)
        );

        Set countries = new HashSet<>(students.values());
        System.out.println("Our students come from " + countries);
    }
}
