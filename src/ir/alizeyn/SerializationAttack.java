package ir.alizeyn;

import java.io.*;

public class SerializationAttack {
    public static void main(String[] args) {
        try {
            MySerializableSingleton instance1 = MySerializableSingleton.getInstance();
            ObjectOutput out
                    = new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(instance1);
            out.close();

            // deserialize from file to object
            ObjectInput in
                    = new ObjectInputStream(new FileInputStream("file.text"));

            MySerializableSingleton instance2 = (MySerializableSingleton) in.readObject();
            in.close();

            System.out.println(instance1.hashCode());
            System.out.println(instance2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Serialize Protected Singleton
        try {
            SerializationProtectedSingleton instance1 = SerializationProtectedSingleton.getInstance();
            ObjectOutput out
                    = new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(instance1);
            out.close();

            // deserialize from file to object
            ObjectInput in
                    = new ObjectInputStream(new FileInputStream("file.text"));

            SerializationProtectedSingleton instance2 = (SerializationProtectedSingleton) in.readObject();
            in.close();

            System.out.println(instance1.hashCode());
            System.out.println(instance2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
