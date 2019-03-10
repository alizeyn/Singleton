package ir.alizeyn;

import java.io.*;
import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) {
        try {
            MySingleton instance1 = MySingleton.getInstance();
            ObjectOutput out
                    = new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(instance1);
            out.close();

            ObjectInput in
                    = new ObjectInputStream(new FileInputStream("file.text"));
            MySingleton instance2 = (MySingleton) in.readObject();
            in.close();

            System.out.println(instance1.hashCode());
            System.out.println(instance2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
