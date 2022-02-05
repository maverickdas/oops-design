package observer;

public class Observer implements ObserverI{
    private String name;
    private String state;
    Observer(String name) {
        this.name = name;
    }
    @Override
    public void update(Object o) {
        this.state = (String) o;
        this.display();
    }
    public void display() {
        System.out.println(this.name + ": news " + this.state + " .");
    }
}
