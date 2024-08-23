package BehavioralPattern.ObserverPattern;

public class DigitalSubscriber implements Subscriber{
    String name;
    public DigitalSubscriber(String name){
        this.name = name;
    }
    @Override
    public void update() {
        System.out.println("Updated Digital Subscriber : " + name);
    }
}
