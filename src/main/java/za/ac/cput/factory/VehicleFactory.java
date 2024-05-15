package za.ac.cput.factory;

import za.ac.cput.domain.Vehicle;
import za.ac.cput.util.Helper;

public class VehicleFactory {
    public static Vehicle buildVehicle(long vehicleId, String manufacturer){
        if(Helper.isNullorEmpty(manufacturer) ||
            vehicleId <= 0)
            return null;

        return new Vehicle.Builder().setVehicle(vehicleId)
                .setManufacturer(manufacturer)
                .build();
    }
}
