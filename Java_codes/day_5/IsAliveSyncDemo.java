class IsAliveSyncDemo extends Thread {

    public synchronized void run() {
        try {
            System.out.println("Thread is running...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {

        IsAliveSyncDemo t = new IsAliveSyncDemo();

        System.out.println("Before start: " + t.isAlive());

        t.start();

        System.out.println("After start: " + t.isAlive());

        t.join();  // wait for thread to finish

        System.out.println("After completion: " + t.isAlive());
    }
}