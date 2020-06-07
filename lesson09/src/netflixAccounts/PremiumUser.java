package netflixAccounts;

import netflixDevices.Device;

public class PremiumUser extends StandardUser {
    private static final int MAX_NUMBER_OF_PARALL_SCREENS = 3;

    public PremiumUser(String email, double price) {
        super(email, price);
    }

    public void watchUltraHD(Device device, String movie) {
        if (this.numberOfParallelSreams < MAX_NUMBER_OF_PARALL_SCREENS) {
            System.out.print("User " + this.email + " watches '" + movie + "'" + " on the " + device.getModelOfDevice() + " in UltraHD");
            numberOfParallelSreams++;
        } else if (this.numberOfParallelSreams >= MAX_NUMBER_OF_PARALL_SCREENS) {
            System.out.print("You couldn't add a new device");
        }
        System.out.println();
    }

    @Override
    public int getMaxNumberOfParallScreens() {
        return MAX_NUMBER_OF_PARALL_SCREENS;
    }
}
