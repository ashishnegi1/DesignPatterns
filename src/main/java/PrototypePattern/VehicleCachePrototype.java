package PrototypePattern;

import java.util.HashMap;

public class VehicleCachePrototype {

    private static int id = 1;
    private static HashMap<Integer, Vehicle> vehicleMap = new HashMap<Integer, Vehicle>();

    public static Vehicle getVehicle(int vehicleId){
        if(vehicleMap.containsKey(vehicleId)) {
            Vehicle cachedVehicle = vehicleMap.get(vehicleId);
            return cachedVehicle.clone();
        } else return null;
    }

    public static void createVehicle(String vehicleType) {

        // This is a function with heavy calculations and costly db operations, that's why we use clone when copying the object instead of making a new one and copying its insides.

        if(vehicleType==null) return;
        if(vehicleType.equalsIgnoreCase("CAR")){
            Vehicle vehicle = new Car();
            vehicle.setId(id);
            vehicleMap.put(id++, vehicle);
        }else if(vehicleType.equalsIgnoreCase("BIKE")){
            Vehicle vehicle = new Bike();
            vehicle.setId(id);
            vehicleMap.put(id++, vehicle);
        }
        return;
    }

}
