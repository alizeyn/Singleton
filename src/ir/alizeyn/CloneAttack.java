package ir.alizeyn;

public class CloneAttack {

    public static void main(String[] args) {
        try {
            MyCloneableSingleton instance1 = MyCloneableSingleton.getInstance();
            MyCloneableSingleton instance2 = (MyCloneableSingleton) instance1.clone();

            System.out.println(instance1.hashCode());
            System.out.println(instance2.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
