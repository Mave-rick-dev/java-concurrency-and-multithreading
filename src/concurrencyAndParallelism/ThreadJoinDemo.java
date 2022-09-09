package concurrencyAndParallelism;

public class ThreadJoinDemo {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            System.out.println("Running....");
            for (int i = 1; i < 6; i++) {
                System.out.println("working..." + i);
                sleep(1000);
            }
        }, "Maverick-join-01");

        thread.setDaemon(true);
        thread.start();
        // make the main thread wait until the completion of thread: Maverick-join-01
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sleep(long duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
