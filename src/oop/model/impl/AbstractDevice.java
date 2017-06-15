package oop.model.impl;

import java.util.Date;

/**
 * Created by Koka on 15.06.2017.
 */
public abstract class AbstractDevice implements oop.model.Device {
    @Override
    public int getIn() {
        return 0;
    }

    @Override
    public void setIn(int in) {
        if(in == 0){
            int temp = in;
            if (temp != 0 && temp<0){
                in = temp;
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
