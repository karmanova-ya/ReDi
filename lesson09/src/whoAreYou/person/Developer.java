package whoAreYou.person;

import java.util.ArrayList;

public class Developer extends Person {
    private ArrayList<String> programLang = new ArrayList<>();

    public Developer(String name, int age, String city) {
        super(name, age, city);
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.print("I write in: ");
        for (String s : programLang) {
            System.out.print(s + ", ");
        }
    }

    public ArrayList<String> getProgramLang() {
        return programLang;
    }
}
