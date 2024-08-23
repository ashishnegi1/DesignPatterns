package BehavioralPattern.CommandPattern;

public class Car {

    private String name = "Ford";
    int quantity=0;

    public void buyCar(){
        quantity++;
        System.out.println(name + " car bought. Final quantity : " + quantity);
    }
    public void sellCar(){
        quantity--;
        System.out.println(name + " car sold. Final quantity : " + quantity);
    }
}
