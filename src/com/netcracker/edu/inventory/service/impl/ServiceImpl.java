package com.netcracker.edu.inventory.service.impl;


import com.netcracker.edu.inventory.model.Device;
import com.netcracker.edu.inventory.service.Service;

import java.util.Arrays;

public class ServiceImpl implements Service {

    @Override
    public void sortByIN(Device[] devices) {
        int countNull = 0;
        for (int i = 0; i < devices.length; i++) {
            if (devices[i] == null) {
                countNull++;
            }
        }
        int j = 0;
        Device[] devicesWithOutNull = new Device[devices.length - countNull];
        for (int i = 0; i < devices.length; i++) {
            if (devices[i] != null) {
                devicesWithOutNull[j] = devices[i];
                j++;
            }
        }
        j = 0;
        countNull = 0; 
        for (int i = 0; i < devicesWithOutNull.length; i++) {
            if (devicesWithOutNull[i].getIn() == 0) {
                countNull++;
            }
        }
        Device[] devicesWithOutNullAndZero = new Device[devicesWithOutNull.length - countNull];
        Device[] devicesZeroIn = new Device[countNull];
        int k = 0;
        for (int i = 0; i < devicesWithOutNull.length; i++) {
            if (devicesWithOutNull[i].getIn() != 0) {
                devicesWithOutNullAndZero[j] = devicesWithOutNull[i];
                j++;
            } else {
                devicesZeroIn[k] = devicesWithOutNull[i];
                k++;
            }
        }

        for (int i = 0; i < devicesWithOutNullAndZero.length - 1; i++) {
            if (devicesWithOutNullAndZero[i].getIn() > devicesWithOutNullAndZero[i + 1].getIn()) {
                Device device;
                device = devicesWithOutNullAndZero[i];
                devicesWithOutNullAndZero[i] = devicesWithOutNullAndZero[i + 1];
                devicesWithOutNullAndZero[i + 1] = device;
            }
        }
        for (int i = 0; i < devicesWithOutNullAndZero.length; i++) {
            devices[i] = devicesWithOutNullAndZero[i];
        }
        k = 0;
        for (int i = devicesWithOutNullAndZero.length; i < devicesWithOutNull.length; i++) {
            devices[i] = devicesZeroIn[k];
            k++;
        }
        for (int i = devicesZeroIn.length + devicesWithOutNullAndZero.length; i < devices.length; i++) {
            devices[i] = null;
        }
    }

    @Override
    public void filtrateByType(Device[] devices, String type) {
        if (type == null) {
            for (int i = 0; i < devices.length; i++) {
                if (devices[i] != null && devices[i].getType() != null) {
                    devices[i] = null;
                }
            }
            return;
        }
        for (int i = 0; i < devices.length; i++) {
            if (devices[i] != null) {
                if (devices[i].getType() == null)
                    devices[i] = null;
                else if (!devices[i].getType().equals(type)) {
                    devices[i] = null;
                }
            }
        }
    }
}
