package PrototypePattern;

public class Car extends Vehicle{

    public Car(){
        type = "CAR";
    }

    @Override
    void run() {
        System.out.println("Car is running.");
    }
}
