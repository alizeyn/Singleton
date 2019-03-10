package ir.alizeyn;

public class MySingleton {

    private static MySingleton instance;

    private MySingleton() {
        System.out.println("Creating Singleton");
    }

    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }
}
