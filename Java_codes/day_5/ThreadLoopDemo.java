class ThreadLoopDemo extends Thread {

    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName());
        
        // print stack trace
        Thread.dumpStack();
    }

    public static void main(String[] args) {
        
        for (int i = 1; i <= 20; i++) {
            ThreadLoopDemo t = new ThreadLoopDemo();
            t.setName("T" + i);
            t.start();
        }
    }
}