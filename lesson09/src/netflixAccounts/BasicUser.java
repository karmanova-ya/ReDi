package netflixAccounts;

import netflixDevices.Device;

public class BasicUser {

    protected String email;
    protected double price;
    protected int numberOfParallelSreams;
    private static final int MAX_NUMBER_OF_PARALL_SCREENS = 1;

    public BasicUser(String email, double price) {
        this.email = email;
        this.price = price;
    }

    public void stopWatch(){    //will make one screen available, if it was used
        if (numberOfParallelSreams>0){
            numberOfParallelSreams--;
        }
    }

    public void watch(Device device, String movie) {
        if (this.numberOfParallelSreams < MAX_NUMBER_OF_PARALL_SCREENS) {
            System.out.print("User " + this.email + " watches '" + movie + "'" + " on the " + device.getModelOfDevice());
            numberOfParallelSreams++;
        } else if (this.numberOfParallelSreams >= MAX_NUMBER_OF_PARALL_SCREENS) {
            System.out.print("You couldn't add a new device. You could upgrade your Netflix account to the Standard account");
        }
        System.out.println();
    }


    public int getMaxNumberOfParallScreens() {
        return MAX_NUMBER_OF_PARALL_SCREENS;
    }
}
