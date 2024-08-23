package BehavioralPattern.ObserverPattern;

public class PhysicalSubscriber implements Subscriber{
    String name;
    public PhysicalSubscriber(String name){
        this.name = name;
    }
    @Override
    public void update() {
        System.out.println("Updated Physical Subscriber : " + name);
    }
}
