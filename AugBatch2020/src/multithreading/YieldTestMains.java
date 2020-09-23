package multithreading;

public class YieldTestMains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YieldTest thread1 = new YieldTest();
		thread1.setName("Thread1 ");
		thread1.start();

		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" getting executed");
			
		}
	}

}
