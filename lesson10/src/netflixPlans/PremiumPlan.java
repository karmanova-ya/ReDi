package netflixPlans;

public class PremiumPlan implements Plan {
    public String getName(){
        return "Premium";
    }
    @Override
    public double getPrice() {
        return 15.99;
    }

    @Override
    public int getNumOfDevices() {
        return 4;
    }

    @Override
    public boolean isHdAvailable() {
        return true;
    }

    @Override
    public boolean isUltraHDAvailable() {
        return true;
    }
}
