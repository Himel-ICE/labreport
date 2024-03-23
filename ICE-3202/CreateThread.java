
public class CreateThread extends Thread
{
	private String threadName;
	
	public CreateThread(String name)
	{
		this.threadName = name;
	}
	
	public void run()
	{
		for (int i = 1; i <= 5; i++)
			System.out.println(threadName + ": " + i);
	}

	public static void main(String[] args) {
        CreateThread thread1 = new CreateThread("Thread 1");
        CreateThread thread2 = new CreateThread("Thread 2");
        CreateThread thread3 = new CreateThread("Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
