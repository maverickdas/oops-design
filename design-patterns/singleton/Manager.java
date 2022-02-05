package singleton;

public class Manager {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton q = Singleton.getInstance();
        s = Singleton.getInstance();
    }
}
