package AbstractFactoryPattern;

public class VehicleFactoryProducer {
    public static AbstractVehicleFactory getFactory(boolean sports){
        if(sports){
            return new SportsVehicleFactory();
        } else return new VehicleFactory();
    }
}
