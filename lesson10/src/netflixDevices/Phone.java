package netflixDevices;

import java.util.UUID;

public class Phone implements Device {

    UUID id;
    String model;
    double diagonal;

    public Phone(String model, double diagonal) {
        this.id = UUID.randomUUID();
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
        return false;
    }

    public UUID getId() {
        return id;
    }
}
