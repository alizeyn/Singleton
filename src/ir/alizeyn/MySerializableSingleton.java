package ir.alizeyn;

import java.io.Serializable;

public class MySerializableSingleton implements Serializable {
    private static MySerializableSingleton instance;

    private MySerializableSingleton() {
        System.out.println("Creating Singleton");
    }

    public static MySerializableSingleton getInstance() {
        if (instance == null) {
            instance = new MySerializableSingleton();
        }
        return instance;
    }
}
