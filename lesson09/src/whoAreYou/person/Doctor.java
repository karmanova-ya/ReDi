package whoAreYou.person;

public class Doctor extends Person {

    public String speciality;

    public Doctor(String name, String city, String speciality) {
        super(name, 0, city);
        this.speciality = speciality;
    }

    @Override
    public void introduce() {
        System.out.println("**********************");
        System.out.println("My name is Dr. " + this.name);
        System.out.println("I'm from " + this.city);
        System.out.println("My speciality is " + this.speciality);
    }

    void checkUp(){System.out.println(this.name + " makes checkup ");}

    void prescribe(){
        System.out.println("Dr. " + this.name + " prescribes medicines");
    }
}
