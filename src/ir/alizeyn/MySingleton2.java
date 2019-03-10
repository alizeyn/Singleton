package ir.alizeyn;

public class MySingleton2 {

    public static final MySingleton2 INSTANCE;

    static {
        INSTANCE = new MySingleton2();
    }

    private MySingleton2() {
        System.out.println("Creating MySingleton 2");
    }
}
