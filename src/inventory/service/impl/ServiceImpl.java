package inventory.service.impl;


import inventory.model.Device;
import inventory.service.Service;

/**
 * Created by Koka on 15.06.2017.
 */
public class ServiceImpl implements Service {

    @Override
    public void sortByIN(Device[] devices) {
        Device[] temp = new Device[devices.length];
        for (int i = 0; i < devices.length; i++) {
            if (devices[i] == null) {

            }
            int in = devices[i].getIn();
            if (in > 0){
                temp[i] = devices[i];
            }
        }
    }

    @Override
    public void filtrateByType(Device[] devices, String type) {
        for (int i = 0; i < devices.length; i++) {
            if(devices[i].getType().compareTo(type) != 0){
                devices[i] = null;
            }
        }
    }
}
