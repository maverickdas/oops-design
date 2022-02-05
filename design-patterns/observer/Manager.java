package observer;

public class Manager {
    public static void main(String[] args) {
        Observable observable = new Observable();
        Observer ob1 = new Observer("1");
        Observer ob2 = new Observer("2");
        observable.addObserver(ob1);
        observable.addObserver(ob2);
        observable.changeState("test");

        Observer ob3 = new Observer("3");
        observable.addObserver(ob3);
        observable.changeState("test2");

        observable.removeObserver(ob2);
        observable.changeState("test3");
    }
}
