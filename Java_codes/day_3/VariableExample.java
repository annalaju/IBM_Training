public class VariableExample {


    static int staticVar = 0; // static variable
    int normalVar = 0;       // normal variable


    public void increment() {
        staticVar++;
        normalVar++;


        System.out.println("Static Variable: " + staticVar);
        System.out.println("Normal Variable: " + normalVar);
    }


    public static void main(String[] args) {


        VariableExample obj1 = new VariableExample();
        VariableExample obj2 = new VariableExample();


        obj1.increment();
        obj2.increment();


    }
}
