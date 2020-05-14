package exercise1_2;

import java.util.HashSet;
import java.util.Set;
//Exercise 1
//In main method create a new HashSet of strings, add banana, apple, orange.
//Print content of sets using for loop
//Clear the set.
//Add one more element grapes.
//Check if set is empty, and if it’s not empty print “I am not empty!”. What is the order of elements after adding them to HashSet?

public class Fruits {
    public static void main(String[] args) {
//Create a new HashSet of strings, add banana, apple, orange
        Set<String> fruits = new HashSet<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("orange");

//Print content of sets using for loop
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

//Clear the set
        fruits.clear();

//Add one more element - grapes
        fruits.add("grapes");

//Check if set is empty, and if it’s not empty print “I am not empty!”.
        if (fruits.isEmpty()) {
            System.out.println("I'm empty");
        } else if (!fruits.isEmpty()) {
            System.out.println("I'm not empty");
        }
    }
}
