package BehavioralPattern.CommandPattern;

public class SellCar implements Order{
    Car car;
    public SellCar(Car car){
        this.car = car;
    }
    @Override
    public void execute() {
        car.sellCar();
    }
}
