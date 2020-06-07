package netflixPlans;

public class BasicPlan implements Plan {

    public String getName(){
        return "Basic";
    }

    @Override
    public double getPrice() {
        return 7.99;
    }

    @Override
    public int getNumOfDevices() {
        return 1;
    }

    @Override
    public boolean isHdAvailable() {
        return false;
    }

    @Override
    public boolean isUltraHDAvailable() {
        return false;
    }
}
