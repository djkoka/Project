package inventory.model.impl;

import inventory.model.Device;

/**
 * Created by Nata on 15.06.2017.
 */
public class WifiRouter extends Router implements Device {
    String securityProtocol;

    public String getSecurityProtocol() {
        return securityProtocol;
    }

    public void setSecurityProtocol(String securityProtocol) {
        this.securityProtocol = securityProtocol;
    }
}
