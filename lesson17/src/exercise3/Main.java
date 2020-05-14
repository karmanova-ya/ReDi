package exercise3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Peach");
        fruits.add(null);


        try {
            System.out.println(fruits.get(5)); //IndexOutOfBoundsException
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Wrong index");
        }

        try {
            for (String fruit : fruits) { //NullPointerException
                System.out.println(fruit.length());
            }
        } catch (NullPointerException ex) {
            System.out.println("No String here");
        }

    }
}
