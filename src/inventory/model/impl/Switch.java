package inventory.model.impl;

import inventory.model.Device;

/**
 * Created by Nata on 15.06.2017.
 */
public class Switch extends Router implements Device {
    protected int numberOfPorts;

    public int getNumberOfPorts() {
        return numberOfPorts;
    }

    public void setNumberOfPorts(int numberOfPorts) {
        this.numberOfPorts = numberOfPorts;
    }

}
