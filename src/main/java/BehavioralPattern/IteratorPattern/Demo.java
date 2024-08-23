package BehavioralPattern.IteratorPattern;

public class Demo {
    public static void main(String[] args) {

        CarRepository carRepo = new CarRepository();

        carRepo.addCar(new Car("Lamborghini", "Urus"));
        carRepo.addCar(new Car("McLaren", "P1"));

        for( Iterator iter = carRepo.getIterator(); iter.hasNext(); ){
            Car car = (Car)iter.next();
            System.out.println(car.toString());
        }

    }
}
