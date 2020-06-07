package netflixAccounts;

import netflixDevices.Device;

public class StandardUser extends BasicUser {
    private static final int MAX_NUMBER_OF_PARALL_SCREENS = 2;

    public StandardUser(String email, double price) {
        super(email, price);
    }

    public void watchHD(Device device, String movie) {
        if (this.numberOfParallelSreams < MAX_NUMBER_OF_PARALL_SCREENS) {
            System.out.print("User " + this.email + " watches '" + movie + "'" + " on the " + device.getModelOfDevice() + " in HD");
            numberOfParallelSreams++;
        } else if (this.numberOfParallelSreams >= MAX_NUMBER_OF_PARALL_SCREENS) {
            System.out.print("You couldn't add a new device. You could upgrade your Netflix account to the Premium account");
        }
        System.out.println();
    }

    @Override
    public int getMaxNumberOfParallScreens() {
        return MAX_NUMBER_OF_PARALL_SCREENS;
    }
}
