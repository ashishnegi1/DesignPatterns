package BehavioralPattern.CommandPattern;

public class Demo {

    public static void main(String[] args) {

        Car car = new Car();
        Order buyCar = new BuyCar(car);    //requests as objects
        Order sellCar = new SellCar(car);  //requests as objects

        CarDealership carDealership = new CarDealership();

        carDealership.takeOrder(buyCar);
        carDealership.takeOrder(buyCar);
        carDealership.takeOrder(sellCar);

        carDealership.executeOrder();

    }

}
