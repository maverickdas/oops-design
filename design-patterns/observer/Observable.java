package observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private String state;
    private List<ObserverI> observers = new ArrayList<ObserverI>();

    public void addObserver(ObserverI o) {
        this.observers.add(o);
    }
    public void removeObserver(ObserverI o) {
        this.observers.remove(o);
    }
    public void changeState(String s) {
        this.state = s;
        for (ObserverI o: this.observers) {
            o.update(this.state);
        }
    }
}
