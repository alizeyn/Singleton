package ir.alizeyn;

import java.lang.reflect.Constructor;

public class ReflectionAttack {
    public static void main(String[] args) {
        try {
            MySingleton instance1 = MySingleton.getInstance();
            MySingleton instance2 = null;
            Constructor[] constructors =
                    MySingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                // Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instance2 = (MySingleton) constructor.newInstance();
                break;
            }

            System.out.println(instance1.hashCode());
            System.out.println(instance2.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
