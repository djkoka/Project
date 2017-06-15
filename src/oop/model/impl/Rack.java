package oop.model.impl;

import oop.model.*;
import oop.model.Device;

/**
 * Created by Koka on 15.06.2017.
 */
public class Rack implements oop.model.Rack {
    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public int getFreeSize() {
        return 0;
    }

    @Override
    public Device getDevAtSlot(int index) {
        return null;
    }

    @Override
    public boolean insertDevToSlot(Device device, int index) {
        return false;
    }

    @Override
    public Device removeDevFromSlot(int index) {
        return null;
    }

    @Override
    public Device getDevByIN(int in) {
        return null;
    }
}
