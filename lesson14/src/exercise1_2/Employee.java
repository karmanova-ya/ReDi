package exercise1_2;

import java.util.HashMap;
import java.util.TreeMap;
//Exercise 1
//Make a Map that associates the following employee IDs with names.
//Keys and values of Maps can be any Object type, so in real life you would probably have the key be a String
// and the associated value be a Person or Employee object.
// To make things simpler on this exercise, you can use String for both the ID and the name,
// rather than bothering to create a Person or Employee class.
//The point here is to associate keys with values, then retrieve values later based on keys.

public class Employee {

    public static void main(String[] args) {
        System.out.println("************HashMap************");

        HashMap<String, String> employees = new HashMap<>();

        employees.put("a1234", "Steve Jobs");
        employees.put("a1235", "Bill Gates");
        employees.put("a1236", "Jeff Bezos");
        employees.put("a1237", "Larry Page");
        employees.put("a1238", "Sergey Brin");
        employees.put("a1239", "Sergey Brin");

        System.out.println(employees);

        employees.forEach(
                (key, value) -> System.out.println("key is " + key + " value is " + value)
        );

        System.out.println("************TReeMap************");

        TreeMap<String, String> employeesTreeMap = new TreeMap<>();
        employeesTreeMap.put("a1234", "Steve Jobs");
        employeesTreeMap.put("a1235", "Bill Gates");
        employeesTreeMap.put("a1236", "Jeff Bezos");
        employeesTreeMap.put("a1237", "Larry Page");
        employeesTreeMap.put("a1238", "Sergey Brin");
        employeesTreeMap.put("a1239", "Sergey Brin");
        employeesTreeMap.put("A1239", "Apper case");

        employeesTreeMap.forEach(
                (key, value) -> System.out.println("key is " + key + " value is " + value)
        );
    }
}
