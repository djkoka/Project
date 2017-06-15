package oop.service;


import oop.model.Device;

/**The interface Service describe list of services of Inventory component
 *
 * Created by makovetskyi on 05.10.2016.
 */
public interface Service {

    /**
     * Sort array of AbstractDevice-s by identification number.
     *
     * @param devices - array of AbstractDevice-s, that need to be sorted
     */
    void sortByIN(Device[] devices);

    /**
     * Filtrate array of AbstractDevice-s by type
     *
     * @param devices - array of AbstractDevice-s, that need to be filtrated
     * @param type - type of Devices, that will remain in the array after filtering
     */
    void filtrateByType(Device[] devices, String type);
    
}
