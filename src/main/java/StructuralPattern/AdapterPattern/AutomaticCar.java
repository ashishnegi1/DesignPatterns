package StructuralPattern.AdapterPattern;

public class AutomaticCar implements  AdvancedCar{
    @Override
    public void runOnGear(int gear, int speed) {
        System.out.println("Automatic Car is running on gear " + gear + " at speed " + speed);
    }
}
