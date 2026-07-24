class OverloadingDemo {

    // Method 1: two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: two double values
    double add(double a, double b) {
        return a + b;
    }

    // Method 4: int + double
    double add(int a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadingDemo obj = new OverloadingDemo();

        System.out.println("Addition (2 ints): " + obj.add(10, 20));
        System.out.println("Addition (3 ints): " + obj.add(10, 20, 30));
        System.out.println("Addition (2 doubles): " + obj.add(5.5, 4.5));
        System.out.println("Addition (int + double): " + obj.add(10, 5.5));
    }
}