package ir.alizeyn;

public class MySingleton {

    private static MySingleton instance;
    public static int counter;

    private MySingleton() {
        System.out.println("Creating Singleton " + ++counter);
    }

    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }
}
