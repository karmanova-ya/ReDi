import netflixAccounts.BasicUser;
import netflixAccounts.PremiumUser;
import netflixAccounts.StandardUser;
import netflixDevices.Device;

public class Main {
    public static void main(String[] args) {
        Device tablet = new Device("Ipad", 9);
        Device tv = new Device("TV", 50);
        Device laptop = new Device("MacBook", 15);
        Device phone = new Device("Iphone", 5);

        BasicUser tim = new BasicUser("tim@gmail.com", 7.8);
        StandardUser yana = new StandardUser("yana@mail.com", 10.5);
        PremiumUser dima = new PremiumUser("dima@mail.com", 15);

        tim.watch(tablet, "Pets");
        tim.watch(tv, "Doctor Who");
        tim.stopWatch();
        tim.watch(tv, "Doctor Who");
        System.out.println("*********************************");

        yana.watchHD(tablet, "1+1");
        yana.watchHD(tv, "Little Women");
        yana.watchHD(laptop, "Jocker");
        System.out.println("*********************************");

        dima.watchUltraHD(tablet, "Die hard");
        dima.watchUltraHD(laptop, "Knives Out");
        dima.watchUltraHD(tv, "Avengers");
        dima.watchUltraHD(phone, "Long shot");
    }
}
