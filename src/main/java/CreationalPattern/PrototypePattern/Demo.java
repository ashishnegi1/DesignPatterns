package CreationalPattern.PrototypePattern;

public class Demo {
    public static void main(String[] args) {

        VehicleCachePrototype.createVehicle("car");
        VehicleCachePrototype.createVehicle("car");
        VehicleCachePrototype.createVehicle("bike");

        Vehicle vehicle1 = VehicleCachePrototype.getVehicle(1);
        vehicle1.run();
        System.out.println("Vehicle type : " + vehicle1.getType());

        Vehicle vehicle2 = VehicleCachePrototype.getVehicle(2);
        vehicle2.run();
        System.out.println("Vehicle type : " + vehicle2.getType());

        Vehicle vehicle3 = VehicleCachePrototype.getVehicle(3);
        vehicle3.run();
        System.out.println("Vehicle type : " + vehicle3.getType());


    }
}
