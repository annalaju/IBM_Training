class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    RunnableDemo(String name) {
        threadName = name;
        //System.out.println("Creating " + threadName);
    }

    public void run() {
    try 
    {
        System.out.println("Running " + threadName );
        if(threadName.equals("Morning")){
            Thread.sleep(2000);
            t.setPriority(Thread.MAX_PRIORITY);
        }
            
        else if(threadName.equals("Afternoon")){
            Thread.sleep(1000);
            t.setPriority(Thread.NORM_PRIORITY);
        }
        else{
            Thread.sleep(1000);
            t.setPriority(Thread.MIN_PRIORITY);
        }
    } catch (InterruptedException e) {}
    }
    public void start() {
        //System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class multithreading{
    public static void main(String args[]) {
        RunnableDemo R1 = new RunnableDemo("Morning");
        R1.start();

        RunnableDemo R2 = new RunnableDemo("Afternoon");
        R2.start();

        RunnableDemo R3 = new RunnableDemo("Evening");
        R3.start();
    }
}