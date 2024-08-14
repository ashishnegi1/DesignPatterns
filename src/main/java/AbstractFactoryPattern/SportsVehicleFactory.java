package AbstractFactoryPattern;

public class SportsVehicleFactory extends AbstractVehicleFactory{
    @Override
    Vehicle getVehicle(String vehicleType) {
        if (vehicleType == null) return null;
        if (vehicleType.equalsIgnoreCase("CAR")) {
            return new SportsCar();
        } else if (vehicleType.equalsIgnoreCase("BIKE")){
            return new SportsBike();
        }
        return null;
    }
}
