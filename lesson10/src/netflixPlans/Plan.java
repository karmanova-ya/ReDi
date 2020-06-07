package netflixPlans;

public interface Plan {

    String getName();

    double getPrice();

    int getNumOfDevices();

    boolean isHdAvailable();

    boolean isUltraHDAvailable();


}
