import netflixDevices.Device;
import netflixPlans.Plan;

public class User {
    public String eMail;
    Plan plan;
    protected int numberOfParallelSreams;


    public User(String eMail, Plan plan) {
        this.eMail = eMail;
        this.plan = plan;
    }

    void watch(Device device, Movie movie) {
        if (this.numberOfParallelSreams < this.plan.getNumOfDevices()) {
            System.out.print("User " + this.eMail + " watches '" + movie + "'" + " on the " + device.getModel());
            numberOfParallelSreams++;
        } else if (this.numberOfParallelSreams >= this.plan.getNumOfDevices()) {
            System.out.print("You couldn't add a new device. You could upgrade your Netflix account to the Standard account");
        }
        System.out.println("User " + this.eMail + " watches " + movie.getTitle() + " with " + plan.getName() + " on " + device.getModel());
    }

    void watchHD(Device device, Movie movie) {
        if (plan.isHdAvailable()) {
            System.out.println("User " + this.eMail + " watches " + movie.getTitle() + " with " + plan.getName() + " on " + device.getModel() + " in HD");
        } else {
            System.out.println("You should upgrade your plan for watching in HD");
        }
    }

    void watchUltraHD(Device device, Movie movie) {
        if (device.isUltraHdSupported()) {
            if (plan.isUltraHDAvailable()) {
                System.out.println("User " + this.eMail + " watches " + movie.getTitle() + " with " + plan.getName() + " on " + device.getModel() + " in UltraHD");
            } else {
                System.out.println("You should upgrade your plan for watching in UltraHD");
            }
        } else {
            System.out.println("Your device does not support UltraHD quality");
        }


    }

}
