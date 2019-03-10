package ir.alizeyn;

public class CloningProtectedSingleton extends CloneableSuperClass {

    private static CloningProtectedSingleton instance;

    private CloningProtectedSingleton() {
        System.out.println("Creating Singleton");
    }

    public static CloningProtectedSingleton getInstance() {
        if (instance == null) {
            instance = new CloningProtectedSingleton();
        }
        return instance;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
