package BehavioralPattern.IteratorPattern;

public class Car {

    String brand;
    String model;

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return ("This car is a " + brand + " " + model + ".");
    }
}
