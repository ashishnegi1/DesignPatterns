package BehavioralPattern.StrategyPattern;

public class FlyoverStrategy implements RouteStrategy{
    @Override
    public void execute() {
        System.out.println("Took the route through the flyover.");
    }
}
