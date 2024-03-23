public class YieldStopSleep extends Thread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupt thread2
        System.out.println("Interrupting Thread 2");
        thread2.interrupt();

        // Yield main thread
        System.out.println("Main thread yielding");
        Thread.yield();

        // Stop thread1
        System.out.println("Stopping Thread 1");
        thread1.stop();
    }

    static class MyRunnable implements Runnable {
        public void run() {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                    Thread.sleep(1000); // Sleep for 1 second
                }
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted.");
            }
        }
    }
}
