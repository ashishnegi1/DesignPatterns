package CreationalPattern.AbstractFactoryPattern;

public class VehicleFactory extends AbstractVehicleFactory{

    @Override
    Vehicle getVehicle(String vehicleType) {
        if (vehicleType == null) return null;
        if (vehicleType.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("BIKE")){
            return new Bike();
        }
        return null;
    }
}
