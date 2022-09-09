package concurrencyAndParallelism;

import java.util.stream.IntStream;

public class ThreadStopDemo {

    static class StoppableRunnable implements Runnable {

        private boolean stopRequested = false;

        public synchronized boolean isStopRequested() {
            return stopRequested;
        }

        public synchronized void setStopRequested(boolean stopRequested) {
            this.stopRequested = stopRequested;
        }

        @Override
        public void run() {
            var threadName = Thread.currentThread().getName();
            System.out.println("Running on thread " + threadName);

            while (!isStopRequested()) {
                sleep(1000);
                System.out.println("Doing something while stop is not requested!!");
            }
            System.out.println("Request to stop thread heard!!! SIRENS!!");
            System.out.println("Task completed!!");
        }


    }

    public static void sleep(long duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        StoppableRunnable stoppableRunnable = new StoppableRunnable();
        Thread thread = new Thread(stoppableRunnable, "Maverick-SR-01");
        thread.start();
        sleep(5000);
        System.out.println("Running on thread " + Thread.currentThread().getName());
        System.out.println("Sending stop request...");
        stoppableRunnable.setStopRequested(true);
        System.out.println("Stop request sent!!");

        // using deprecated method stop()
        Thread threadToStop = new Thread(() -> {
            System.out.println("Running...");
            sleep(3000);
            IntStream.of(10).forEach(System.out::println);
            System.out.println("Stopped!!");
        });
        threadToStop.start();
        sleep(1000);
        threadToStop.stop();
    }
}
