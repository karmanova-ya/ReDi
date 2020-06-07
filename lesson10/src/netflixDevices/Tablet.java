package netflixDevices;

public class Tablet implements Device{

    String model;
    double diagonal;

    public Tablet(String model, double diagonal) {
        this.model = model;
        this.diagonal = diagonal;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public double getDiagonal() {
        return this.diagonal;
    }

    @Override
    public boolean isUltraHdSupported() {
        return true;
    }
}
