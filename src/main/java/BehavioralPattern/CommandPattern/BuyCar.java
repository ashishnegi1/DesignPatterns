package BehavioralPattern.CommandPattern;

public class BuyCar implements Order{
    Car car;
    public BuyCar(Car car){
        this.car = car;
    }
    @Override
    public void execute() {
        car.buyCar();
    }
}
