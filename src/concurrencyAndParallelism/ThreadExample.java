package concurrencyAndParallelism;

/**
 * 1. Ways to create threads
 * 2. assign name to a new thread
 */
public class ThreadExample {

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("running...");
            System.out.println("finished!!");
        }
    }

    public static void main(String[] args) {
        Runnable runnable = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("running on " + threadName + "...");
            System.out.println("finished!!");
        };

        Thread thread = new Thread(runnable, "Thread-mave-1");
        thread.start();

        Thread thread2 = new Thread(runnable, "Thread-mave-2");
        thread2.start();

        Thread thread3 = new Thread(runnable, "Thread-mave-3");
        thread3.start();

    }
}
