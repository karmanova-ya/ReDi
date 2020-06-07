package whoAreYou.person;

public class Teacher extends Person {

    private String subject;

    private int yearsOfExperience;

    public Teacher(String name,String city, String subject, int yearsOfExperience) {
        super(name, 0, city);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void teach(String subject){
        System.out.println(name + " teaches " + this.subject);
    }

    public void introduce(){
//        super.introduce();
        System.out.println("My name is " + this.name);
        System.out.println("My subject is " + this.subject);
        System.out.println("Years of experience " + this.yearsOfExperience);
    }

}
