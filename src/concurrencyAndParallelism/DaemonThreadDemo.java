package concurrencyAndParallelism;

public class DaemonThreadDemo {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            System.out.println("Running on "+Thread.currentThread().getName()+"...");
            while (true) {
                System.out.println("in the infinite loop...");
                sleep(1000);
            }
        }, "Maverick-daemon-01");
        thread.setDaemon(true);
        thread.start();
        sleep(3000);
        System.out.println(Thread.currentThread().getName());
        System.out.println("main thread after sleep expired!!");
    }

    public static void sleep(long duration) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
