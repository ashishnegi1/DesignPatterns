package CreationalPattern.AbstractFactoryPattern;

public class Demo {

    public static void main(String[] args) {
        AbstractVehicleFactory vehicleFactory = VehicleFactoryProducer.getFactory(true);

        Vehicle vehicle1 = vehicleFactory.getVehicle("Car");
        vehicle1.run();
        Vehicle vehicle2 = vehicleFactory.getVehicle("Bike");
        vehicle2.run();

        AbstractVehicleFactory vehicleFactory1 = VehicleFactoryProducer.getFactory(false);

        Vehicle vehicle3 = vehicleFactory1.getVehicle("Car");
        vehicle3.run();
        Vehicle vehicle4 = vehicleFactory1.getVehicle("Bike");
        vehicle4.run();
    }
}
