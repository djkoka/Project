package com.netcracker.edu.inventory.model.impl;

import com.netcracker.edu.inventory.model.Device;

/**
 * Created by Nata on 15.06.2017.
 */
public class Router extends AbstractDevice implements Device{
    protected int dataRate;

    public int getDataRate() {
        return dataRate;
    }

    public void setDataRate(int dataRate) {
        this.dataRate = dataRate;
    }
}
