package BuilderPattern;

public class Demo {

    public static void main(String[] args) {

        CarModBuilder carModBuilder = new CarModBuilder();

        CarMods carMods1 = carModBuilder.glamMods();
        System.out.println("Glam Mods total price : " + carMods1.getCost());
        carMods1.showItems();

        CarMods carMods2 = carModBuilder.performanceMods();
        System.out.println("Performance Mods total price : " + carMods2.getCost());
        carMods2.showItems();

    }

}
