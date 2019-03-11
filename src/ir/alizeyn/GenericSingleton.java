package ir.alizeyn;

import java.util.Base64;

public class GenericSingleton<T> {
    private static UnaryFunction<Object> IDENTIFY_FUNCTION = new UnaryFunction<Object>() {
        @Override
        public Object apply(Object args) {
            return args;
        }
    };

    @SuppressWarnings("unchecked")
    public static <T> UnaryFunction<T> identityFunction() {
        return (UnaryFunction<T>) IDENTIFY_FUNCTION;
    }

    public static void main(String[] args) {
        String[] strings = {"jute", "hemp", "nylon"};
        UnaryFunction<String> sameString = identityFunction();
        for (String s : strings) {
            System.out.println(sameString.apply(s));
        }
        Number[] numbers = {1, 2.0, 3L};
        UnaryFunction<Number> sameNumber = identityFunction();
        for (Number n : numbers) {
            System.out.println(sameNumber.apply(n));
        }
    }
}
