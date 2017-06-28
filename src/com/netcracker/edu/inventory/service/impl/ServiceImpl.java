package com.netcracker.edu.inventory.service.impl;


import com.netcracker.edu.inventory.model.Device;
import com.netcracker.edu.inventory.service.Service;

import java.util.Arrays;

public class ServiceImpl implements Service {

    @Override
    public void sortByIN(Device[] devices) {
        int calNull = 0;
        int[] arr = new int[devices.length];
        for (int i = 0; i < devices.length; i++) {
            if (devices[i] == null) {
                calNull++;
            } else {
                arr[i] = devices[i].getIn();
            }
        }
        Arrays.sort(devices);

/*        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }*/
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
                else if (!devices[i].getType().equals(type) ) {
                    devices[i] = null;
                }
            }
        }
    }
}
