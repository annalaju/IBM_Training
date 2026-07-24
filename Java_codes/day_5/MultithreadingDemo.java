class Thread1 extends Thread {
    public void run() {
        try {
            if (getName().equals("Morning")) {
                Thread.sleep(2000);
            } else if (getName().equals("Afternoon")) {
                Thread.sleep(1000);
            } else {
                Thread.sleep(0);
            }
        } catch (InterruptedException e) {}

        System.out.println("Running " + getName());
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {

        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();
        Thread1 t3 = new Thread1();

        t1.setName("Morning");
        t2.setName("Afternoon");
        t3.setName("Evening");

        t1.start();
        t2.start();
        t3.start();
    }
}