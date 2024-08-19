package StructuralPattern.AdapterPattern;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car();

        car.run(155, "manual");
        car.run(75, "automatic");
        car.run(25, "simple");
        car.run(25, "hybrid");
    }
}
