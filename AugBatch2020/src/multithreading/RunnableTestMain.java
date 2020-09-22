package multithreading;

public class RunnableTestMain {

	public static void main(String[] args) {
		
		TestRunnable runObject = new TestRunnable();
	
		
		Thread thread1 = new Thread(runObject);	
		
	    thread1.setName("Thread 1");
	    thread1.start();
	    
	    for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
		}
	}

}
