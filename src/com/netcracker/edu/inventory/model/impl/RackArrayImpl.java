package com.netcracker.edu.inventory.model.impl;

import com.netcracker.edu.inventory.model.Device;

import com.netcracker.edu.inventory.model.Rack;

public class RackArrayImpl implements Rack {
    protected int size;
    protected int index;
    protected Device[] devices;
    protected int in;
    protected Device device;

    public RackArrayImpl(int size) {
        if (size >= 0) {
            this.size = size;
            devices = new Device[size];
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getFreeSize() {
        int freeSpace = 0;
        for (int i = 0; i < size; i++) {
            if (devices[i] == null) {
                freeSpace++;
            }
        }
        return freeSpace;
    }

    @Override
    public Device getDevAtSlot(int index) {
        Device device = null;
        if (index < size && index >= 0) {
            if (devices[index] != null) {
                device = devices[index];
            }
        }
        return device;
    }

    @Override
    public boolean insertDevToSlot(Device device, int index) {
        boolean empty = false;
        if (device != null && index >= 0 && index < size) {
            if (devices[index] == null & device.getIn() >= 1) {
                empty = true;
                devices[index] = device;
            }
        }
        return empty;
    }

    @Override
    public Device removeDevFromSlot(int index) {
        Device device = null;
        if (index < size && index >= 0) {
            if (devices[index] != null) {
                device = devices[index];
                devices[index] = null;
            }
        }
        return device;
    }

    @Override
    public Device getDevByIN(int in) {
        for (int i = 0; i < devices.length; i++) {
            if (devices[i] != null && devices[i].getIn() == in) {
                return devices[i];
            }
        }
        return null;
    }
}
