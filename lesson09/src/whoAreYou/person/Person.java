package whoAreYou.person;

import java.util.ArrayList;

public class Person {

    protected String name;
    public int age;
    public String city;
    public ArrayList<Person> friends;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.friends = new ArrayList<>();
    }

    public void introduce() {
        System.out.println("**********************");
        System.out.println("My name is " + this.name);
        System.out.println("I'm " + this.age + " years old");
        System.out.println("I'm from " + this.city);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
