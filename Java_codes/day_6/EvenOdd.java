import java.util.ArrayList;

public class EvenOdd {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(15);
        numbers.add(22);
        numbers.add(33);
        numbers.add(40);

        numbers.forEach(n -> System.out.println(n+(n % 2 == 0 ? " is Even" :" is Odd")));
    }
}