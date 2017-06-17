package inventory.service.impl;

import inventory.model.Device;

/**
 * Created by Koka on 15.06.2017.
 */
public class ServiceImpl implements inventory.service.Service {
    @Override
    public void sortByIN(Device[] devices) {
        for (int i = 0; i <devices.length; i++) {
            if (devices[i] == null){
                int j = devices.length;
                devices[i] = devices[j];
            }
        }
    }

    @Override
    public void filtrateByType(Device[] devices, String type) {

    }
}
