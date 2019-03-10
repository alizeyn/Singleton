package ir.alizeyn;

import java.io.Serializable;

public class MySingleton4 implements Serializable {

    public static final MySingleton4 INSTANCE;

    static {
        INSTANCE = new MySingleton4();
    }

    private MySingleton4() {
        System.out.println("Creating MySingleton 4");
    }

    // implement readResolve method
    protected Object readResolve() {
        return INSTANCE;
    }
}
