class IsAliveDemo extends Thread {

    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread is running...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {

        IsAliveDemo t = new IsAliveDemo();

        System.out.println("Before start: " + t.isAlive());

        t.start();

        System.out.println("After start: " + t.isAlive());

        t.join();  // wait for thread to finish

        System.out.println("After completion: " + t.isAlive());
    }
}