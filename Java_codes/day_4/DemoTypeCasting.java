public class DemoTypeCasting {
    public static void main(String[] args) {

        // Implicit Type Casting (Widening)
        int a = 10;
        double b = a;   // int → double
        System.out.println("Implicit Casting:");
        System.out.println("int value: " + a);
        System.out.println("double value: " + b);

        // Explicit Type Casting (Narrowing)
        double x = 9.78;
        int y = (int) x;   // double → int
        System.out.println("\nExplicit Casting:");
        System.out.println("double value: " + x);
        System.out.println("int value: " + y);
    }
}