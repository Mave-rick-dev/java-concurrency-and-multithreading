package concurrencyAndParallelism;

public class ThreadSleepDemo {
    public static void main(String[] args) {
        var mainThreadName = Thread.currentThread().getName();
        Runnable runnable = () -> {
            var threadName = Thread.currentThread().getName();
            var sleepDuration = 2000L;
            System.out.println("Running on " + threadName);
            try {
                Thread.sleep(sleepDuration);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Completed execution!!");
        };
        System.out.println(mainThreadName);
        Thread thread = new Thread(runnable, "Maverick-1");
        thread.start();
    }
}
