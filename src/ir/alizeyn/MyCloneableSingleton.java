package ir.alizeyn;

public class MyCloneableSingleton extends CloneableSuperClass {

    private static MyCloneableSingleton instance;

    private MyCloneableSingleton() {
        System.out.println("Creating Singleton");
    }

    public static MyCloneableSingleton getInstance() {
        if (instance == null) {
            instance = new MyCloneableSingleton();
        }
        return instance;
    }

}
