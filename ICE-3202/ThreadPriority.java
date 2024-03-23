public class ThreadPriority 
{
	public static void main(String[] args)
	{
		Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");
        Thread thread3 = new Thread(new MyRunnable(), "Thread 3");
        
     // Set priorities for threads
        thread1.setPriority(Thread.MIN_PRIORITY); // Lowest priority
        thread2.setPriority(Thread.NORM_PRIORITY); // Normal priority
        thread3.setPriority(Thread.MAX_PRIORITY); // Highest priority

        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();

	}

	static class MyRunnable implements Runnable 
	{
        public void run() 
        {
            System.out.println(Thread.currentThread().getName() + " started with priority " + Thread.currentThread().getPriority());
        }
    }
}
