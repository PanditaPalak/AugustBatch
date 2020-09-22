package multithreading;

public class TestMain {

	public static void main(String[] args) {
		
		Test thread1 = new Test();
		//thread1.setName("Thread 1");
		thread1.start();
		
		Test thread2 = new Test();
	//	thread2.setName("Thread 2");
		thread2.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("main thread");
		}
		
		

	}

}
