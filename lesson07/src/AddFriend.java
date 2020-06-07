import java.util.ArrayList;

public class AddFriend {
    public static void main(String[] args) {


        ArrayList<Student> students = new ArrayList<>();

        Student bob = new Student("Bob", 36, false, "Berlin");
        Student alice = new Student("Alice", 25, true, "Moscow", students);
        Student john = new Student("John", 19, true, "San Fransisco");
        Student jane = new Student("Jane", 46, false, "Rio");

        jane.addFriend(bob);
        jane.addFriend(alice, true);
        john.addFriend(alice);
        alice.addFriend(bob);

        jane.firendsHandshakes(students, "Bob", "John");


    }
}
