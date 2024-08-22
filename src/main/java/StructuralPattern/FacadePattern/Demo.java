package StructuralPattern.FacadePattern;

public class Demo {
    public static void main(String[] args) {
        CarDealership carDealership = new CarDealership();

        carDealership.easyBuyDodge();
        carDealership.easyBuyNissan();
        carDealership.easyBuyToyota();
    }
}
