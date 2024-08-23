package BehavioralPattern.CommandPattern;

import java.util.ArrayList;

public class CarDealership {
    // takes requests -> turns them into objects -> executes them when needed.
    ArrayList<Order> orders = new ArrayList<Order>();

    public void takeOrder(Order order){
        orders.add(order);
    }
    public void executeOrder(){
        for(Order order : orders) order.execute();
        orders.clear();
    }
}
