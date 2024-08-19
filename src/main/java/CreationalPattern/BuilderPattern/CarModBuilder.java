package CreationalPattern.BuilderPattern;

public class CarModBuilder {

    public CarMods glamMods(){
        CarMods car = new CarMods();
        car.addItem(new Headlights());
        car.addItem(new TailLights());
        car.addItem(new LeatherSeat());
        return car;
    }

    public CarMods performanceMods(){
        CarMods car = new CarMods();
        car.addItem(new Spoilers());
        car.addItem(new Exhaust());
        return  car;
    }

}
