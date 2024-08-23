package BehavioralPattern.ObserverPattern;

import java.util.ArrayList;

public class Publisher {

    ArrayList<Subscriber> subs = new ArrayList<>();
    int state=0;

    public void subscribe(Subscriber sub){
        subs.add(sub);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifySubs();
    }

    public void notifySubs(){
        for(Subscriber sub : subs){
            sub.update();
        }
    }
}
