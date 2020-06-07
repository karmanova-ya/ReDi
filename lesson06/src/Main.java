import java.util.*;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {

        Student bob = new Student("Bob", 36, false, "Berlin");
        Student alice = new Student("Alice", 25, true, "Moscow");
        Student john = new Student("John", 19, true, "San Fransisco");
        Student jane = new Student("Jane", 46, false, "Rio");

        jane.addFriend(bob);
        jane.addFriend(bob);
        jane.addFriend(alice);
        john.addFriend(alice);
        jane.introduce();
        john.introduce();


/*        Car mini = new Car("Mini Cooper", 50, 210, false, new String[]{"name1", "name2"});
        Car mini = new Car("Mini Cooper", 50, 210, false);

        mini.drive();
        mini.drive();
        mini.refuel();
        mini.drive();

//        Car ferrari = new Car();
//        ferrari.name = "Ferrari";
//        ferrari.broken = true;
//        ferrari.fuelLevel = 100;
//        ferrari.maxSpeed = 340;
//
//        ferrari.drive();
//
//        Car beatle = new Car();
*/

    }
}
