package CreationalPattern.SingletonPattern;

public class LimitedEditionCarSingletonPattern {

    private static LimitedEditionCarSingletonPattern oneOfOneGT = new LimitedEditionCarSingletonPattern();

    private LimitedEditionCarSingletonPattern(){}

    static LimitedEditionCarSingletonPattern getInstance(){
        return oneOfOneGT;
    }

    public void run(){
        System.out.println("This is a 1 of 1 GT car running.");
    }
}
