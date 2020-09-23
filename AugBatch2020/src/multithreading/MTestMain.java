package multithreading;

public class MTestMain {

	public static void main(String[] args) {
		
		MTest thread1 = new MTest();
		thread1.setName("Thread 1");
		thread1.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" getting executed");
		}

	}

}
