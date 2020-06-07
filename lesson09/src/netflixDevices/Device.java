package netflixDevices;

public class Device {
    protected String modelOfDevice;
    protected int diagonalSize;

    public Device(String modelOfDevice, int diagonalSize) {
        this.modelOfDevice = modelOfDevice;
        this.diagonalSize = diagonalSize;
    }

    public String getModelOfDevice() {
        return modelOfDevice;
    }

    public void setModelOfDevice(String modelOfDevice) {
        this.modelOfDevice = modelOfDevice;
    }

    public int getDiagonalSize() {
        return diagonalSize;
    }

    public void setDiagonalSize(int diagonalSize) {
        this.diagonalSize = diagonalSize;
    }
}
