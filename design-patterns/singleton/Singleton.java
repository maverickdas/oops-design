package singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            System.out.println("New instance created..");
            instance = new Singleton();
            return instance;
        }
        else {
            System.out.println("Existing instance reused..");
            return instance;
        }
    }
}
