interface Operations {
    void calculate(int a, int b);
}

public class Calculator {
    public static void main(String[] args) {

        Operations add = (a, b) ->
            System.out.println("Addition = " + (a + b));

        Operations sub = (a, b) ->
            System.out.println("Subtraction = " + (a - b));

        Operations mul= (a, b) ->
            System.out.println("Multiplication = " + (a * b));

        Operations div = (a, b) ->
            System.out.println("Division = " + (a / b));
            
        add.calculate(10, 20);
        sub.calculate(10, 20);
        mul.calculate(10, 20);
        div.calculate(10, 20);
    }
}