package StructuralPattern.AdapterPattern;

public class ManualCar implements AdvancedCar{
    @Override
    public void runOnGear(int gear, int speed) {
        System.out.println("Manual Car is running on gear " + gear + " at speed " + speed);
    }
}
