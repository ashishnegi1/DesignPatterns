package CreationalPattern.PrototypePattern;

public class Bike extends Vehicle{

    public Bike(){
        type = "BIKE";
    }

    @Override
    void run() {
        System.out.println("Bike is running.");
    }
}
