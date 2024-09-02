package BehavioralPattern.StrategyPattern;

public class RoadStrategy implements RouteStrategy{
    @Override
    public void execute() {
        System.out.println("Took the route through the road.");
    }
}
