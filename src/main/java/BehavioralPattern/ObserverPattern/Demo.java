package BehavioralPattern.ObserverPattern;

public class Demo {
    public static void main(String[] args) {

        Publisher publisher = new Publisher();

        Subscriber ps1 = new PhysicalSubscriber("Suresh");
        publisher.subscribe(ps1);
        Subscriber ps2 = new PhysicalSubscriber("Naresh"); // Only subscribed ones will get update

        Subscriber ds1 = new DigitalSubscriber("Vicky");
        publisher.subscribe(ds1);
        Subscriber ds2 = new DigitalSubscriber("Ronny"); // Only subscribed ones will get update

        publisher.setState(2024);

    }
}
