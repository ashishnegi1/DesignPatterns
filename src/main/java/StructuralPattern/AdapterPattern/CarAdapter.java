package StructuralPattern.AdapterPattern;

public class CarAdapter implements SimpleCar{
    AdvancedCar advancedCar;
    public CarAdapter(String type){
        if(type.equalsIgnoreCase("manual")){
            advancedCar = new ManualCar();
        } else if(type.equalsIgnoreCase("automatic")){
            advancedCar = new AutomaticCar();
        }
    }
    @Override
    public void run(int speed, String type) {
        int gear;
        if(speed<20){
            gear=1;
        }else if(speed<40){
            gear=2;
        }else if(speed<60){
            gear=3;
        }else if(speed<100){
            gear=4;
        }else{
            gear=5;
        }
        if(type.equalsIgnoreCase("manual")){
            advancedCar.runOnGear(gear, speed );
        } else if(type.equalsIgnoreCase("automatic")){
            advancedCar.runOnGear(gear, speed );
        }
    }
}
