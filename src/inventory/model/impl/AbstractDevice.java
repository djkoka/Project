package inventory.model.impl;

import inventory.model.Device;

import java.util.Date;

/**
 * Created by Koka on 15.06.2017.
 */
public abstract class AbstractDevice implements Device {
    protected int in;
    protected String getType;

    @Override
    public int getIn() {
        return in;
    }

    @Override
    public void setIn(int in) {
        if(in > 0){
            if(this.in == 0){
                this.in = in;
            }
        }
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public void setType(String type) {

    }

    @Override
    public String getManufacturer() {
        return null;
    }

    @Override
    public void setManufacturer(String manufacturer) {

    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public void setModel(String model) {

    }

    @Override
    public Date getProductionDate() {
        return null;
    }

    @Override
    public void setProductionDate(Date productionDate) {

    }
}
