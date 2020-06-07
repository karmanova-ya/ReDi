package whoAreYou.person;

public class Main {
    public static void main(String[] args) {
        whoAreYou.person.Student student = new whoAreYou.person.Student("Flo", 25, "Berlin");
        student.introduce();

        whoAreYou.person.Teacher teacher = new whoAreYou.person.Teacher("Alina", "Berlin", "Java", 5);
        teacher.introduce();
        teacher.teach("Java");

        Doctor doc = new Doctor("Who", "Gallifrey", "Save the Universe");
        doc.introduce();

        Dentist den = new Dentist("Den", "New York");
        den.introduce();

        Developer dev = new Developer("David", 28, "London");
        dev.getProgramLang().add("Java");
        dev.getProgramLang().add("JavaScript");
        dev.getProgramLang().add("Kotlin");
        dev.getProgramLang().add("Go");
        dev.introduce();
    }
}
