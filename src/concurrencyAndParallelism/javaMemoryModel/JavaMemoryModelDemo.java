package concurrencyAndParallelism.javaMemoryModel;

public class JavaMemoryModelDemo {

    static class MyObject{}
    static class MyRunnable implements Runnable{
        static MyObject myObject = null;

        public MyRunnable(MyObject myObject){
            this.myObject = myObject;
        }
        @Override
        public void run() {
            System.out.println("MyObject: "+myObject);
            var threadName = Thread.currentThread().getName();
            System.out.println("Running on "+threadName+"...");
//            for(int i = 0; i < 11; i++){
//                System.out.println("working...");
//                sleep(1000);
//            }
            System.out.println("Completed!!");
        }
    }

    public static void sleep(long duration){
        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        MyRunnable runnable = new MyRunnable(myObject);
//        MyRunnable runnable1 = new MyRunnable();

        Thread thread = new Thread(runnable, "1st-thread");
        Thread thread1 = new Thread(runnable, "2st-thread");

        thread.start();
        thread1.start();

    }
}
