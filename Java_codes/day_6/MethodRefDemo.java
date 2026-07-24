import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefDemo {
    public static void main(String[] args) {

        // 1. Static method reference
        BiFunction<Integer, Integer, Integer> maxFunc = Math::max;
        System.out.println("Max value: " + maxFunc.apply(10, 20));

        // 2. Instance method reference
        Function<String, String> lowerFunc = String::toLowerCase;
        System.out.println("Lowercase: " + lowerFunc.apply("HELLO"));

        // 3. Constructor reference
        Supplier<ArrayList<String>> listSupplier = ArrayList::new;
        ArrayList<String> list = listSupplier.get();
        list.add("Java");
        list.add("Python");
        System.out.println("List: " + list);
    }
}