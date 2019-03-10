package ir.alizeyn;

public class GenericSingleton<T> {
    private static final GenericSingleton<?> instance = new GenericSingleton<>();
    private T data;


    private GenericSingleton() {
    }

    public static GenericSingleton<?> getInstance() {
        return instance;
    }

    public T getData() {
        return this.data;
    }
}
