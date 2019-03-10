package ir.alizeyn;

public enum ReflectionProtectedSingleton {
    INSTANCE;

    /**
     * enums constructor is private by default
     * below code is for the sake of explicit
     */
    private ReflectionProtectedSingleton() {
        System.out.println("Creating ReflectionProtectedSingleton");
    }

    public void foo() {
        System.out.println("foo");
    }

    public void bar() {
        System.out.println("bar");
    }
}
