package BehavioralPattern.StrategyPattern;

public class Vehicle {
    private RouteStrategy routeStrategy;

    public Vehicle(RouteStrategy routeStrategy){
        this.routeStrategy = routeStrategy;
    }
    public void executeStrategy(){
        this.routeStrategy.execute();
    }
}
