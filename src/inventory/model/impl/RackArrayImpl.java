package inventory.model.impl;

import inventory.model.*;
import inventory.model.Rack;

/**
 * Created by Nata on 15.06.2017.
 */
public class RackArrayImpl implements Rack {
    protected int size;
    protected int index;
    protected Device[] devices;
    protected int in;

    public RackArrayImpl(int size) {
        if(size > 0){
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
            if(devices[i] == null){
                freeSpace++;
            }
        }
        return freeSpace;
    }

    @Override
    public Device getDevAtSlot(int index) {
        Device device = null;
        if(devices[index] != null){
            device = devices[index];
        }
        return device;
    }

    @Override
    public boolean insertDevToSlot(Device device, int index) {
        boolean empty = false;
        if (devices[index] == null && device.getIn() > 0) {
            empty = true;
            devices[index] = device;
        }
        return empty;
    }

    @Override
    public Device removeDevFromSlot(int index) {
        if (devices[index]!= null){
            devices[index]= null;
        }
        return devices[index];
    }

    @Override
    public Device getDevByIN(int in) {
        Device device;

        return null;
    }
}
