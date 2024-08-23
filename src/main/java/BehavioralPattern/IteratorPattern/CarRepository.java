package BehavioralPattern.IteratorPattern;

import java.util.ArrayList;
import java.util.Arrays;

public class CarRepository implements Container {
    ArrayList<Car> cars = new ArrayList<>(Arrays.asList(new Car("Mitsubishi","Lancer"), new Car("Rolls Royce","Phantom")));

    public void addCar(Car car){
        cars.add(car);
    }

    @Override
    public Iterator getIterator() {
        return new CarIterator();
    }

    private class CarIterator implements Iterator{

        int index=0;

        @Override
        public boolean hasNext() {
            return index < cars.size();
        }

        @Override
        public Object next() {
            return cars.get(index++);
        }
    }
}
