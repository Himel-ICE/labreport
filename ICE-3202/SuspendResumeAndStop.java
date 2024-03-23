
public class SuspendResumeAndStop extends Thread
{
	private volatile boolean suspended = false;
    private volatile boolean stopped = false;
    
    public SuspendResumeAndStop(String name)
    {
    	super(name);
    }
    
    public void run()
    {
    	System.out.println(getName() + " started.");
    	 try {
             for (int i = 1; i <= 10; i++) {
                 System.out.println(getName() + ": " + i);
                 Thread.sleep(500);
                 synchronized (this) {
                     while (suspended) {
                         wait();
                     }
                 }
                 if (stopped) {
                     break;
                 }
             }
         } catch (InterruptedException e) {
             System.out.println(getName() + " interrupted.");
         }
    	 System.out.println(getName() + " exiting.");
    }
    
 // Method to suspend the thread
    public synchronized void suspendThread() {
        suspended = true;
    }

    // Method to resume the suspended thread
    public synchronized void resumeThread() {
        suspended = false;
        notify();
    }

    // Method to stop the thread
    public synchronized void stopThread() {
        stopped = true;
        suspended = false;
        notify();
    }
    
    public static void main(String[] args) throws InterruptedException {
    	SuspendResumeAndStop thread = new SuspendResumeAndStop("Thread");

        // Start the thread
        thread.start();

        // Suspend the thread for 2 seconds
        Thread.sleep(2000);
        thread.suspendThread();
        System.out.println("Thread suspended for 2 seconds.");

        // Resume the suspended thread
        Thread.sleep(2000);
        thread.resumeThread();
        System.out.println("Thread resumed for 2 seconds.");

        // Stop the thread after 2 more seconds
        Thread.sleep(2000);
        thread.stopThread();
        System.out.println("Thread stopped.");
    }

}
