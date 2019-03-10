package ir.alizeyn;

public class CloneableSuperClass implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("ಠᴗಠ");
        return super.clone();
    }
}
