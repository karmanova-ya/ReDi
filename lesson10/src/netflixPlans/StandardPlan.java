package netflixPlans;

public class StandardPlan implements Plan {
    public String getName(){
        return "Standard";
    }
    @Override
    public double getPrice() {
        return 11.99;
    }

    @Override
    public int getNumOfDevices() {
        return 2;
    }

    @Override
    public boolean isHdAvailable() {
        return true;
    }

    @Override
    public boolean isUltraHDAvailable() {
        return false;
    }
}
