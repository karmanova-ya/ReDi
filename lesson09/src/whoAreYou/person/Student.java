package whoAreYou.person;
import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<String> subjects;

    public Student(String name, int age, String city) {
        super(name, age, city);
    }

    public void study(String subject){
        System.out.println(name + " study: " + subjects);
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("My friends are:");
        for (Person s : friends) {
            System.out.println(s.name);
        }
    }
}
