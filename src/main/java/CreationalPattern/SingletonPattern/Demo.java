package CreationalPattern.SingletonPattern;

public class Demo {
    public static void main(String[] args) {

//        LimitedEditionCarSingletonPattern car = new LimitedEditionCarSingletonPattern();
//        This statement gives error due to private constructor.

        LimitedEditionCarSingletonPattern GT = LimitedEditionCarSingletonPattern.getInstance();
        GT.run();
    }
}
