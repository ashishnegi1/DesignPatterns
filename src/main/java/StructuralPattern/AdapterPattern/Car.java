package StructuralPattern.AdapterPattern;

public class Car implements SimpleCar{
    CarAdapter carAdapter;
    @Override
    public void run(int speed, String type) {
        if(type.equalsIgnoreCase("manual") || type.equalsIgnoreCase("automatic")){
            carAdapter = new CarAdapter(type);
            carAdapter.run(speed, type);
        } else if(type.equalsIgnoreCase("simple")) {
            System.out.println("Car is running at speed " + speed);
        } else {
            System.out.println("Cannot run car of type : " + type);
        }
    }
}
