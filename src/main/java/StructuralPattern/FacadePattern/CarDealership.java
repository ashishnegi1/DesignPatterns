package StructuralPattern.FacadePattern;

public class CarDealership {
    private Car dodge;
    private Car nissan;
    private Car toyota;

    public CarDealership(){
        dodge = new Dodge();
        nissan = new Nissan();
        toyota = new Toyota();
    }

    public void easyBuyDodge(){
        dodge.complicatedMethodToBuyCar();
    }
    public void easyBuyNissan(){
        nissan.complicatedMethodToBuyCar();
    }
    public void easyBuyToyota(){
        toyota.complicatedMethodToBuyCar();
    }
}
