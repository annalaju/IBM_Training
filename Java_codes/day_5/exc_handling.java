public class exc_handling {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int c=5;
            int result = a / b;
            int finalResult=a/c;
            System.out.println("Result: " + result);
            System.out.println("Final Result: " + finalResult);

        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        finally {
            System.out.println("Finally block always executes");
        }
    }
}