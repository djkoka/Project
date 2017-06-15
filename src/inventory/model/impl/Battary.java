package inventory.model.impl;

import inventory.model.Device;

/**
 * Created by Nata on 15.06.2017.
 */
public class Battary extends AbstractDevice implements Device{
     int chargeVolume;

    public int getChargeVolume() {
        return chargeVolume;
    }

    public void setChargeVolume(int chargeVolume) {
        this.chargeVolume = chargeVolume;
    }
}
