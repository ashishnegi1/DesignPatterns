package CreationalPattern.FactoryPattern;

public class Demo {

    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle vehicle1 = vehicleFactory.getVehicle("car");
        vehicle1.run();

        Vehicle vehicle2 = vehicleFactory.getVehicle("bike");
        vehicle2.run();

        Vehicle vehicle3 = vehicleFactory.getVehicle("cycle");
        vehicle3.run();
    }

}
