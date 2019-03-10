package ir.alizeyn;

import java.io.Serializable;

public class SerializationProtectedSingleton implements Serializable {
    private static SerializationProtectedSingleton instance;

    private SerializationProtectedSingleton() {
        System.out.println("Creating SerializationProtectedSingleton");
    }

    public static SerializationProtectedSingleton getInstance() {
        if (instance == null) {
            instance = new SerializationProtectedSingleton();
        }
        return instance;
    }

    /**
     * For Serializable and Externalizable classes,
     * the readResolve method allows a class to replace/resolve the
     * object read from the stream before it is returned to the caller.
     * By implementing the readResolve method, a class can directly control
     * the types and instances of its own instances being deserialized
     */
    protected Object readResolve(){
        return instance;
    }
}
