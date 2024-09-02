package BehavioralPattern.StrategyPattern;

public class Demo {
    public static void main(String[] args) {

        Vehicle car = new Vehicle(new FlyoverStrategy());
        car.executeStrategy();

        car = new Vehicle(new RoadStrategy());
        car.executeStrategy();
    }
}
