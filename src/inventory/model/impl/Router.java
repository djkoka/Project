package inventory.model.impl;

import inventory.model.Device;

/**
 * Created by Nata on 15.06.2017.
 */
public class Router extends AbstractDevice implements Device{
    protected int dateRate;

    public int getDateRate() {
        return dateRate;
    }

    public void setDateRate(int dateRate) {
        this.dateRate = dateRate;
    }
}
