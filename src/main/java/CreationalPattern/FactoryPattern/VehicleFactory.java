package CreationalPattern.FactoryPattern;

public class VehicleFactory {

    Vehicle getVehicle(String vehicleType){
        if(vehicleType == null) return null;
        if(vehicleType.equalsIgnoreCase("CAR")){
            return new Car();
        }else if(vehicleType.equalsIgnoreCase("BIKE")){
            return new Bike();
        } else if(vehicleType.equalsIgnoreCase("CYCLE")){
            return new Cycle();
        }
        return null;
    }

}
